/*
 *************************************************************************
 * Copyright (c) 2006, 2007 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation - initial API and implementation
 *  
 *************************************************************************
 */

package org.eclipse.datatools.connectivity.oda.design.internal.designsession;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.datatools.connectivity.oda.design.DataSourceDesign;
import org.eclipse.datatools.connectivity.oda.design.DesignFactory;
import org.eclipse.datatools.connectivity.oda.design.DesignSessionRequest;
import org.eclipse.datatools.connectivity.oda.design.DesignerState;
import org.eclipse.datatools.connectivity.oda.design.OdaDesignSession;
import org.eclipse.datatools.connectivity.oda.design.internal.ui.DesignerUtil;
import org.eclipse.datatools.connectivity.oda.design.internal.ui.OdaProfileUIExplorer;
import org.eclipse.datatools.connectivity.oda.design.internal.ui.profile.ProfileSelectionEditorPage;
import org.eclipse.datatools.connectivity.oda.design.internal.ui.profile.ProfileSelectionWizard;
import org.eclipse.datatools.connectivity.oda.design.internal.ui.profile.ProfileSelectionWizardPage;
import org.eclipse.datatools.connectivity.oda.design.ui.nls.Messages;
import org.eclipse.datatools.connectivity.oda.design.ui.wizards.DataSourceEditorPage;
import org.eclipse.datatools.connectivity.oda.design.ui.wizards.NewDataSourceWizard;
import org.eclipse.datatools.connectivity.oda.profile.OdaProfileExplorer;
import org.eclipse.datatools.connectivity.ui.wizards.NewConnectionProfileWizardPage;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.dialogs.PropertyPage;

/**
 * Base class implementation of an UI data source design session 
 * for use by an ODA host designer to interact and communicate 
 * with custom ODA UI extensions to create or edit 
 * an extended ODA data source design instance.
 */
public class DataSourceDesignSessionBase
{
    private String m_odaDataSourceId;
    private OdaDesignSession m_designSession;
    private NewDataSourceWizard m_dataSourceWizard;
    private ProfileReferenceBase m_wizardProfileRef;
    private DataSourceEditorPage m_editorPage;
    private boolean m_inCreateMode = true;  // default; gets changed by edit session initialization
    
    private static final boolean USE_PROFILE_PAGE_DEFAULT_SETTING = false;
    private boolean m_useProfileSelectionPage = USE_PROFILE_PAGE_DEFAULT_SETTING;
    private ProfileSelectionWizard m_profileSelectionWizard;
    private ProfileSelectionEditorPage m_profileEditorPage;
    
    /** Not allowed to instantiate the class directly;
     *  must start a design session using a static start method
     */  
    protected DataSourceDesignSessionBase( String odaDataSourceId )
    {
        assert( odaDataSourceId != null && odaDataSourceId.length() > 0 );
        m_odaDataSourceId = odaDataSourceId;
    }
    
    protected DataSourceDesignSessionBase()
    {
        // no specific data source type specified, use profile selection page to select one
        m_useProfileSelectionPage = true;
    }
   
    /**
     * Restarts the design session to create a new 
     * data source design instance with the given name
     * for the given ODA data source type, and initializes 
     * with the properties specified in the given profile instance.
     * <br>Restarting a design session on the same 
     * ODA data source type would preserve any
     * user edits made on the session's custom wizard page.
     * @param odaDataSourceId
     * @param newDataSourceName
     * @param profileRef
     * @param request
     * @throws OdaException
     * @see #startNewDesign(String, String, ProfileReferenceBase, DesignSessionRequest)
     */
    protected void restartNewDesign( String odaDataSourceId,
                                String newDataSourceName,
                                ProfileReferenceBase profileRef )
        throws OdaException
    {
        // restarting with a different oda data source type,
        // reset the session's context and wizard 
        if( m_odaDataSourceId == null ||
            ! m_odaDataSourceId.equals( odaDataSourceId ) )
        {
            m_odaDataSourceId = odaDataSourceId;
            if( m_dataSourceWizard != null )
                m_dataSourceWizard.dispose();
            m_dataSourceWizard = null;
        }

        // initialize the session with given attributes
        initNewDesign( newDataSourceName, profileRef );
    }
    
    /**
     * Initializes this design session with given attributes.
     * @param newDataSourceName
     * @param profileRef
     * @param request
     * @throws OdaException
     */
    protected void initNewDesign( String newDataSourceName,
                                ProfileReferenceBase profileRef )
        throws OdaException
    {
        NewDataSourceWizard wizard = getExtendedWizard();
        
        // a new data source session has no previous designer state;
        // no need to be concerned with passing designer state to 
        // a new data source wizard
        
        // verifies that the given profile does exist in cache;
        // if wizard was initialize w/ same profileRef,
        // do not change any user edits on wizard page
        Properties profileProps = null;
        String profileDesc = null;
        if( profileRef != null && 
            ! profileRef.equals( m_wizardProfileRef ) )
        {
            profileProps = getProfileProperties( profileRef );
            profileDesc = profileRef.getDescription();
            
            if( newDataSourceName == null || newDataSourceName.length() == 0 )
                newDataSourceName = profileRef.getName();
        }
        
        // initialize wizard with given name and properties, if any;
        // and reset any previously linked profile
        initWizard( wizard, newDataSourceName, profileDesc, profileProps );
        m_wizardProfileRef = profileRef;

        if( profileRef != null && profileRef.maintainExternalLink() )
            wizard.setLinkedProfile( profileRef.getName(), profileRef.getStorageFile() );
    }

    protected void initEditDesign( DesignSessionRequest request,
                                    DataSourceEditorPage editorPage )
        throws OdaException
    {
        m_inCreateMode = false;
        if( editorPage == null )
            editorPage = getExtendedEditorPage();
        
        // create a top-level OdaDesignSession with given request
        OdaDesignSession odaSession = 
            DesignFactory.eINSTANCE.createOdaDesignSession();
        odaSession.setRequest( request );
        
        // Update the editor page's property values with those found
        // in the given request's data source design; 
        // also includes any additional state specified in
        // the design session request
        editorPage.initEditSession( odaSession );

        if( m_editorPage != editorPage )
        {
            // TODO - log warning if m_editorPage != null
            m_editorPage = editorPage;
        }

        m_designSession = odaSession;   // hold on till finish editing       
        
        // initialize profile selection editor page, just in case it gets used;
        // getter expects m_designSession is already initialized
        getProfileSelectionEditorPage().initEditSession( m_designSession );
    }

    /**
     * Returns the session request that has started
     * this design session.  May return null if none
     * was used to start this design session.
     * @return  the design session request, which may specify
     *          the original data source design to edit
     */
    protected DesignSessionRequest getRequest()
    {
        if( m_designSession == null )
            return null;
        return m_designSession.getRequest();
    }
    
    /**
     * Indicates whether this design session is for creating a new design.
     */
    protected boolean isInCreateMode()
    {
        return m_inCreateMode;
    }
    
    /**
     * Indicates whether this design session is for editing an existing design.
     */
    protected boolean isInEditMode()
    {
        return ! m_inCreateMode;
    }

    /**
     * Performs finish on this design session to
     * create or edit its data source design.  This then 
     * gathers the data source definition collected in custom UI designer,
     * and maps into a session response with a new or updated
     * data source design instance.
     * <br>This method must be called only after the corresponding 
     * wizard or editor has performed finish.
     * <br>Returns a completed design session with a 
     * session response that contains a new or updated 
     * data source design instance, and the designer state. 
     * @return  a completed ODA design with the session response
     *          and the original request, if any.
     */
    protected OdaDesignSession finish() throws OdaException
    {
        OdaDesignSession finishedSession;
        if( m_inCreateMode )
            finishedSession = finishNewDataSource();
        else    // in an edit session
            finishedSession = finishEditDataSource();
        
        // successfully finished
        m_designSession = null;     // reset to complete session
        disposePages();
        return finishedSession;
    }
    
    /**
     * Performs cancel on this design session.
     * The design session is then cancelled and contains
     * session response with a user_cancelled state.
     * @return  the completed design session containing a
     *          session response with a user_cancelled state
     */
    protected OdaDesignSession cancel()
    {
        if( m_designSession == null )
        {
            // currently in a session to create a new design instance;
            // create a design session object with an 
            // empty DataAccessDesign in the request
            m_designSession = 
                DesignFactory.eINSTANCE.createRequestDesignSession( null );
        }

        // sets a response with cancel status
        m_designSession.setResponseInCancelledState();

        OdaDesignSession cancelledSession = m_designSession;
        m_designSession = null;     // reset to complete session
        disposePages();
        
        return cancelledSession;
    }

    /**
     * Dispose any current pages of the session.
     * Ensures they would not be re-used after the session ends.
     */
    private void disposePages()
    {
        if( m_dataSourceWizard != null )
        {
            m_dataSourceWizard.dispose();
            m_dataSourceWizard = null;
        }
        if( m_profileSelectionWizard != null )
        {
            m_profileSelectionWizard.dispose();
            m_profileSelectionWizard = null;
        }
        
        if( m_editorPage != null )
        {
            m_editorPage.dispose();
            m_editorPage = null;
        }
        if( m_profileEditorPage != null )
        {
            m_profileEditorPage.dispose();
            m_profileEditorPage = null;
        }

        m_wizardProfileRef = null;
        m_useProfileSelectionPage = USE_PROFILE_PAGE_DEFAULT_SETTING;   // reset to default setting
    }

    /**
     * Specifies whether the design session should provide a connection profile
     * selection UI page.
     */
    protected void setUseProfileSelectionPage( boolean use )
    {
        m_useProfileSelectionPage = use;
    }

    /**
     * Passes the provided name validator to the wizard page that takes
     * user input of a design name.
     * @param validator
     */
    protected void setDesignNameValidator( DesignNameValidatorBase validator )
    {
        if( m_inCreateMode )    // in create new design mode
            ((ProfileSelectionWizardPage) getProfileSelectionWizard().getStartingPage() )
                .setDesignNameValidator( validator );
    }
    
    /**
     * Returns an ODA wizard for use within this design session
     * to create a new, extended ODA data source design instance.
     * @return  a wizard instance to embed in a wizard dialog
     *          for use within this started design session
     * @throws OdaException
     */
    protected IWizard getNewWizard() throws OdaException
    {
        if( hasSelectedOdaDataSource() )
            return getExtendedWizard();
        
        // no specific oda data source specified yet,
        // need to use a connection proifle wizard for user to select one
        return getProfileSelectionWizard();
    }

    /** 
     * Returns a customized starting wizard page
     * for use within this design session to create
     * a new, extended ODA data source design instance.
     * @return  a customized wizard page to add in a wizard
     *          for use within this started design session
     * @throws OdaException
     */
    protected IWizardPage getWizardStartingPage() throws OdaException
    {
        /* 
         * has selected the use of a profile selection page as starting page;
         * or no specific oda data source specified yet,
         * create a connection profile wizard and its starting page for user to select one.
         */
        if( m_useProfileSelectionPage || ! hasSelectedOdaDataSource() )
            return getProfileSelectionWizard().getStartingPage();
        
        return getExtendedWizard().getCustomStartingPage();        
    }
    
    private ProfileSelectionWizard getProfileSelectionWizard()
    {
        if( m_profileSelectionWizard == null )
            m_profileSelectionWizard = new ProfileSelectionWizard( this );
        return m_profileSelectionWizard;
    }
    
    /**
     * For use by internal packages only.
     */
    public IWizardPage getNewCustomOdaStartingPage(
                            String odaDataSourceId,
                            String newDataSourceName,
                            ProfileReferenceBase profileRef )
        throws OdaException
    {
        restartNewDesign( odaDataSourceId, newDataSourceName, profileRef );
        return hasSelectedOdaDataSource() ?
                getExtendedWizard().getCustomStartingPage() : null;
    }
    
    /**
     * Returns an ODA wizard extended from the base wizard 
     * provided by the ODA Designer UI framework.
     * @return  a NewDataSourceWizard instance
     * @throws OdaException
     */
    protected NewDataSourceWizard getExtendedWizard() 
        throws OdaException
    {
        if( m_dataSourceWizard == null )
        {
            assert( hasSelectedOdaDataSource() );

            m_dataSourceWizard = OdaProfileUIExplorer.getInstance()
                    .getNewDataSourceWizardByType( m_odaDataSourceId );

            // if data source extension has not specified newWizard for 
            // connectionProfile extension point, use default base class
            if( m_dataSourceWizard == null )    
                m_dataSourceWizard = new NewDataSourceWizard( m_odaDataSourceId );
        }
        return m_dataSourceWizard;
    }

    /**
     * Initialize the given wizard, and process its
     * profile name page with automatically assigned attributes.
     * Adds pages to the given wizard if it has not been 
     * initialized with pages.
     * @param wizard    associated data source wizard
     * @param aDataSourceName   unique name to assign to new data source instance
     * @param aDataSourceDesc   optional profile description; may be null
     * @param dataSourceProps   initialized properties for use by
     *                          wizard; may be null
     */
    private void initWizard( NewDataSourceWizard wizard, 
                             String aDataSourceName,
                             String aDataSourceDesc,
                             Properties dataSourceProps )
        throws OdaException
    {
        wizard.setInOdaDesignSession( true );
        
        wizard.addPages();
        
        if( wizard.getStartingPage() instanceof NewConnectionProfileWizardPage )
        {
            if( aDataSourceName == null || aDataSourceName.length() == 0 )
                throw new OdaException( Messages.designSession_invalidArgument );
                
            // process the given wizard's profile name page,
            // with automatically assigned attributes.
            NewConnectionProfileWizardPage profileNamePage =
                (NewConnectionProfileWizardPage) wizard.getStartingPage();
            
            profileNamePage.setProfileName( aDataSourceName );
            profileNamePage.setProfileDescription( aDataSourceDesc );
            profileNamePage.setPageComplete( true );
        }
        
        // pass given properties to wizard for initialization;
        // if none is specified, keep wizard's existing properties
        if( dataSourceProps != null &&
            ! dataSourceProps.isEmpty() )
        {
            wizard.setInitialProperties( dataSourceProps );
        }
    }

    /**
     * Returns the editor page that updates the selection of a connection profile.
     */
    protected ProfileSelectionEditorPage getProfileSelectionEditorPage() throws OdaException
    {
        if( m_profileEditorPage == null )
        {
            // validate if a design session was successfully initialized earlier
            if( m_designSession == null )
                throw new OdaException( Messages.common_notInDesignSession );
            
            m_profileEditorPage = new ProfileSelectionEditorPage();
       }
        
        return m_profileEditorPage;
    }
    
    /**
     * Returns a customized editor page
     * for use within a design session to edit 
     * an extended ODA data source design instance.
     * @return  a customized property page
     * @throws OdaException
     */
    protected PropertyPage getEditorPage() throws OdaException
    {
        return getAdaptableEditorPage();
    }
    
    /**
     * Returns a customized editor page's adaptable element 
     * that represents the
     * the extended ODA data source design instance that is
     * being edited.
     * @return
     */
    protected IAdaptable getEditPropertyPageElement()
        throws OdaException
    {
        // validate if start was successfully called earlier
        if( m_designSession == null )
            throw new OdaException( Messages.common_notInDesignSession );
            
        return DesignerUtil.getAdaptableDataSourceDesign( m_designSession );
    }
    
    protected DataSourceEditorPage getAdaptableEditorPage() throws OdaException
    {
        DataSourceEditorPage editorPage = getExtendedEditorPage();
        if( editorPage.getElement() == null )
            editorPage.setElement( getEditPropertyPageElement() );
        return editorPage;
    }
    
    /**
     * Returns an ODA data source editor page  
     * provided by the ODA Designer UI framework that
     * extends from the base DataSourceEditorPage property page.
     * @return
     * @throws OdaException
     */
    protected DataSourceEditorPage getExtendedEditorPage() throws OdaException
    {
        if( m_editorPage == null )
        {
            m_editorPage = OdaProfileUIExplorer.getInstance()
                    .getDataSourceEditorPage( m_odaDataSourceId );
            if( m_editorPage == null )  // ODA extension did not implement editor page
            {
                throw new OdaException( Messages.extension_missingPropertyPage );
            }
        }
        return m_editorPage;
    }
    
    private Properties getProfileProperties( ProfileReferenceBase profileRef )
        throws OdaException
    {
        Properties profileProps;
        try
        {
            IConnectionProfile profile = profileRef.getProfileInstance();
            if( ! m_odaDataSourceId.equalsIgnoreCase( 
                    profile.getProviderId() ))
                throw new IllegalArgumentException();
            
            profileProps = profile.getBaseProperties();
        }
        catch( Exception ex )
        {
            throw new OdaException( ex );
        }
        return profileProps;
    }

    /**
     * Performs finish on the current ODA design session to
     * create a new data source design.  This 
     * gathers the data source definition collected in UI designer
     * and maps into an OdaDesignSession with a response.
     * <br>This method must be called only after the corresponding 
     * wizard or editor has performed finish.
     * @return  the completed design session containing the
     *          new data source design within the session response
     */
    protected OdaDesignSession finishNewDataSource() throws OdaException
    {
        NewDataSourceWizard wizard = null;
        try
        {
            wizard = getExtendedWizard();
        }
        catch( OdaException e )
        {
            // TODO - error logging
            // wizard session has error
            e.printStackTrace();
        }
        
        // up to wizard to validate whether it has a valid design to return
        DataSourceDesign newDataSourceDesign = 
            ( wizard != null ) ? 
                    wizard.getDataSourceDesign() : null;
        return createResponseDesignSession( newDataSourceDesign, wizard );
    }

    /**
     * Performs finish on the current ODA design session to
     * create a new data source design from a specified connection profile.
     * @param newDataSourceName unique name to assign to the new data source instance;
     *                          may be null or empty, in which case the profile name
     *                          is applied
     * @param profileRef        reference to an existing profile instance
     *                          kept in an external profile storage file
     * @return  the completed design session containing the
     *          new data source design within the session response
     * @throws OdaException
     */
    protected OdaDesignSession finishNewDesignFromProfile(
                                    String newDataSourceName,
                                    ProfileReferenceBase profileRef )
        throws OdaException
    {
        DataSourceDesign newDataSourceDesign =
            finishDataSourceDesignFromProfile( newDataSourceName, profileRef );
        return createResponseDesignSession( newDataSourceDesign, getExtendedWizard() );        
    }
    
    private DataSourceDesign finishDataSourceDesignFromProfile(
                                    String newDataSourceName,
                                    ProfileReferenceBase profileRef )
        throws OdaException
    {
        // since wizard page is not added, initiates
        // finish on wizard's design session in lieu of page's performFinish
        NewDataSourceWizard wizard = getExtendedWizard();
        DataSourceDesign newDataSourceDesign =
                        wizard.finishDataSourceDesign();
        
        // applies the profile identifers to the new data source design
        if( newDataSourceDesign != null )
        {
            assert( profileRef != null );
            assert( profileRef.getProfileInstance() != null );
            
            if( newDataSourceName == null || newDataSourceName.length() == 0 )
                newDataSourceName = profileRef.getName();
            newDataSourceDesign.setName( newDataSourceName );
            newDataSourceDesign.setDisplayName( profileRef.getDescription() );
        }
        
        return newDataSourceDesign;
    }
    
    /**
     * Creates a completed design session containing the
     * specified new data source design within the session response.
     * Also includes any custom designer state
     * that may be optionally set by an extended wizard and its
     * custom pages.
     * @param newDataSourceDesign
     * @param wizard
     * @return
     */
    protected static OdaDesignSession createResponseDesignSession( 
            DataSourceDesign newDataSourceDesign,
            NewDataSourceWizard wizard )
    {
        boolean isSessionOk = ( newDataSourceDesign != null );
        OdaDesignSession responseSession =
            DesignFactory.eINSTANCE.createResponseDesignSession( 
                isSessionOk, newDataSourceDesign );
        
        // get designerState, if set by extended class, 
        // and assign to session response
        if( wizard != null )
        {
            DesignerState customState = wizard.getResponseDesignerState();
            if( customState != null )
                responseSession.getResponse().setDesignerState( customState );
        }
        
        return responseSession;
    }
    
    /**
     * Performs finish on the current ODA design session to
     * edit a data source design.  
     * <br>This method must be called only after performOk on
     * the editor page is done.
     * @return  the completed design session containing the
     *          edited data source design within the session response
     * @throws OdaException
     */
    protected OdaDesignSession finishEditDataSource()
        throws OdaException
    {
        assert( m_designSession != null );
        
        // next collect values from the custom editor page 
        DataSourceEditorPage editorPage = null;
        try
        {
            editorPage = getExtendedEditorPage();
        }
        catch( OdaException ex )
        {
            // TODO - log error
            throw ex;    // editor page session has error
        }
        
        assert( editorPage != null );        
        OdaDesignSession responseSession = null;
        if( editorPage.isInOdaDesignSession() )
            responseSession = editorPage.getEditSessionResponse();

        // next get an updated DataSourceDesign from profile selection page
        if( m_useProfileSelectionPage )
        {
            // copy selected profile attributes to the custom page response's design
            ProfileSelectionEditorPage profilePage = getProfileSelectionEditorPage();
            if( profilePage.isInOdaDesignSession() )
                responseSession = profilePage.getEditSessionResponse();
        }
        
        return responseSession;
    }
    
    private boolean hasSelectedOdaDataSource()
    {
        return( m_odaDataSourceId != null && m_odaDataSourceId.length() > 0 );
    }
    
    /**
     * Represents the reference information of an external
     * connection profile.
     */
    public static class ProfileReferenceBase
    {
        private String m_instanceId;
        private String m_instanceName;
        private File m_storageFile; 
        private boolean m_maintainLink;
        
        private IConnectionProfile m_profileInstance;
        
        /**
         * Constructor.
         * @param profileInstanceId profile instance id; such as the
         *              instance id returned by the 
         *              <code>DesignSessionUtil.getProfileIdentifiers</code> method
         * @param storageFile   a file that stores profile instances;
         *              may be null, which means to use the
         *              default DTP profiles storage file
         * @param maintainExternalLink  "true" indicates to maintain a link to the 
         *              given profile instance and storageFile, and applies its 
         *              latest properties values at run-time.
         *              "false" indicates to work with a copy of the current properties
         *              specified in the profile instance; any future
         *              changes to the profile instance is not applied to
         *              the data source design.
         */
        public ProfileReferenceBase( String profileInstanceId,
                                File storageFile, 
                                boolean maintainExternalLink )
        {
            m_instanceId = profileInstanceId;
            m_storageFile = storageFile;
            m_maintainLink = maintainExternalLink;
        }

        /**
         * Constructor.
         * @param profileInstanceName   the name of a profile instance that
         *              uniquely identifies a profile within a profile storage file
         * @param storageFilePath   the file pathname of a profile storage file
         * @param maintainExternalLink  "true" indicates to maintain a link to the 
         *              given profile instance name and storageFilePath, and applies its 
         *              latest properties values at run-time.
         *              "false" indicates to work with a copy of the current properties
         *              specified in the profile instance; any future
         *              changes to the profile instance is not applied to
         *              the data source design.
         */
        public ProfileReferenceBase( String profileInstanceName,
                String storageFilePath, 
                boolean maintainExternalLink )
        {
            m_instanceName = profileInstanceName;
            if( storageFilePath != null )
                m_storageFile = new File( storageFilePath );
            m_maintainLink = maintainExternalLink;
        }

        public String getInstanceId()
        {
            if( m_instanceId == null && m_instanceName != null )
            {
                // look up the id from named instance
                IConnectionProfile profile = getProfileInstance();
                if( profile != null )
                    m_instanceId = profile.getInstanceID();               
            }
            return m_instanceId;
        }

        public String getName()
        {
            if( m_instanceName == null && m_instanceId != null )
            {
                // look up the name from instance
                IConnectionProfile profile = getProfileInstance();
                if( profile != null )
                    m_instanceName = profile.getName();
            }
            return m_instanceName;
        }

        public String getDescription()
        {
            IConnectionProfile profileInstance = getProfileInstance();
            return ( profileInstance != null ) ?
                    profileInstance.getDescription() : null;
        }
       
        public File getStorageFile()
        {
            return m_storageFile;
        }
        
        public String getStorageFilePath()
        {
            try
            {
                return FileLocator.toFileURL( getStorageFile().toURI().toURL() )
                        .getPath();
            }
            catch( MalformedURLException e )
            {
                // ignore invalid file
            }
            catch( IOException e )
            {
                // ignore invalid file
            }
            
            // return file's absolute path instead
            return getStorageFile() != null ?
                    getStorageFile().getAbsolutePath() : null;
        }
        
        public boolean maintainExternalLink()
        {
            return m_maintainLink;
        }
        
        public IConnectionProfile getProfileInstance()
        {
            if( m_profileInstance != null )
                return m_profileInstance;
            
            // first try find by instance id, if available
            if( m_instanceId != null )
                m_profileInstance = getInstanceById();

            // not found yet, next try find by instance name, if available
            if( m_profileInstance == null && m_instanceName != null )
                m_profileInstance = getInstanceByName();

            return m_profileInstance;
        }
        
        private IConnectionProfile getInstanceById()
        {
            return OdaProfileExplorer.getInstance().
                        getProfile( m_instanceId );
        }
        
        private IConnectionProfile getInstanceByName()
        {
            IConnectionProfile profileInstance = null;
            try
            {
                profileInstance =
                    OdaProfileExplorer.getInstance().getProfileByName( 
                        m_instanceName, m_storageFile );    // use default store if null is specified
            }
            catch( OdaException e )
            {
                // TODO log warning
                e.printStackTrace();
            } 
            return profileInstance;
        }
        
        public boolean equals( ProfileReferenceBase aProfileRef )
        {
            if( aProfileRef == null )
                return false;
            
            if( this.m_maintainLink != aProfileRef.m_maintainLink )
                return false;
            
            if( this.m_storageFile != null &&
                ! this.m_storageFile.equals( aProfileRef.m_storageFile ) )
                return false;
            if( m_storageFile == null && aProfileRef.m_storageFile != null )
                return false;
           
            // exact same non-null id is same profile instance; no need to check for name
           if( this.m_instanceId != null && 
               this.m_instanceId.equals( aProfileRef.m_instanceId ) )
                return true;  
           
           if( this.m_instanceId != null && 
               ! this.m_instanceId.equals( aProfileRef.m_instanceId ) )
                   return false;
           if( m_instanceId == null && aProfileRef.m_instanceId != null )
                return false;
 
            if( this.m_instanceName != null && 
                ! this.m_instanceName.equals( aProfileRef.m_instanceName ) )
                return false;
            if( m_instanceName == null && aProfileRef.m_instanceName != null )
                return false;
            
            return true;
        }
    }

	/**
     * The base interface for call-back to an ODA design name validator
     * provided by an ODA consumer application
     * to validate the name of a data source design defined in the
     * ODA connection profile selection page.
     * @since 3.0.4
	 */	
    public interface DesignNameValidatorBase
    {
        abstract boolean isValid( String designName ) throws OdaException;
    }

}
