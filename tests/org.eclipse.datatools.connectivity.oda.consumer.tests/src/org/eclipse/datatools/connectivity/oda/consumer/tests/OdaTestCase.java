/*
 *************************************************************************
 * Copyright (c) 2004, 2006 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation - initial API and implementation
 *  
 *************************************************************************
 */

package org.eclipse.datatools.connectivity.oda.consumer.tests;

import org.eclipse.datatools.connectivity.oda.IDriver;
import org.eclipse.datatools.connectivity.oda.OdaException;
import org.eclipse.datatools.connectivity.oda.consumer.helper.OdaDriver;

import junit.framework.TestCase;

/**
 * Abstract base test case class for the oda test suite,
 * using the oda.consumer.testdriver as the underlying ODA driver.
 */
abstract class OdaTestCase extends TestCase 
{
    private static final String TEST_DRIVER_ID = 
        "org.eclipse.datatools.connectivity.oda.consumer.testdriver";
    private IDriver m_driver = null;
    
    IDriver getTestDriver() throws OdaException
    {
    	if ( m_driver == null )
    		m_driver = getNewTestDriver();
    	
    	return m_driver;
    }
    
    IDriver getNewTestDriver() throws OdaException
    {
        return new OdaDriver( getTestDriverId() );
    }
    
    static String getTestDriverId()
    {
    	return TEST_DRIVER_ID;
    }
}
