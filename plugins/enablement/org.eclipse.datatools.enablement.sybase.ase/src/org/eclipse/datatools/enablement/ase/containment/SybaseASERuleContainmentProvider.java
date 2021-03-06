/*******************************************************************************
 * Copyright (c) 2008 Sybase, Inc.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Sybase
 ******************************************************************************/
package org.eclipse.datatools.enablement.ase.containment;

import org.eclipse.datatools.connectivity.sqm.core.containment.AbstractContainmentProvider;
import org.eclipse.datatools.enablement.sybase.ase.models.sybaseasesqlmodel.SybaseASERule;
import org.eclipse.emf.ecore.EObject;

/**
 * Sybase ASE Rule containment provider
 * 
 * @author renj
 */
public class SybaseASERuleContainmentProvider extends AbstractContainmentProvider
{
    public EObject getContainer(EObject obj)
    {
        return ((SybaseASERule) obj).getSchema();
    }

    public String getGroupId(EObject obj)
    {
        return DBEventGroupID.ASERULE;
    }
}
