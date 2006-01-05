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
package org.eclipse.datatools.sqltools.plan;


/**
 * In order to support graphic execution plan when using EPV (SQL Execution Plan View), consumer must provide the plan
 * parser and plan drawer, which are used to parse the raw plan data and draw graphic plan. If the graphic plan is
 * tree-structure, the consumer can use <code>TreePlanDrawer</code> to draw the plan, in this case, they only need to
 * implement <code>IPlanParser</code> to parse the execution plan into <code>TreeExecutionPlanDocument</code>
 * 
 * @see IPlanParser
 * @see IPlanDrawer
 * @author Dafan Yang
 */
public interface IPlanService
{
    /**
     * Returns the plan parser. For one type of database, only one parser is supported.
     * 
     * @return the parser
     */
    public IPlanParser getPlanParser();

    /**
     * Returns the plan drawer. The plan drawer is responsible for drawing the <code>IExecutionPlanDocument</code>
     * obtained from <code>IPlanParser</code> on canvas.
     * 
     * @return the plan drawer
     */
    public IPlanDrawer getPlanDrawer();
}
