/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: IBM Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.filter;

import org.eclipse.datatools.connectivity.sqm.internal.core.connection.ConnectionFilter;
import org.eclipse.swt.widgets.Table;

public interface IConnectionFilterProvider {
	public ConnectionFilter getConnectionFilter();
	public void populateSelectionTable(Table selectionTable);
	public void dataChanged();
}
