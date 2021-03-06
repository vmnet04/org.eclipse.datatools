/*******************************************************************************
 * Copyright (c) 2008 SAP AG
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Wolfgang Auer - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.enablement.sap.maxdb.ui.internal.ui.connection;

import org.eclipse.datatools.connectivity.ui.wizards.ExtensibleProfileDetailsWizardPage;
import org.eclipse.datatools.enablement.sap.maxdb.internal.connection.IMaxDBConnectionProfileConstants;

public class MaxDBProfileDetailsWizardPage extends ExtensibleProfileDetailsWizardPage {
	
	public MaxDBProfileDetailsWizardPage(String pageName) {
		super(pageName,IMaxDBConnectionProfileConstants.MAXDB_CATEGORY_ID);
	}
}
