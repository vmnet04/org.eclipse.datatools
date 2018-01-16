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

DataTypeResolver.DATA_TYPE_UNDETERMINED 		= "{0}"�� ������ ������ Ȯ���� �� �����ϴ�.
DataTypeResolver.VARIABLE_TYPE_UNDETERMINED 	= ���� "{0}"�� ������ ������ Ȯ���� �� �����ϴ�.
DataTypeResolver.DATA_TYPES_INCOMPATIBLE		= "{0}"��(��) "{1}"�� ������ ������ ȣȯ���� �ʽ��ϴ�.

TableReferenceResolver.SCHEMAS_NOT_LOADED   	= �����ͺ��̽� ��Ű���� ã�� �� �����ϴ�. �����ͺ��̽� ���� "{0}"��(��) Ȯ���Ͻʽÿ�.
TableReferenceResolver.UNRESOLVED_COLUMN		= �� "{0}"�� ���̺��� ã�� �� �����ϴ�.
TableReferenceResolver.UNRESOLVED_TABLE			= ���̺� "{0}"��(��) ã�� �� �����ϴ�.
TableReferenceResolver.TABLE_HAS_NO_SUCH_COLUMN	= ���̺� "{0}"�� �� "{1}"��(��) �����ϴ�.
TableReferenceResolver.AMBIGUOUS_COLUMN			= �� �̸� "{0}"��(��) ��ȣ�մϴ�.
TableReferenceResolver.AMBIGUOUS_TABLE			= ���̺� �̸� "{0}"��(��) ��ȣ�մϴ�.
TableReferenceResolver.AMBIGUOUS_TABLE_ALIAS	= ���̺� ��Ī "{0}"��(��) ��ȣ�մϴ�.

RoutineReferenceResolver.UNRESOLVED_PROC        = ���ν����� ã�� �� �����ϴ�.
RoutineReferenceResolver.INCORRECT_PARM_COUNT	= �Ű� ���� ���� �߸��Ǿ����ϴ�.

#
# following messages to translate names of syntax rules that were violated and caused parser error
# fill-ins - no sentences! first letter should be lower case if not a KEYWORD
#
! uppercase words are keywords and not to be translated
! "predicate" is a SQL language term equivalent to the word "test"
! "term", "factor" are closely related to mathematical terms "term" and "factor"
SQLQueryParser.<alias_name> 					= ��Ī �̸�
SQLQueryParser.<all_or_any_cond>		 		= ����ȭ�� ��
SQLQueryParser.<as_alias> 						= AS ��Ī �̸�
SQLQueryParser.<boolean_expression>				= �ο� �� ��
SQLQueryParser.<boolean_factor> 				= �ο� �μ�
SQLQueryParser.<boolean_primary> 				= �ο� �⺻
SQLQueryParser.<boolean_term> 					= �ο� ��
SQLQueryParser.<boolean_values> 				= ��� ��
SQLQueryParser.<case_expression> 				= CASE ��
SQLQueryParser.<case_search_when> 				= WHEN-THEN ����
SQLQueryParser.<case_search_when_list> 			= WHEN-THEN ���� ���
SQLQueryParser.<case_simple_when> 				= WHEN-THEN ��
SQLQueryParser.<case_simple_when_list>	 		= WHEN-THEN �� ���
SQLQueryParser.<cast_expression> 				= CAST ��
SQLQueryParser.<column> 						= ��
SQLQueryParser.<column_name> 					= �� �̸�
SQLQueryParser.<column_name_list> 				= �� �̸� ���
SQLQueryParser.<column_ref> 					= �� ����
SQLQueryParser.<condition> 						= ����
SQLQueryParser.<constant> 						= �ܼ� ��
SQLQueryParser.<datatype> 						= ������ ����
SQLQueryParser.<datatype_array_type> 			= ARRAY ������ ����
SQLQueryParser.<datatype_binary> 				= ���� ������ ����
SQLQueryParser.<datatype_predefined>			= �̸� ���ǵ� ������ ����
SQLQueryParser.<datatype_character> 			= ���� ������ ����
SQLQueryParser.<datatype_character_national>	= ������ ���� ������ ����
SQLQueryParser.<datatype_collection_type> 		= �÷��� ������ ����
SQLQueryParser.<datatype_date> 					= ��¥ ������ ����
SQLQueryParser.<datatype_multiset_type> 		= MULTISET ������ ����
SQLQueryParser.<datatype_numerical> 			= ���� ������ ����
SQLQueryParser.<datatype_numerical_approximate>	= �ٻ�ġ ������ ����
SQLQueryParser.<datatype_numerical_exact> 		= ��Ȯ�� ��ġ ������ ����
SQLQueryParser.<datatype_numerical_fixed_precision>	= ���� ���е� ���� ������ ����
SQLQueryParser.<datatype_numerical_integer> 	= ���� ������ ����
SQLQueryParser.<datatype_opt_size_unit> 		= ������ ���� �¼�(K, M �Ǵ� G)
SQLQueryParser.<datatype_time> 					= �ð� ������ ����
SQLQueryParser.<datatype_user_defined_distinct>	= ���� ����� ���� ������ ����
SQLQueryParser.<delete_stmt> 					= DELETE ��
SQLQueryParser.<duration> 						= �Ⱓ
SQLQueryParser.<exists> 						= EXISTS �˻�
SQLQueryParser.<expression> 					= �� ��
SQLQueryParser.<expression_commalist> 			= �� ���� ��ǥ�� ���е� ���
SQLQueryParser.<expression_commalist_multiple_elements>	= �� ���� ��ǥ�� ���е� ���(���� ���)
SQLQueryParser.<expression_factor> 				= �� �� �μ�
SQLQueryParser.<expression_term>		 		= �� �� ��
SQLQueryParser.<func_ref> 						= �Լ� ����
SQLQueryParser.<function> 						= �Լ�
SQLQueryParser.<grouping> 						= GROUP BY ��
SQLQueryParser.<grouping_exp> 					= �׷�ȭ ��
SQLQueryParser.<grouping_sets> 					= GROUPING SETS
SQLQueryParser.<grouping_sets_element> 			= GROUPING SETS ���
SQLQueryParser.<grouping_sets_element_exp> 		= GROUPING SETS ��� ��
SQLQueryParser.<grouping_sets_element_exp_list>	= GROUPING SETS ��� �� ���
SQLQueryParser.<grouping_sets_element_list> 	= GROUPING SETS ��� ���
SQLQueryParser.<grouping_spec> 					= GROUP BY ���
SQLQueryParser.<grouping_spec_list> 			= GROUP BY ��� ���
SQLQueryParser.<identifier> 					= ID
SQLQueryParser.<in_cond> 						= IN �˻�
SQLQueryParser.<insert_row> 					= �� ����
SQLQueryParser.<insert_row_commalist> 			= ��ǥ�� ���е� �� ���� ���
SQLQueryParser.<insert_stmt> 					= INSERT ��
SQLQueryParser.<intervaltest> 					= BETWEEN �˻�
SQLQueryParser.<liketest> 						= LIKE �˻�
! "predicate" here could also be "test" 
SQLQueryParser.<nulltest> 						= NULL �˻�
SQLQueryParser.<opt_all_distinct> 				= ALL �Ǵ� DISTINCT
SQLQueryParser.<opt_as> 						= �ɼ� AS
SQLQueryParser.<opt_as_alias> 					= �ɼ� AS ��Ī �̸�
SQLQueryParser.<opt_as_target_table> 			= �ɼ� AS ��� ���̺�
SQLQueryParser.<opt_asc_desc> 					= �ɼ� ASC �Ǵ� DESC
SQLQueryParser.<opt_case_else> 					= �ɼ� ELSE ���
SQLQueryParser.<opt_column_name_list> 			= �� �̸� �ɼ� ���
SQLQueryParser.<opt_escape> 					= �ɼ� ESCAPE ��
SQLQueryParser.<opt_expression_commalist> 		= �� ���� ��ǥ�� ���е� �ɼ� ���
SQLQueryParser.<opt_group_by_clause> 			= �ɼ� GROUP BY ��
SQLQueryParser.<opt_having_clause> 				= �ɼ� HAVING ��
SQLQueryParser.<opt_join_type> 					= �ɼ� JOIN ����
SQLQueryParser.<opt_join_type_outer> 			= �ɼ� OUTER
SQLQueryParser.<opt_order_by_clause> 			= �ɼ� ORDER BY ��
! "Schema" is a database related term
SQLQueryParser.<opt_schema_dot> 				= �ɼ� ��Ű�� ������
! "table" is a database related term
SQLQueryParser.<opt_table_correlation> 			= �ɼ� ���̺� ��Ī
SQLQueryParser.<opt_target_column_list> 		= ��� �� �ɼ� ���
SQLQueryParser.<opt_where_clause> 				= �ɼ� WHERE ��
SQLQueryParser.<ordering_spec> 					= ���� ���
SQLQueryParser.<ordering_spec_commalist> 		= ���� ����� ��ǥ�� ���е� ���
SQLQueryParser.<parameter> 						= �Ű� ����
SQLQueryParser.<project> 						= ���� �׸�
SQLQueryParser.<query_combined> 				= ���� ����
SQLQueryParser.<query_combined_operator>		= ���� ���� ������ UNION, EXCEPT �Ǵ� INTERSECT
SQLQueryParser.<query_exp>						= ���� ��
SQLQueryParser.<query_exp_root>					= ���� ��
SQLQueryParser.<query_select>					= SELECT ����
SQLQueryParser.<query_stmt>						= SQL ���� ��
SQLQueryParser.<query_term>						= ���� ��
SQLQueryParser.<query_values>					= VALUES ���̺� ������
SQLQueryParser.<relop>							= ������ ������
SQLQueryParser.<scalcomp>						= ��Į�� ��
SQLQueryParser.<schema>							= ��Ű��
SQLQueryParser.<selection>						= ���� �׸�
SQLQueryParser.<simplecomp>						= �ܼ� ��
SQLQueryParser.<special_register>				= Ư�� ���
SQLQueryParser.<sql_dml_stmt>					= SQL DML ��
SQLQueryParser.<sql_dml_stmt_list>				= SQL DML �� ���
SQLQueryParser.<sql_dml_stmt_xspan>				= SQL DML �� ���
SQLQueryParser.<subquery>						= ���� ����
SQLQueryParser.<super_groups>					= CUBE �Ǵ� ROLLUP �׷�ȭ
SQLQueryParser.<super_groups_element>			= �׷�ȭ ��
SQLQueryParser.<super_groups_element_exp>		= �׷�ȭ ��
SQLQueryParser.<super_groups_element_exp_list>	= �׷�ȭ �� ���
SQLQueryParser.<super_groups_element_list>		= �׷�ȭ �� ���
SQLQueryParser.<table>							= ���̺�
SQLQueryParser.<table_correlation>				= ���̺� ��Ī
SQLQueryParser.<table_join>						= ���ε� ���̺�
SQLQueryParser.<table_name_or_alias> 			= ���̺� �̸� �Ǵ� ���̺� ��Ī
SQLQueryParser.<table_query>					= ��ø�� ���̺� ����
SQLQueryParser.<table_ref>						= ���̺� ����
SQLQueryParser.<table_ref_commalist>			= ��ǥ�� ���е� ���̺� ������ ���
SQLQueryParser.<target_column_list>				= ��� �� ���
SQLQueryParser.<target_table>					= ��� ���̺�
SQLQueryParser.<update_assignment_clause>		= UPDATE �Ҵ� ��
SQLQueryParser.<update_assignment_expression>	= UPDATE �Ҵ� ��
SQLQueryParser.<update_assignment_expression_commalist>	= ��ǥ�� ���е� UPDATE �Ҵ� �� ���
SQLQueryParser.<update_stmt>					= UPDATE ��
SQLQueryParser.<values_row>						= �� ��
SQLQueryParser.<values_row>						= �� ��
SQLQueryParser.<values_row_commalist>			= ��ǥ�� ���е� �� �� ���
SQLQueryParser.<with_clause>					= WITH ��
SQLQueryParser.<with_table_spec>				= WITH ���̺� ���
SQLQueryParser.<with_table_spec_list>			= WITH BY ��� ���



SQLQueryDB2Parser.<olap_aggregation_function>	= OLAP ���� �Լ�
SQLQueryDB2Parser.<olap_current_row>			= CURRENT ROW
SQLQueryDB2Parser.<olap_function>				= OLAP �Լ�
SQLQueryDB2Parser.<olap_group_end>				= FOLLOWING ��
SQLQueryDB2Parser.<olap_group_start>			= PRECEDING ��
SQLQueryDB2Parser.<olap_group_type>				= OLAP �׷�ȭ ����
SQLQueryDB2Parser.<olap_numbering_function>		= OLAP ��ȣ �ű�� �Լ�
SQLQueryDB2Parser.<olap_order_by_expression>	= OLAP ORDER BY ��
SQLQueryDB2Parser.<olap_order_by_list>			= OLAP ORDER BY �� ���
SQLQueryDB2Parser.<olap_partitioning_expression_list>	= OLAP ���� �� ���
SQLQueryDB2Parser.<olap_partitioning_expression>		= OLAP ���� ��
SQLQueryDB2Parser.<olap_rank_or_dense_rank>				= RANK() �Ǵ� DENSE_RANK()
SQLQueryDB2Parser.<olap_ranking_function>				= OLAP ���� �Լ�
SQLQueryDB2Parser.<olap_rows_or_range>					= ROWS �Ǵ� RANGE
SQLQueryDB2Parser.<olap_window_order_clause>			= OLAP â ���� ��
SQLQueryDB2Parser.<opt_olap_asc_desc>					= OLAP ASC/DESC ���
SQLQueryDB2Parser.<opt_olap_window_aggregation_group>	= �ɼ� OLAP â ���� �׷�
SQLQueryDB2Parser.<opt_olap_window_order_agregration_group>	= �ɼ� OLAP â ���� ���� �׷�
SQLQueryDB2Parser.<opt_olap_window_order_clause>			= �ɼ� OLAP â ���� ��
SQLQueryDB2Parser.<opt_olap_window_parition_clause>			= �ɼ� OLAP â ��Ƽ�� ��

SQLQueryDB2Parser.<opt_xml_element_attributes_function>		= �ɼ� XMLATTRIBUTES �Լ�
SQLQueryDB2Parser.<opt_xml_element_content_list>			= �ɼ� XML ��� ���� ��
SQLQueryDB2Parser.<opt_xml_element_namespaces_function>		= �ɼ� XMLNAMESPACES �Լ�
SQLQueryDB2Parser.<opt_xml_forest_namespaces_function>		= �ɼ� XMLNAMESPACES �Լ�
SQLQueryDB2Parser.<xml_agg_function>			= XMLAGG �Լ�
SQLQueryDB2Parser.<xml_attribute_list>			= XML Ư�� �� ���
SQLQueryDB2Parser.<xml_attribute>				= XML Ư�� ��
SQLQueryDB2Parser.<xml_attributes_function>		= XMLATTRIBUTES �Լ�
SQLQueryDB2Parser.<xml_concat_function>			= XMLCONCAT �Լ�
SQLQueryDB2Parser.<xml_element_content_list>	= XML ��� ���� �� ���
SQLQueryDB2Parser.<xml_element_content>			= XML ��� ���� ��
SQLQueryDB2Parser.<xml_element_function>		= XMLELEMENT �Լ�
SQLQueryDB2Parser.<xml_forest_element_list>		= XML SETS ������Ʈ ��� ���
SQLQueryDB2Parser.<xml_forest_element>			= XMLFOREST ��� ��
SQLQueryDB2Parser.<xml_forest_function>			= XMLFOREST �Լ� XMLSERIALIZE �Ǵ� XML2CLOB
SQLQueryDB2Parser.<xml_function>				= XML �Լ� 
SQLQueryDB2Parser.<xml_namespace_list>			= XML ���ӽ����̽� ���
SQLQueryDB2Parser.<xml_namespace_prefix>		= XML ���ӽ����̽� ���λ�
SQLQueryDB2Parser.<xml_namespace_uri>			= XML ���ӽ����̽� URI
SQLQueryDB2Parser.<xml_namespace>				= XML ���ӽ����̽�
SQLQueryDB2Parser.<xml_namespaces_function>		= XMLNAMESPACES �Լ�
SQLQueryDB2Parser.<xml_value_datatype>			= XML �� ������ ����
SQLQueryDB2Parser.<xml_value_function_list>		= XML �� �Լ� ���
SQLQueryDB2Parser.<xml_value_function>			= XML �� �Լ�

