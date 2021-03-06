/*******************************************************************************
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.sqltools.parsers.sql;

import org.eclipse.datatools.modelbase.sql.query.util.SQLQuerySourceFormat;

/**
 * @author ckadner
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface SQLParserFactory
{

    public SQLQuerySourceFormat getSQLSourceFormat();
    public void setSQLSourceFormat(SQLQuerySourceFormat sourceFormat);

}
