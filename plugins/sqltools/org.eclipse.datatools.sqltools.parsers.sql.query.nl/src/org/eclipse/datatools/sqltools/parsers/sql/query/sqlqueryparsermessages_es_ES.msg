# NLS_MESSAGEFORMAT_VAR          needed to handle quotes correctly
#
# File: sqlqueryparsermessage.properties
# Description: Properties file for classes in the SQLQueryParser Plugin

# ==============================================================================
# Copyright (c) 2004, 2005 IBM Corporation and others.
# All rights reserved. This program and the accompanying materials 
# are made available under the terms of the Eclipse Public License v1.0
# which is available at
# http://www.eclipse.org/legal/epl-v10.html
# ==============================================================================

DataTypeResolver.DATA_TYPE_UNDETERMINED 		= No se han podido determinar los tipos de datos de "{0}".
DataTypeResolver.VARIABLE_TYPE_UNDETERMINED 	= No se han podido determinar los tipos de datos de la variable "{0}".
DataTypeResolver.DATA_TYPES_INCOMPATIBLE		= Los tipos de datos de "{0}" y "{1}" son incompatibles.

TableReferenceResolver.SCHEMAS_NOT_LOADED   	= No se han podido encontrar los esquemas de base de datos. Compruebe la conexi�n de la base de datos "{0}".
TableReferenceResolver.UNRESOLVED_COLUMN		= No es posible encontrar tabla para la columna "{0}".
TableReferenceResolver.UNRESOLVED_TABLE			= No es posible encontrar la tabla "{0}".
TableReferenceResolver.TABLE_HAS_NO_SUCH_COLUMN	= La tabla "{0}" no contiene la columna "{1}".
TableReferenceResolver.AMBIGUOUS_COLUMN			= El nombre de columna "{0}" es ambiguo.
TableReferenceResolver.AMBIGUOUS_TABLE			= El nombre de tabla "{0}" es ambiguo.
TableReferenceResolver.AMBIGUOUS_TABLE_ALIAS	= El alias de tabla "{0}" es ambiguo.

RoutineReferenceResolver.UNRESOLVED_PROC        = No es posible encontrar el procedimiento.
RoutineReferenceResolver.INCORRECT_PARM_COUNT	= N�mero incorrecto de par�metros.

#
# following messages to translate names of syntax rules that were violated and caused parser error
# fill-ins - no sentences! first letter should be lower case if not a KEYWORD
#
! uppercase words are keywords and not to be translated
! "predicate" is a SQL language term equivalent to the word "test"
! "term", "factor" are closely related to mathematical terms "term" and "factor"
SQLQueryParser.<alias_name> 					= nombre de alias
SQLQueryParser.<all_or_any_cond>		 		= comparaci�n cuantificada
SQLQueryParser.<as_alias> 						= nombre de alias AS
SQLQueryParser.<boolean_expression>				= expresi�n de valores booleanos
SQLQueryParser.<boolean_factor> 				= factor booleano
SQLQueryParser.<boolean_primary> 				= primario booleano
SQLQueryParser.<boolean_term> 					= t�rmino booleano
SQLQueryParser.<boolean_values> 				= valor true
SQLQueryParser.<case_expression> 				= expresi�n CASE
SQLQueryParser.<case_search_when> 				= condici�n WHEN-THEN
SQLQueryParser.<case_search_when_list> 			= lista de condiciones WHEN-THEN
SQLQueryParser.<case_simple_when> 				= expresi�n WHEN-THEN
SQLQueryParser.<case_simple_when_list>	 		= lista de expresiones WHEN-THEN
SQLQueryParser.<cast_expression> 				= expresi�n CAST
SQLQueryParser.<column> 						= columna
SQLQueryParser.<column_name> 					= nombre de la columna
SQLQueryParser.<column_name_list> 				= lista de nombres de columnas
SQLQueryParser.<column_ref> 					= referencia de columna
SQLQueryParser.<condition> 						= cl�usula condicional
SQLQueryParser.<constant> 						= valor simple
SQLQueryParser.<datatype> 						= tipo de datos
SQLQueryParser.<datatype_array_type> 			= tipo de datos ARRAY
SQLQueryParser.<datatype_binary> 				= tipo de datos binarios
SQLQueryParser.<datatype_predefined>			= tipo de datos predefinido
SQLQueryParser.<datatype_character> 			= tipo de caracteres
SQLQueryParser.<datatype_character_national>	= tipo de datos de caracteres nacionales
SQLQueryParser.<datatype_collection_type> 		= tipo de datos de colecci�n
SQLQueryParser.<datatype_date> 					= tipo de datos de fecha
SQLQueryParser.<datatype_multiset_type> 		= tipo de datos MULTISET
SQLQueryParser.<datatype_numerical> 			= tipo de datos num�ricos
SQLQueryParser.<datatype_numerical_approximate>	= tipo de datos num�ricos aproximados
SQLQueryParser.<datatype_numerical_exact> 		= tipo de datos num�ricos exactos
SQLQueryParser.<datatype_numerical_fixed_precision>	= tipo de datos num�ricos de precisi�n fijos
SQLQueryParser.<datatype_numerical_integer> 	= tipo de datos enteros
SQLQueryParser.<datatype_opt_size_unit> 		= multiplicador de longitud de tipo de datos (K, M o G)
SQLQueryParser.<datatype_time> 					= tipo de datos de hora
SQLQueryParser.<datatype_user_defined_distinct>	= tipo de datos de diferenciaci�n definidos por el usuario
SQLQueryParser.<delete_stmt> 					= sentencia DELETE
SQLQueryParser.<duration> 						= duraci�n
SQLQueryParser.<exists> 						= predicado EXISTS
SQLQueryParser.<expression> 					= expresi�n de valor
SQLQueryParser.<expression_commalist> 			= lista separada por comas de expresiones de valor
SQLQueryParser.<expression_commalist_multiple_elements>	= lista separada por comas de expresiones de valor (varios elementos)
SQLQueryParser.<expression_factor> 				= factor de expresi�n de valor
SQLQueryParser.<expression_term>		 		= t�rmino de expresi�n de valor
SQLQueryParser.<func_ref> 						= referencia de funci�n
SQLQueryParser.<function> 						= funci�n
SQLQueryParser.<grouping> 						= cl�usula GROUP BY
SQLQueryParser.<grouping_exp> 					= expresi�n de agrupaci�n
SQLQueryParser.<grouping_sets> 					= GROUPING SETS
SQLQueryParser.<grouping_sets_element> 			= elemento GROUPING SETS
SQLQueryParser.<grouping_sets_element_exp> 		= expresi�n de elementos GROUPING SETS
SQLQueryParser.<grouping_sets_element_exp_list>	= lista de expresiones de elementos GROUPING SETS
SQLQueryParser.<grouping_sets_element_list> 	= lista de elementos GROUPING SETS
SQLQueryParser.<grouping_spec> 					= especificaci�n GROUP BY
SQLQueryParser.<grouping_spec_list> 			= lista de especificaciones GROUP BY
SQLQueryParser.<identifier> 					= identificador
SQLQueryParser.<in_cond> 						= predicado IN
SQLQueryParser.<insert_row> 					= insertar fila
SQLQueryParser.<insert_row_commalist> 			= lista separada por comas de filas insertadas
SQLQueryParser.<insert_stmt> 					= sentencia INSERT
SQLQueryParser.<intervaltest> 					= predicado BETWEEN
SQLQueryParser.<liketest> 						= predicado LIKE
! "predicate" here could also be "test" 
SQLQueryParser.<nulltest> 						= predicado NULL
SQLQueryParser.<opt_all_distinct> 				= ALL o DISTINCT
SQLQueryParser.<opt_as> 						= AS opcional
SQLQueryParser.<opt_as_alias> 					= nombre de alias AS opcional
SQLQueryParser.<opt_as_target_table> 			= tabla de destino de AS
SQLQueryParser.<opt_asc_desc> 					= ASC o DESC opcional
SQLQueryParser.<opt_case_else> 					= caso ELSE opcional
SQLQueryParser.<opt_column_name_list> 			= lista opcional de nombres de columnas
SQLQueryParser.<opt_escape> 					= expresi�n ESCAPE opcional
SQLQueryParser.<opt_expression_commalist> 		= lista separada por comas opcional de expresiones de valor
SQLQueryParser.<opt_group_by_clause> 			= cl�usula GROUP BY opcional
SQLQueryParser.<opt_having_clause> 				= cl�usula HAVING opcional
SQLQueryParser.<opt_join_type> 					= tipo JOIN opcional
SQLQueryParser.<opt_join_type_outer> 			= OUTER opcional
SQLQueryParser.<opt_order_by_clause> 			= cl�usula ORDER BY opcional
! "Schema" is a database related term
SQLQueryParser.<opt_schema_dot> 				= cualificador de esquema opcional
! "table" is a database related term
SQLQueryParser.<opt_table_correlation> 			= alias de tabla opcional
SQLQueryParser.<opt_target_column_list> 		= lista opcional de columnas de destino
SQLQueryParser.<opt_where_clause> 				= cl�usula WHERE opcional
SQLQueryParser.<ordering_spec> 					= especificaci�n de orden
SQLQueryParser.<ordering_spec_commalist> 		= lista separada por comas de especificaciones de orden
SQLQueryParser.<parameter> 						= par�metro
SQLQueryParser.<project> 						= selecci�n
SQLQueryParser.<query_combined> 				= consulta combinada
SQLQueryParser.<query_combined_operator>		= operador de consulta combinada UNION, EXCEPT o INTERSECT
SQLQueryParser.<query_exp>						= expresi�n de consulta
SQLQueryParser.<query_exp_root>					= expresi�n de consulta
SQLQueryParser.<query_select>					= consulta SELECT
SQLQueryParser.<query_stmt>						= sentencia de consulta SQL
SQLQueryParser.<query_term>						= t�rmino de consulta
SQLQueryParser.<query_values>					= constructor de tablas VALUES 
SQLQueryParser.<relop>							= operador relacional
SQLQueryParser.<scalcomp>						= comparaci�n de escala
SQLQueryParser.<schema>							= esquema
SQLQueryParser.<selection>						= selecci�n
SQLQueryParser.<simplecomp>						= comparaci�n simple
SQLQueryParser.<special_register>				= registro especial
SQLQueryParser.<sql_dml_stmt>					= sentencia SQL DML
SQLQueryParser.<sql_dml_stmt_list>				= lista de especificaciones SQL DML
SQLQueryParser.<sql_dml_stmt_xspan>				= lista de especificaciones SQL DML
SQLQueryParser.<subquery>						= subconsulta
SQLQueryParser.<super_groups>					= agrupaci�n CUBE o ROLLUP
SQLQueryParser.<super_groups_element>			= expresi�n de agrupaci�n
SQLQueryParser.<super_groups_element_exp>		= expresi�n de agrupaci�n
SQLQueryParser.<super_groups_element_exp_list>	= lista de expresiones de agrupaci�n
SQLQueryParser.<super_groups_element_list>		= lista de expresiones de agrupaci�n
SQLQueryParser.<table>							= tabla.
SQLQueryParser.<table_correlation>				= alias de tabla
SQLQueryParser.<table_join>						= tabla combinada
SQLQueryParser.<table_name_or_alias> 			= nombre de tabla o alias de tabla
SQLQueryParser.<table_query>					= consulta de tabla anidada
SQLQueryParser.<table_ref>						= referencia de tabla
SQLQueryParser.<table_ref_commalist>			= lista separada por comas de referencias de tablas
SQLQueryParser.<target_column_list>				= lista de columnas de destino
SQLQueryParser.<target_table>					= tabla de destino
SQLQueryParser.<update_assignment_clause>		= cl�usula de asignaci�n UPDATE
SQLQueryParser.<update_assignment_expression>	= expresi�n de asignaci�n UPDATE
SQLQueryParser.<update_assignment_expression_commalist>	= lista separada por comas de expresiones de asignaci�n de actualizaci�n
SQLQueryParser.<update_stmt>					= sentencia UPDATE
SQLQueryParser.<values_row>						= fila de valores
SQLQueryParser.<values_row>						= fila de valores
SQLQueryParser.<values_row_commalist>			= lista separada por comas de filas de valores
SQLQueryParser.<with_clause>					= cl�usula WITH
SQLQueryParser.<with_table_spec>				= especificaci�n de tabla WITH
SQLQueryParser.<with_table_spec_list>			= lista de especificaciones de tabla WITH



SQLQueryDB2Parser.<olap_aggregation_function>	= funci�n de agregaci�n OLAP
SQLQueryDB2Parser.<olap_current_row>			= CURRENT ROW
SQLQueryDB2Parser.<olap_function>				= funci�n OLAP
SQLQueryDB2Parser.<olap_group_end>				= expresi�n FOLLOWING
SQLQueryDB2Parser.<olap_group_start>			= expresi�n PRECEDING
SQLQueryDB2Parser.<olap_group_type>				= tipo de agrupaci�n OLAP
SQLQueryDB2Parser.<olap_numbering_function>		= funci�n de numeraci�n OLAP
SQLQueryDB2Parser.<olap_order_by_expression>	= expresi�n OLAP ORDER BY
SQLQueryDB2Parser.<olap_order_by_list>			= lista de expresiones OLAP ORDER BY
SQLQueryDB2Parser.<olap_partitioning_expression_list>	= lista de expresiones de partici�n OLAP
SQLQueryDB2Parser.<olap_partitioning_expression>		= expresi�n de partici�n OLAP
SQLQueryDB2Parser.<olap_rank_or_dense_rank>				= RANK() o DENSE_RANK()
SQLQueryDB2Parser.<olap_ranking_function>				= funci�n de rangos OLAP
SQLQueryDB2Parser.<olap_rows_or_range>					= ROWS o RANGE
SQLQueryDB2Parser.<olap_window_order_clause>			= cl�usula de orden de la ventana OLAP
SQLQueryDB2Parser.<opt_olap_asc_desc>					= especificaci�n OLAP ASC/DESC
SQLQueryDB2Parser.<opt_olap_window_aggregation_group>	= grupo de agregaci�n de la ventana OLAP opcional
SQLQueryDB2Parser.<opt_olap_window_order_agregration_group>	= grupo de agregaci�n de orden de la ventana OLAP opcional
SQLQueryDB2Parser.<opt_olap_window_order_clause>			= cl�usula de orden de la ventana OLAP opcional
SQLQueryDB2Parser.<opt_olap_window_parition_clause>			= cl�usula de partici�n de la ventana OLAP opcional

SQLQueryDB2Parser.<opt_xml_element_attributes_function>		= funci�n XMLATTRIBUTES opcional
SQLQueryDB2Parser.<opt_xml_element_content_list>			= lista opcional de expresiones de contenido de elementos XML
SQLQueryDB2Parser.<opt_xml_element_namespaces_function>		= funci�n XMLNAMESPACES opcional
SQLQueryDB2Parser.<opt_xml_forest_namespaces_function>		= funci�n XMLNAMESPACES opcional
SQLQueryDB2Parser.<xml_agg_function>			= funci�n XMLAGG
SQLQueryDB2Parser.<xml_attribute_list>			= lista de expresiones de atributos XML
SQLQueryDB2Parser.<xml_attribute>				= expresi�n de atributos XML
SQLQueryDB2Parser.<xml_attributes_function>		= funci�n XMLATTRIBUTES
SQLQueryDB2Parser.<xml_concat_function>			= funci�n XMLCONCAT
SQLQueryDB2Parser.<xml_element_content_list>	= lista de expresiones de contenido de elementos XML
SQLQueryDB2Parser.<xml_element_content>			= expresi�n de contenido de elementos XML
SQLQueryDB2Parser.<xml_element_function>		= funci�n XMLELEMENT
SQLQueryDB2Parser.<xml_forest_element_list>		= lista de elementos de bosque XML
SQLQueryDB2Parser.<xml_forest_element>			= expresi�n de elementos XMLFOREST
SQLQueryDB2Parser.<xml_forest_function>			= funci�n XMLFOREST XMLSERIALIZE o XML2CLOB
SQLQueryDB2Parser.<xml_function>				= funci�n XML 
SQLQueryDB2Parser.<xml_namespace_list>			= lista de espacios de nombres XML
SQLQueryDB2Parser.<xml_namespace_prefix>		= prefijo de nombre de espacio XML
SQLQueryDB2Parser.<xml_namespace_uri>			= URI de nombre de espacio XML
SQLQueryDB2Parser.<xml_namespace>				= nombre de espacio XML
SQLQueryDB2Parser.<xml_namespaces_function>		= funci�n XMLNAMESPACES
SQLQueryDB2Parser.<xml_value_datatype>			= tipo de datos de valor XML
SQLQueryDB2Parser.<xml_value_function_list>		= lista de funciones de valor XML
SQLQueryDB2Parser.<xml_value_function>			= funci�n de valor XML


