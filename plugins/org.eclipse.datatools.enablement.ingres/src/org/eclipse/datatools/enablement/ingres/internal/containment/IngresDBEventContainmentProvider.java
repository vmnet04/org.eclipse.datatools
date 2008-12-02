/*******************************************************************************
 * Copyright (c) 2008 Ingres Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ingres Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.enablement.ingres.internal.containment;

import org.eclipse.datatools.connectivity.sqm.core.containment.AbstractContainmentProvider;
import org.eclipse.datatools.enablement.ingres.containment.IngresGroupID;
import org.eclipse.datatools.enablement.ingres.models.ingressqlmodel.IngresDBEvent;
import org.eclipse.emf.ecore.EObject;

/**
 * A containment provider to support Ingres db events.
 * 
 * @author enrico.schenk@ingres.com
 */
public class IngresDBEventContainmentProvider extends
		AbstractContainmentProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.datatools.connectivity.sqm.core.containment.AbstractContainmentProvider#getContainer(org.eclipse.emf.ecore.EObject)
	 */
	public EObject getContainer(EObject obj) {
		return ((IngresDBEvent) obj).getSchema();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.datatools.connectivity.sqm.internal.core.containment.ContainmentProvider#getGroupId(org.eclipse.emf.ecore.EObject)
	 */
	public String getGroupId(EObject obj) {
		return IngresGroupID.DB_EVENT_GROUP_ID;
	}

}
