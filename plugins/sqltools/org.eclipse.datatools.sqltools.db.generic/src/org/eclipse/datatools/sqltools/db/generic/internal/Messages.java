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
package org.eclipse.datatools.sqltools.db.generic.internal;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.datatools.sqltools.db.generic.internal.messages";//$NON-NLS-1$

	private Messages() {
		// Do not instantiate
	}

	public static String SQLParser_datatype_judgeLength;
	public static String SQLParser_datatype_judgeLengthAndScale;
	public static String SQLParser_datatype_exceed_maxlength;
	public static String plugin_internal_error;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}