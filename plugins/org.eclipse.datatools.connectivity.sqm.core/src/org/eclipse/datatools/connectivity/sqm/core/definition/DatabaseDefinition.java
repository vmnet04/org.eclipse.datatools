/*******************************************************************************
 * Copyright (c) 2001, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.datatools.connectivity.sqm.core.definition;

import java.util.Iterator;
import java.util.List;

import org.eclipse.datatools.connectivity.sqm.core.rte.DDLGenerator;
import org.eclipse.datatools.connectivity.sqm.core.rte.ICatalogProvider;
import org.eclipse.datatools.connectivity.sqm.internal.core.rte.DDLParser;
import org.eclipse.datatools.connectivity.sqm.internal.core.rte.DeltaDDLGenerator;
import org.eclipse.datatools.modelbase.dbdefinition.DebuggerDefinition;
import org.eclipse.datatools.modelbase.dbdefinition.PredefinedDataTypeDefinition;
import org.eclipse.datatools.modelbase.sql.datatypes.DataType;
import org.eclipse.datatools.modelbase.sql.datatypes.PredefinedDataType;
import org.eclipse.datatools.modelbase.sql.schema.SQLObject;


public interface DatabaseDefinition {
	public String getProduct();
	public String getProductDisplayString();
	public String getVersion();
	public String getVersionDisplayString();
	public String getDescription();
	public DataModelElementFactory getDataModelElementFactory();

	public Iterator getPredefinedDataTypes();
	public Iterator getSequenceSupportedPredefinedDataTypes();
	public Iterator getIdentityColumnSupportedPredefinedDataTypes();
	
	public boolean supportsSchema();
	public boolean supportsIdentityColumns();
	public boolean supportsComputedColumns();
	public boolean supportsSequence();
	public boolean supportsMQT();
	public boolean supportsMQTIndex();
	public boolean supportsDeferrableConstraints();
	public boolean supportsInformationalConstraints();
	public boolean supportsClusteredIndexes();
	public boolean isUniqueKeyNullable();
	public List  getParentDeleteDRIRules();
	public List  getParentUpdateDRIRules();
	public boolean supportsConstraints();
	public int queryMaxCommentLength();
	public int queryMaxIdentifierLength();
	public int queryMaxCheckExpression();
	public int queryTriggerMaxReferencePartLength();
	public int queryTriggerMaxActionBodyLength();
	public int queryStoredProcedureMaxActionBodyLength();
	public boolean supportsStoredProcedureNullInputAction();
	public boolean supportsNicknames();
	public boolean supportsNicknameConstraints();
	public boolean supportsNicknameIndex();
	public boolean supportsQuotedDML();
	public boolean supportsQuotedDDL();

	public boolean supportsAlias();
	public boolean supportsSynonym();
	public boolean supportsTriggers();
	public boolean supportsTriggerTypes();
	public boolean supportsInsteadOfTrigger();	
	public boolean supportsPerColumnUpdateTrigger();
	public boolean supportsTriggerReferencesClause();
	public boolean supportsRowTriggerReference();
	public boolean supportsTableTriggerReference();
	public boolean supportTriggerWhenClause();
	public boolean supportsTriggerGranularity();
	public boolean supportsUserDefinedType();
	
	public boolean supportsSnapshotViews();
	public boolean supportsViewTriggers();

	public boolean isKeyConstraintSupported(DataType dataType);
	
	public String getIdentifierQuoteString();
	public String getHostVariableMarker();
	public boolean supportsHostVariableMarker();
	public boolean supportsCastExpression();
	public boolean supportsDefaultKeywordForInsertValue();
	public boolean supportsExtendedGrouping();
	public boolean supportsTableAliasInDelete();
	
	public List getProcedureLanguageType();
	public List getFunctionLanguageType();
	public boolean supportsSQLStatement();
	
	public List getSQLKeywords();
	public List getSQLOperators();
	public boolean isSQLKeyword(String word);
	public boolean isSQLOperator(String word);
	public String getSQLTerminationCharacter();
	
	public int getMaximumIdentifierLength();
	public int getMaximumIdentifierLength(SQLObject sqlObject);
	public int getDatabaseMaximumIdentifierLength();
	public int getSchemaMaximumIdentifierLength();
	public int getTableMaximumIdentifierLength();
	public int getViewMaximumIdentifierLength();
	public int getColumnMaximumIdentifierLength();
	public int getTriggerMaximumIdentifierLength();
	public int getPrimarykeyIdentifierLength();
	public int getForeignKeyMaximumIdentifierLength();
	public int getCheckConstraintMaximumIdentifierLength();
	public int getNicknameMaximumIdentifierLength();
	public int getUserDefinedTypeMaximumIdentifierLength();
	public int getTablespaceMaximumIdentifierLength();
	
	public List getPredefinedDataTypeDefinitionsByJDBCEnumType(int jdbcEnumType);
	public List getPredefinedDataTypesByJDBCEnumType(int jdbcEnumType);
	
	public PredefinedDataType getPredefinedDataType(String dataTypeName);
	public PredefinedDataTypeDefinition getPredefinedDataTypeDefinition(String dataTypeName);
	public PredefinedDataType getPredefinedDataType(PredefinedDataTypeDefinition predefinedDataTypeDefinition);
	
	public PredefinedDataTypeDefinition getPredefinedDataTypeDefinitionByNameAndJDBCEnumType(String dataTypeName, int jdbcEnumType);
	public PredefinedDataType getPredefinedDataTypeByNameAndJDBCEnumType(String dataTypeName, int jdbcEnumType);
	
	public String getPredefinedDataTypeFormattedName(PredefinedDataType predefinedDataType);
		
	public DDLParser getDdlParser();

	public ICatalogProvider getDatabaseCatalogProvider();

	public DDLGenerator getDDLGenerator();
	public DeltaDDLGenerator getDeltaDDLGenerator();
	public boolean supportsXML();
	
	public DebuggerDefinition getDebuggerDefinition();
	public boolean supportsEvents();
	public boolean supportsSQLUDFs();
	public boolean supportsStoredProcedures();
}
