/*******************************************************************************
 * Copyright (c) 2004, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.enablement.ibm.db2.luw.catalog;

import java.sql.Connection;

import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogObject;
import org.eclipse.datatools.connectivity.sqm.core.rte.RefreshManager;
import org.eclipse.datatools.enablement.ibm.db2.model.impl.DB2MultidimensionalIndexImpl;
import org.eclipse.datatools.modelbase.sql.schema.Database;

public class LUWCatalogMultidimensionalIndex extends DB2MultidimensionalIndexImpl implements ICatalogObject {
	public void refresh() {
		RefreshManager.getInstance().referesh(this);
	}

	public boolean isSystemObject() {
		return false;
	}

	public Connection getConnection() {
		Database database = this.getCatalogDatabase();
		return ((LUWCatalogDatabase) database).getConnection();
	}
	
	public Database getCatalogDatabase() {
		return this.getSchema().getDatabase();		
	}
}
