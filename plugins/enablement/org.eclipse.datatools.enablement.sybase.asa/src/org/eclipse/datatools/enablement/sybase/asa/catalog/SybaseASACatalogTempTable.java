/*******************************************************************************
 * Copyright (c) 2008 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Sybase - initial API and implementation
 ******************************************************************************/
package org.eclipse.datatools.enablement.sybase.asa.catalog;

import java.lang.ref.SoftReference;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogObject;
import org.eclipse.datatools.connectivity.sqm.core.rte.RefreshManager;
import org.eclipse.datatools.enablement.sybase.asa.base.catalog.SybaseASACatalogBaseColumn.ISybaseASACatalogBaseColumnOwner;
import org.eclipse.datatools.enablement.sybase.asa.baseloaders.AuthorizedObjectPrivilegeASALoader;
import org.eclipse.datatools.enablement.sybase.asa.baseloaders.SybaseASABaseTempTableLoader;
import org.eclipse.datatools.enablement.sybase.asa.baseloaders.TableASABaseLoader.IASABaseLoaderTable;
import org.eclipse.datatools.enablement.sybase.asa.loaders.SybaseASATempTableLoader;
import org.eclipse.datatools.enablement.sybase.asa.models.sybaseasabasesqlmodel.SybaseasabasesqlmodelPackage;
import org.eclipse.datatools.enablement.sybase.asa.models.sybaseasabasesqlmodel.TransactionOption;
import org.eclipse.datatools.enablement.sybase.asa.models.sybaseasasqlmodel.SybaseasasqlmodelPackage;
import org.eclipse.datatools.enablement.sybase.asa.models.sybaseasasqlmodel.impl.SybaseASATempTableImpl;
import org.eclipse.datatools.enablement.sybase.models.sybasesqlmodel.SybasesqlmodelPackage;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SybaseASACatalogTempTable extends SybaseASATempTableImpl implements ICatalogObject, IAdaptable,
        ISybaseASACatalogBaseColumnOwner, IASABaseLoaderTable
{
	
	private static final long serialVersionUID = 2055557076455458621L;
	
	protected Boolean columnsLoaded = Boolean.FALSE;
	protected Boolean columnInfoLoaded = Boolean.FALSE;
    protected Boolean colConstraintInfoLoaded = Boolean.FALSE;
    protected Boolean colPrivilegesLoaded = Boolean.FALSE;
	
	protected Boolean constraintsLoaded = Boolean.FALSE;
	protected Boolean triggersLoaded = Boolean.FALSE;
	protected Boolean indicesLoaded = Boolean.FALSE;
	protected Boolean tableInfoLoaded = Boolean.FALSE; 
    protected Boolean privilegesLoaded = Boolean.FALSE;
	
	private SoftReference tableLoaderRef = null;
     private SoftReference authIdLoaderRef;
	
	public Database getCatalogDatabase() {
		return this.getSchema().getDatabase();
	}

	public Connection getConnection() {
		return ((ICatalogObject)getCatalogDatabase()).getConnection();
	}

	public void refresh() {
	    if(isNeedRefresh())
	    {
	        synchronized (columnsLoaded) {
	            if(columnsLoaded.booleanValue())
	            {
	                columnsLoaded = Boolean.FALSE;
	            }
	        }
	        synchronized (columnInfoLoaded) {
                if(columnInfoLoaded.booleanValue())
                {
                    columnInfoLoaded = Boolean.FALSE;
                }
            }
            synchronized (colConstraintInfoLoaded) {
                if(colConstraintInfoLoaded.booleanValue())
                {
                    colConstraintInfoLoaded = Boolean.FALSE;
                }
            }
            synchronized (colPrivilegesLoaded) {
                if(colPrivilegesLoaded.booleanValue())
                {
                    colPrivilegesLoaded = Boolean.FALSE;
                }
            }
	        synchronized (constraintsLoaded) {
	            if(constraintsLoaded.booleanValue())
	            {
	                constraintsLoaded = Boolean.FALSE;
	            }
	        }
	        synchronized (triggersLoaded) {
	            if(triggersLoaded.booleanValue())
	            {
	                triggersLoaded = Boolean.FALSE;
	            }
	        }
	        synchronized (indicesLoaded) {
	            if(indicesLoaded.booleanValue())
	            {
	                indicesLoaded = Boolean.FALSE;
	            }
	        }
	        synchronized (tableInfoLoaded) {
	            if(tableInfoLoaded.booleanValue())
	            {
	                tableInfoLoaded = Boolean.FALSE;
	            }
	        }
	        synchronized (privilegesLoaded) {
	            if(privilegesLoaded.booleanValue())
	            {
	                privilegesLoaded = Boolean.FALSE;
	            }
	        }
	        RefreshManager.getInstance().referesh(this);
	    }
	}
	
	public boolean eIsSet(EStructuralFeature eFeature) {
		switch(eDerivedStructuralFeatureID(eFeature))
		{
		case SybaseasabasesqlmodelPackage.SYBASE_ASA_BASE_TABLE__COLUMNS:
			this.getColumns();
			break;
		case SybaseasabasesqlmodelPackage.SYBASE_ASA_BASE_TABLE__CONSTRAINTS:
			this.getConstraints();
			break;
		case SybaseasabasesqlmodelPackage.SYBASE_ASA_BASE_TABLE__TRIGGERS:
			this.getTriggers();
			break;
		case SybaseasabasesqlmodelPackage.SYBASE_ASA_BASE_TABLE__INDEX:
			this.getIndex();
			break;
		case SybaseasabasesqlmodelPackage.SYBASE_ASA_BASE_TABLE__DESCRIPTION:
			this.getDescription();
			break;
		case SybaseasabasesqlmodelPackage.SYBASE_ASA_BASE_TEMP_TABLE__TRANSACTION_OPTION:
			this.getTransactionOption();
			break;
		case SybaseasasqlmodelPackage.SYBASE_ASA_TEMP_TABLE__PCTFREE:
			this.getPctfree();
			break;
        case SybasesqlmodelPackage.SYBASE_BASE_TABLE__PRIVILEGES:
            getPrivileges();
            break;
		}
		
		return super.eIsSet(eFeature);
	}	

	protected SybaseASABaseTempTableLoader getTableLoader()
	{
		SybaseASABaseTempTableLoader loader = tableLoaderRef == null ? null
				: (SybaseASABaseTempTableLoader) tableLoaderRef.get();
		
		if(loader == null)
		{
			loader = createTableLoader();
			tableLoaderRef = new SoftReference(loader);
		}
		
		return loader;
	}
	
	public EList getColumns() {
		synchronized (columnsLoaded) {
			if(!columnsLoaded.booleanValue())
			{
				getTableLoader().loadColumns(super.getColumns());
				columnsLoaded = Boolean.TRUE;
			}
		}
		return super.getColumns();
	}

	public EList getConstraints() {
		synchronized (constraintsLoaded) {
			if(!constraintsLoaded.booleanValue())
			{
				List existingConstraints = new ArrayList(super.getConstraints().size());
				existingConstraints.addAll(super.getConstraints());
				getTableLoader().loadConstraints(super.getConstraints());
				constraintsLoaded = Boolean.TRUE;
			}
		}
		return super.getConstraints();
	}

	public EList getTriggers() {
		synchronized (triggersLoaded) {
			if(!triggersLoaded.booleanValue())
			{
			    getTableLoader().loadTriggers(super.getTriggers());
				triggersLoaded = Boolean.TRUE;
			}
		}
		return super.getTriggers();
	}

	public EList getIndex() {
		synchronized (indicesLoaded) {
			if(!indicesLoaded.booleanValue())
			{
				getTableLoader().loadIndices(super.getIndex());
				indicesLoaded = Boolean.TRUE;
			}
		}
		return super.getIndex();
	}

	public String getDescription() {
		synchronized (tableInfoLoaded) {
			if(!tableInfoLoaded.booleanValue())
			{
				getTableLoader().loadTableInfo();
				tableInfoLoaded = Boolean.TRUE;
			}
		}
		return super.getDescription();
	}

	public TransactionOption getTransactionOption() {
		synchronized (tableInfoLoaded) {
			if(!tableInfoLoaded.booleanValue())
			{
				getTableLoader().loadTableInfo();
				tableInfoLoaded = Boolean.TRUE;
			}
		}
		return super.getTransactionOption();
	}

	public int getPctfree() {
		synchronized (tableInfoLoaded) {
			if(!tableInfoLoaded.booleanValue())
			{
				getTableLoader().loadTableInfo();
				tableInfoLoaded = Boolean.TRUE;
			}
		}
		return super.getPctfree();
	}

	protected SybaseASATempTableLoader createTableLoader()
	{
		return new SybaseASATempTableLoader(this);
	}
     public EList getPrivileges()
        {
            synchronized (privilegesLoaded) {
                if(!privilegesLoaded.booleanValue())
                {
                    getPrivilegeLoader().loadPrivilegs(super.getPrivileges());
                    privilegesLoaded = Boolean.TRUE;
                }
            }
            return super.getPrivileges();
        }

        private AuthorizedObjectPrivilegeASALoader getPrivilegeLoader()
        {
            AuthorizedObjectPrivilegeASALoader loader = authIdLoaderRef == null ? null
                    : (AuthorizedObjectPrivilegeASALoader) authIdLoaderRef.get();
            
            if(loader == null)
            {
                loader = createPrivilegeLoader();
                authIdLoaderRef = new SoftReference(loader);
            }
            
            return loader;
        }
        
        private AuthorizedObjectPrivilegeASALoader createPrivilegeLoader()
        {
            return new AuthorizedObjectPrivilegeASALoader(this);
        }

		public Object getAdapter(Class adapter) {
			Object adapterObject=Platform.getAdapterManager().getAdapter(this, adapter);
			if(adapterObject==null){
				adapterObject=Platform.getAdapterManager().loadAdapter(this, adapter.getName());
			}
			return adapterObject;
		}
		
	protected boolean isNeedRefresh()
	{
	    if (columnsLoaded.booleanValue() || constraintsLoaded.booleanValue() || triggersLoaded.booleanValue()
                || indicesLoaded.booleanValue() || tableInfoLoaded.booleanValue() || privilegesLoaded.booleanValue()
                || columnInfoLoaded.booleanValue() || colPrivilegesLoaded.booleanValue()
                || colConstraintInfoLoaded.booleanValue())
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}


    public Boolean isColumnConstraintLoaded()
    {
        return colConstraintInfoLoaded;
    }

    public Boolean isColumnInfoLoaded()
    {
        return columnInfoLoaded;
    }

    public Boolean isColumnPrivilegeLoaded()
    {
        return colPrivilegesLoaded;
    }

    public void setColumnConstraintLoaded(Boolean loaded)
    {
        this.colConstraintInfoLoaded = loaded;
    }

    public void setColumnInfoLoaded(Boolean loaded)
    {
        this.columnInfoLoaded = loaded;
    }

    public void setColumnPrivilegeLoaded(Boolean loaded)
    {
        this.colPrivilegesLoaded = loaded;
    }

    public Boolean isIndexLoaded()
    {
        return this.indicesLoaded;
    }

    public Boolean isTriggerLoaded()
    {
        return this.triggersLoaded;
    }

    public void setIndexLoaded(Boolean loaded)
    {
        this.indicesLoaded = loaded;
    }

    public void setTriggerLoaded(Boolean loaded)
    {
        this.triggersLoaded = loaded;
    }
    
    public EList getIndexSupper()
    {
        return super.getIndex();
    }

    public EList getTriggerSuper()
    {
        return super.getTriggers();
    }
}
