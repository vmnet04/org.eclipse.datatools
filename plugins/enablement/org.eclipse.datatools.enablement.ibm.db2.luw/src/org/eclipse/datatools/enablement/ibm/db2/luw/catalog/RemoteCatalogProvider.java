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

import org.eclipse.datatools.modelbase.sql.schema.Database;

import org.eclipse.datatools.enablement.ibm.db2.luw.model.LUWGenericServer;
import org.eclipse.datatools.enablement.ibm.db2.luw.model.RelationalRemoteServer;
import org.eclipse.datatools.enablement.ibm.db2.luw.model.RemoteServer;

public interface RemoteCatalogProvider {
	RemoteServer getRemoteServer(LUWGenericServer federatedSever);	
//TODO: added getDatabase
	Database getDatabase(RelationalRemoteServer rrSever);	
}
