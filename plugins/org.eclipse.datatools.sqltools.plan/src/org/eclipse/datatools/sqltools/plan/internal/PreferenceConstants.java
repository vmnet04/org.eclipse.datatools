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
package org.eclipse.datatools.sqltools.plan.internal;

/**
 * The preference constants
 * @author Dafan Yang
 */
public interface PreferenceConstants
{
    public static final String PLAN_PREFERENCE_PAGE_ID     = "org.eclipse.datatools.sqltools.plan.executionPlanPage";

    public static final String VERTICAL_LAYOUT_PLAN_VIEW   = Constants.PLUGIN_ID
                                                                   + ".preferences.VerticalLayoutPlanView";
    public static final String HORIZONTAL_LAYOUT_PLAN_VIEW = Constants.PLUGIN_ID
                                                                   + ".preferences.HorizontalLayoutPlanView";
}
