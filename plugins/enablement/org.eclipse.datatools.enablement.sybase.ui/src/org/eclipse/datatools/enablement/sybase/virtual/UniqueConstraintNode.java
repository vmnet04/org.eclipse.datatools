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
package org.eclipse.datatools.enablement.sybase.virtual;

import org.eclipse.datatools.connectivity.sqm.core.ui.explorer.providers.content.virtual.VirtualNode;
import org.eclipse.datatools.enablement.sybase.containment.ConstraintGroupID;

/**
 * @author David Cui
 */
public class UniqueConstraintNode extends VirtualNode
{

    /**
     * @param name
     * @param displayName
     * @param parent
     */
    public UniqueConstraintNode(String name, String displayName, Object parent)
    {
        super(name, displayName, parent);
    }

    /* (non-Javadoc)
     * @see org.eclipse.datatools.connectivity.sqm.core.ui.explorer.virtual.IVirtualNode#getGroupID()
     */
    public String getGroupID()
    {
        return ConstraintGroupID.UNIQUECONSTRAINT;
    }

}
