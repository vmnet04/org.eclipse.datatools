/*******************************************************************************
 * Copyright (c) 2004, 2005 Sybase, Inc. and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sybase, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.datatools.sqltools.db.derby.parser;


import org.eclipse.datatools.sqltools.sql.parser.ast.IASTSQLDataType;

public class ASTSQLDataType extends SimpleNode implements IASTSQLDataType {

	private String _name;

	/** can also be used be as precision when _scale is not zero */
	private int _length;

	private int _scale;

	public ASTSQLDataType(int id) {
		super(id);
	}

	public ASTSQLDataType(DerbySQLParser p, int id) {
		super(p, id);
	}

	public int getLength() {
		return _length;
	}

	public void setLength(int length) {
		this._length = length;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String toString() {
		String retval = _name;

		if (_length > 0 || _scale >= 0) {
			if (_scale >= 0) {
				retval = retval + "(" + _length + "," + _scale + ")";
			} else {
				retval = retval + "(" + _length + ")";
			}

		}

		return retval;
	}

	public int getScale() {
		return _scale;
	}

	public void setScale(int scale) {
		this._scale = scale;
	}

	/** Accept the visitor. * */
	public Object jjtAccept(DerbySQLParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}
