/*******************************************************************************
 * Copyright (c) 2006 Sybase, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    rcernich - initial API and implementation
 *******************************************************************************/ 
package org.eclipse.datatools.connectivity;


/**
 * This interface is used to listen for property changes occurring on a
 * connection profile. 
 * 
 * @author rcernich
 *
 * Created on Jun 1, 2006
 */
public interface IPropertySetListener {
	
	/**
	 * Indicates one or more properties have been changed on the connection
	 * profile.
	 * 
	 * @param event the change details
	 */
	void propertySetChanged(IPropertySetChangeEvent event);

}
