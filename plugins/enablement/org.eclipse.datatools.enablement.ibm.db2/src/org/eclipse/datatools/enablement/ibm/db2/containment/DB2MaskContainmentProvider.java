/*******************************************************************************
 * Copyright (c) 2012, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.enablement.ibm.db2.containment;

import org.eclipse.datatools.connectivity.sqm.core.containment.AbstractContainmentProvider;
import org.eclipse.datatools.enablement.ibm.db2.model.DB2Mask;
import org.eclipse.datatools.enablement.ibm.db2.model.DB2ModelPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class DB2MaskContainmentProvider extends AbstractContainmentProvider {
	public EObject getContainer(EObject obj) 
	{
		DB2Mask mask = (DB2Mask)obj;
		return mask.getSubjectTable() != null ? 
				mask.getSubjectTable() : mask.getSubjectMQT();
	}
	public EStructuralFeature getContainmentFeature(EObject obj) 
	{
		DB2Mask mask = (DB2Mask)obj;
		return mask.getSubjectTable() != null ? 
				DB2ModelPackage.eINSTANCE.getDB2Table_Masks() :
				DB2ModelPackage.eINSTANCE.getDB2MaterializedQueryTable_Masks();
	}

	public String getGroupId(EObject obj) {
		return DB2GroupID.DB2MASK;
	}
}