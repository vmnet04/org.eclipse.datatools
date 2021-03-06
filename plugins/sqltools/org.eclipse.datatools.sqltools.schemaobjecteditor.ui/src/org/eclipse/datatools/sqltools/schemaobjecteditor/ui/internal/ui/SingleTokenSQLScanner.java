/***********************************************************************************************************************
 * Copyright (c) 2009 Sybase, Inc. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Sybase, Inc. - initial API and implementation
 **********************************************************************************************************************/
package org.eclipse.datatools.sqltools.schemaobjecteditor.ui.internal.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.datatools.sqltools.schemaobjecteditor.ui.internal.SOEUIPlugin;
import org.eclipse.datatools.sqltools.schemaobjecteditor.ui.util.ColorProvider;
import org.eclipse.datatools.sqltools.sqleditor.internal.sql.AbstractSQLScanner;
import org.eclipse.datatools.sqltools.sqleditor.internal.sql.ISQLPartitions;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Li Huang
 * 
 */
public class SingleTokenSQLScanner extends AbstractSQLScanner
{

    ColorProvider _provider = SOEUIPlugin.getDefault().getColorProvider();
    String        _tokenKey;

    public SingleTokenSQLScanner(String tokenKey)
    {
        _tokenKey = tokenKey;
        initialize();
    }

    protected Token getToken()
    {

        Token token = new Token(null);
        if (_tokenKey.equals(ISQLPartitions.SQL_STRING))
        {
            token = new Token(new TextAttribute(_provider.getColor(ColorProvider.STRING)));
        }
        else if (_tokenKey.equals(ISQLPartitions.SQL_DOUBLE_QUOTES_IDENTIFIER))
        {
            token = new Token(new TextAttribute(_provider.getColor(ColorProvider.STRING)));
        }
        return token;
    }

    /*
     * @see AbstractSQLScanner#createRules()
     */
    protected List createRules()
    {
        List list = new ArrayList();
        Token defaultToken = getToken();
        setDefaultReturnToken(defaultToken);

        return list;
    }

}
