/*******************************************************************************
 * Copyright (c) 2005 Sybase, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sybase, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.sqltools.plan.internal.ui.actions;

import org.eclipse.datatools.sqltools.plan.internal.PlanViewPlugin;
import org.eclipse.datatools.sqltools.plan.internal.util.Images;
import org.eclipse.jface.action.Action;

/**
 * @author Hui Cao
 *
 */
public class RemoveAllPlansAction extends Action
{
    /**
     * Constructor
     *
     */
    public RemoveAllPlansAction()
    {
        super(Messages.getString("RemoveAllPlansAction.remove.all.plans.name")); //$NON-NLS-1$
        setToolTipText(Messages.getString("RemoveAllPlansAction.remove.all.plans.name.tooltip")); //$NON-NLS-1$
        setImageDescriptor(Images.DESC_REMOVEALL);
        setDisabledImageDescriptor(Images.DESC_REMOVEALL_DISABLE);
    }

    public void run()
    {
        PlanViewPlugin.getPlanManager().removeAllFinished();
    }

    public void update()
    {
        setEnabled(PlanViewPlugin.getPlanManager().getAllPlanInstances().length != 0);
    }

}
