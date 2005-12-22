/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveType.java,v 1.1 2005/08/02 22:56:26 ledunnel Exp $
 */
package org.eclipse.datatools.modelbase.sql.datatypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 4.1 Data types
 * 
 * A data type is a set of representable values. Every representable value belongs to at least one data type and some belong to several data types. [...]
 * 
 * Every predefined data type is a subtype of itself and of no other data types. It follows that every predefined data type is a supertype of itself and of no other data types. The predefined data types are individually described in each of Subclause 4.2, "Character strings", through Subclause 4.6, "Datetimes and intervals". Row types, reference types and collection types are described in Subclause 4.8, "Row types", Subclause 4.9, "Reference types", Subclause 4.10, "Collection types", respectively.
 * 
 * SQL defines predefined data types named by the following <key word> s: CHARACTER , CHARACTER VARYING , CHARACTER LARGE OBJECT , BINARY LARGE OBJECT , NUMERIC , DECIMAL , SMALLINT , INTEGER , BIGINT , FLOAT , REAL , DOUBLE PRECISION , BOOLEAN , DATE , TIME , TIMESTAMP , and INTERVAL . These names are used in the type designators that constitute the type precedence lists specified in Subclause 9.5, "Type precedence list determination".
 * <!-- end-model-doc -->
 * @see org.eclipse.datatools.modelbase.sql.datatypes.SQLDataTypesPackage#getPrimitiveType()
 * @model
 * @generated
 */
public final class PrimitiveType extends AbstractEnumerator {
	/**
	 * The '<em><b>CHARACTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER = 0;

	/**
	 * The '<em><b>CHARACTER VARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_VARYING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_VARYING = 1;

	/**
	 * The '<em><b>CHARACTER LARGE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_LARGE_OBJECT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_LARGE_OBJECT = 2;

	/**
	 * The '<em><b>NATIONAL CHARACTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_CHARACTER = 3;

	/**
	 * The '<em><b>NATIONAL CHARACTER VARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_VARYING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_CHARACTER_VARYING = 4;

	/**
	 * The '<em><b>NATIONAL CHARACTER LARGE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_LARGE_OBJECT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_CHARACTER_LARGE_OBJECT = 5;

	/**
	 * The '<em><b>BINARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY = 6;

	/**
	 * The '<em><b>BINARY VARYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VARYING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VARYING = 7;

	/**
	 * The '<em><b>BINARY LARGE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_LARGE_OBJECT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_LARGE_OBJECT = 8;

	/**
	 * The '<em><b>NUMERIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC = 9;

	/**
	 * The '<em><b>DECIMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL = 10;

	/**
	 * The '<em><b>SMALLINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALLINT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALLINT = 11;

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER = 12;

	/**
	 * The '<em><b>BIGINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGINT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BIGINT = 13;

	/**
	 * The '<em><b>FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT = 14;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL = 15;

	/**
	 * The '<em><b>DOUBLE PRECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PRECISION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_PRECISION = 16;

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN = 17;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE = 18;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME = 19;

	/**
	 * The '<em><b>TIMESTAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIMESTAMP = 20;

	/**
	 * The '<em><b>INTERVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERVAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERVAL = 21;

	/**
	 * The '<em><b>DATALINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATALINK_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATALINK = 22;

	/**
	 * The '<em><b>XML TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XML_TYPE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XML_TYPE = 23;

	/**
	 * The '<em><b>CHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType CHARACTER_LITERAL = new PrimitiveType(CHARACTER, "CHARACTER"); //$NON-NLS-1$

	/**
	 * The '<em><b>CHARACTER VARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTER VARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_VARYING
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType CHARACTER_VARYING_LITERAL = new PrimitiveType(CHARACTER_VARYING, "CHARACTER_VARYING"); //$NON-NLS-1$

	/**
	 * The '<em><b>CHARACTER LARGE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTER LARGE OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_LARGE_OBJECT
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType CHARACTER_LARGE_OBJECT_LITERAL = new PrimitiveType(CHARACTER_LARGE_OBJECT, "CHARACTER_LARGE_OBJECT"); //$NON-NLS-1$

	/**
	 * The '<em><b>NATIONAL CHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONAL CHARACTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType NATIONAL_CHARACTER_LITERAL = new PrimitiveType(NATIONAL_CHARACTER, "NATIONAL_CHARACTER"); //$NON-NLS-1$

	/**
	 * The '<em><b>NATIONAL CHARACTER VARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONAL CHARACTER VARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_VARYING
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType NATIONAL_CHARACTER_VARYING_LITERAL = new PrimitiveType(NATIONAL_CHARACTER_VARYING, "NATIONAL_CHARACTER_VARYING"); //$NON-NLS-1$

	/**
	 * The '<em><b>NATIONAL CHARACTER LARGE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIONAL CHARACTER LARGE OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_CHARACTER_LARGE_OBJECT
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType NATIONAL_CHARACTER_LARGE_OBJECT_LITERAL = new PrimitiveType(NATIONAL_CHARACTER_LARGE_OBJECT, "NATIONAL_CHARACTER_LARGE_OBJECT"); //$NON-NLS-1$

	/**
	 * The '<em><b>BINARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType BINARY_LITERAL = new PrimitiveType(BINARY, "BINARY"); //$NON-NLS-1$

	/**
	 * The '<em><b>BINARY VARYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINARY VARYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY_VARYING
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType BINARY_VARYING_LITERAL = new PrimitiveType(BINARY_VARYING, "BINARY_VARYING"); //$NON-NLS-1$

	/**
	 * The '<em><b>BINARY LARGE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BINARY LARGE OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY_LARGE_OBJECT
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType BINARY_LARGE_OBJECT_LITERAL = new PrimitiveType(BINARY_LARGE_OBJECT, "BINARY_LARGE_OBJECT"); //$NON-NLS-1$

	/**
	 * The '<em><b>NUMERIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMERIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType NUMERIC_LITERAL = new PrimitiveType(NUMERIC, "NUMERIC"); //$NON-NLS-1$

	/**
	 * The '<em><b>DECIMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECIMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType DECIMAL_LITERAL = new PrimitiveType(DECIMAL, "DECIMAL"); //$NON-NLS-1$

	/**
	 * The '<em><b>SMALLINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMALLINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMALLINT
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType SMALLINT_LITERAL = new PrimitiveType(SMALLINT, "SMALLINT"); //$NON-NLS-1$

	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType INTEGER_LITERAL = new PrimitiveType(INTEGER, "INTEGER"); //$NON-NLS-1$

	/**
	 * The '<em><b>BIGINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIGINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIGINT
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType BIGINT_LITERAL = new PrimitiveType(BIGINT, "BIGINT"); //$NON-NLS-1$

	/**
	 * The '<em><b>FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType FLOAT_LITERAL = new PrimitiveType(FLOAT, "FLOAT"); //$NON-NLS-1$

	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType REAL_LITERAL = new PrimitiveType(REAL, "REAL"); //$NON-NLS-1$

	/**
	 * The '<em><b>DOUBLE PRECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE PRECISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PRECISION
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType DOUBLE_PRECISION_LITERAL = new PrimitiveType(DOUBLE_PRECISION, "DOUBLE_PRECISION"); //$NON-NLS-1$

	/**
	 * The '<em><b>BOOLEAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType BOOLEAN_LITERAL = new PrimitiveType(BOOLEAN, "BOOLEAN"); //$NON-NLS-1$

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType DATE_LITERAL = new PrimitiveType(DATE, "DATE"); //$NON-NLS-1$

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType TIME_LITERAL = new PrimitiveType(TIME, "TIME"); //$NON-NLS-1$

	/**
	 * The '<em><b>TIMESTAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIMESTAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMESTAMP
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType TIMESTAMP_LITERAL = new PrimitiveType(TIMESTAMP, "TIMESTAMP"); //$NON-NLS-1$

	/**
	 * The '<em><b>INTERVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERVAL
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType INTERVAL_LITERAL = new PrimitiveType(INTERVAL, "INTERVAL"); //$NON-NLS-1$

	/**
	 * The '<em><b>DATALINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATALINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATALINK
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType DATALINK_LITERAL = new PrimitiveType(DATALINK, "DATALINK"); //$NON-NLS-1$

	/**
	 * The '<em><b>XML TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XML TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XML_TYPE
	 * @generated
	 * @ordered
	 */
	public static final PrimitiveType XML_TYPE_LITERAL = new PrimitiveType(XML_TYPE, "XML_TYPE"); //$NON-NLS-1$

	/**
	 * An array of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveType[] VALUES_ARRAY =
		new PrimitiveType[] {
			CHARACTER_LITERAL,
			CHARACTER_VARYING_LITERAL,
			CHARACTER_LARGE_OBJECT_LITERAL,
			NATIONAL_CHARACTER_LITERAL,
			NATIONAL_CHARACTER_VARYING_LITERAL,
			NATIONAL_CHARACTER_LARGE_OBJECT_LITERAL,
			BINARY_LITERAL,
			BINARY_VARYING_LITERAL,
			BINARY_LARGE_OBJECT_LITERAL,
			NUMERIC_LITERAL,
			DECIMAL_LITERAL,
			SMALLINT_LITERAL,
			INTEGER_LITERAL,
			BIGINT_LITERAL,
			FLOAT_LITERAL,
			REAL_LITERAL,
			DOUBLE_PRECISION_LITERAL,
			BOOLEAN_LITERAL,
			DATE_LITERAL,
			TIME_LITERAL,
			TIMESTAMP_LITERAL,
			INTERVAL_LITERAL,
			DATALINK_LITERAL,
			XML_TYPE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveType get(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.toString().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrimitiveType get(int value) {
		switch (value) {
			case CHARACTER: return CHARACTER_LITERAL;
			case CHARACTER_VARYING: return CHARACTER_VARYING_LITERAL;
			case CHARACTER_LARGE_OBJECT: return CHARACTER_LARGE_OBJECT_LITERAL;
			case NATIONAL_CHARACTER: return NATIONAL_CHARACTER_LITERAL;
			case NATIONAL_CHARACTER_VARYING: return NATIONAL_CHARACTER_VARYING_LITERAL;
			case NATIONAL_CHARACTER_LARGE_OBJECT: return NATIONAL_CHARACTER_LARGE_OBJECT_LITERAL;
			case BINARY: return BINARY_LITERAL;
			case BINARY_VARYING: return BINARY_VARYING_LITERAL;
			case BINARY_LARGE_OBJECT: return BINARY_LARGE_OBJECT_LITERAL;
			case NUMERIC: return NUMERIC_LITERAL;
			case DECIMAL: return DECIMAL_LITERAL;
			case SMALLINT: return SMALLINT_LITERAL;
			case INTEGER: return INTEGER_LITERAL;
			case BIGINT: return BIGINT_LITERAL;
			case FLOAT: return FLOAT_LITERAL;
			case REAL: return REAL_LITERAL;
			case DOUBLE_PRECISION: return DOUBLE_PRECISION_LITERAL;
			case BOOLEAN: return BOOLEAN_LITERAL;
			case DATE: return DATE_LITERAL;
			case TIME: return TIME_LITERAL;
			case TIMESTAMP: return TIMESTAMP_LITERAL;
			case INTERVAL: return INTERVAL_LITERAL;
			case DATALINK: return DATALINK_LITERAL;
			case XML_TYPE: return XML_TYPE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PrimitiveType(int value, String name) {
		super(value, name);
	}

} //PrimitiveType
