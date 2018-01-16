/**
 * <copyright>
 * </copyright>
 *
 * $Id: LUWModuleFunction.java,v 1.1 2009/01/31 00:22:40 xli Exp $
 */
package org.eclipse.datatools.enablement.ibm.db2.luw.model;

import org.eclipse.datatools.enablement.ibm.db2.model.DB2UserDefinedFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.datatools.enablement.ibm.db2.luw.model.LUWModuleFunction#isImplemented <em>Implemented</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.datatools.enablement.ibm.db2.luw.model.LUWPackage#getLUWModuleFunction()
 * @model
 * @generated
 */
public interface LUWModuleFunction extends DB2UserDefinedFunction, LUWModuleObject {
	/**
	 * Returns the value of the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented</em>' attribute.
	 * @see #setImplemented(boolean)
	 * @see org.eclipse.datatools.enablement.ibm.db2.luw.model.LUWPackage#getLUWModuleFunction_Implemented()
	 * @model
	 * @generated
	 */
	boolean isImplemented();

	/**
	 * Sets the value of the '{@link org.eclipse.datatools.enablement.ibm.db2.luw.model.LUWModuleFunction#isImplemented <em>Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented</em>' attribute.
	 * @see #isImplemented()
	 * @generated
	 */
	void setImplemented(boolean value);

} // LUWModuleFunction
