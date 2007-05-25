/*******************************************************************************
 * Copyright (c) 2004, 2005 Sybase, Inc. and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sybase, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.sqltools.routineeditor.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.datatools.sqltools.core.profile.SQLToolsProfileListenersManager;
import org.eclipse.datatools.sqltools.routineeditor.launching.SQLToolsLaunchProfileListener;
import org.eclipse.datatools.sqltools.routineeditor.parameter.internal.LaunchConfigurationParamsHistoryListener;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class RoutineEditorActivator extends AbstractUIPlugin {

	private static final int INTERNAL_ERROR = 0;
	public static String PLUGIN_ID = "org.eclipse.datatools.sqltools.routineeditor";
	//The shared instance.
	private static RoutineEditorActivator plugin;
	private SQLToolsLaunchProfileListener _toolsLaunchProfileListener;
	
	/**
	 * The constructor.
	 */
	public RoutineEditorActivator() {
		plugin = this;
	}

    /**
     * Returns the standard display to be used. The method first checks, if the thread calling this method has an
     * associated dispaly. If so, this display is returned. Otherwise the method returns the default display.
     */
    public static Display getStandardDisplay()
    {
        Display display;
        display = Display.getCurrent();
        if (display == null)
        display = Display.getDefault();
        return display;
    }
    
	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
        SQLToolsProfileListenersManager pManager = SQLToolsProfileListenersManager.getInstance();
        _toolsLaunchProfileListener = new SQLToolsLaunchProfileListener();
        pManager.addProfileListener(_toolsLaunchProfileListener);
        DebugPlugin.getDefault().getLaunchManager().addLaunchConfigurationListener(LaunchConfigurationParamsHistoryListener.getInstance());
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
        SQLToolsProfileListenersManager pManager = SQLToolsProfileListenersManager.getInstance();
        pManager.removeProfileListener(_toolsLaunchProfileListener);
        super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 *
	 * @return the shared instance.
	 */
	public static RoutineEditorActivator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.datatools.sqltools.routineeditor", path);
	}
	
 	/**
 	 * Logs runtime status.
 	 * 
 	 * @param status Runtime status.
 	 */
 	public void log(IStatus status) {
 		getLog().log(status);
 	}

 	/**
 	 * Logs error message.
 	 * 
 	 * @param message Error message.
 	 */
 	public void log(String message) {
 		log(createErrorStatus(message));
 	}

 	/**
 	 * Logs and exception.
 	 * 
 	 * @param e Exception.
 	 */
 	public void log(Throwable e) {
 		log(createErrorStatus(e));
 	}

 	public IStatus createErrorStatus(String message) {
 		return new Status(IStatus.ERROR, getBundle().getSymbolicName(),
 				INTERNAL_ERROR, message, null);
 	}

 	public IStatus createErrorStatus(Throwable e) {
 		return new Status(IStatus.ERROR, getBundle().getSymbolicName(),
 				INTERNAL_ERROR, Messages.plugin_internal_error, e); 
 	}

    public IStatus createErrorStatus(String message, Throwable e) {
        return new Status(IStatus.ERROR, getBundle().getSymbolicName(),
                INTERNAL_ERROR, message, e);
    }
    
    /**
     * Logs an error message with an exception.
     * 
     * @param e Exception.
     */
    public void log(String message, Throwable e) {
        log(createErrorStatus(message, e));
    }

}
