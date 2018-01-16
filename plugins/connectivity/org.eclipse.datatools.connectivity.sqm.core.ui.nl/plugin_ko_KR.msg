###############################################################################
# Copyright (c) 2001, 2004, 2008 IBM Corporation and others.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
# 
# Contributors:
#     IBM Corporation - initial API and implementation
###############################################################################
pluginName=Eclipse Data Tools Platform SQM UI Plug-in
providerName=Eclipse Data Tools Platform

#
## Extension Point Names
#
LABEL_SERVICE_EXTENSION_POINT_NAME=labelService
ELEMENT_ID_EXTENSION_POINT_NAME=elementID
MARKER_NAVIGATION_PROVIDER_EXTENSION_POINT_NAME=markerNavigationProvider
DATA_SOURCE_EXPLORER_SORTER=sorterValidatorProvider
FILTER_INFORMATION_EXTENSION_POINT_NAME=filterInformation

#
## Model Explorer Selection
#
datatools.core.ui.modelExplorerSelection = �� Ž���� ����

#
## Preferences for Label Decoration
#
datatools.core.ui.preferences.labeldecorators = ���̺� ���

#
## Preferences
#
datatools.core.ui.preferences.data = SQL ����
datatools.core.ui.preferences.output = ���

#
## Views
#
datatools.core.ui.modelElementProperties = ������ �� ��� �Ӽ�
datatools.core.ui.views.interactiveSQL = SQL ǥ��

#
## Model Explorer
#
datatools.core.ui.contentProviders = ������ �� ������ ������
datatools.core.ui.parserProviders = ������ �� �ļ� ������
datatools.core.ui.iconProviders = ������ �� ������ ������

#
## Nature 
#
datatools.core.ui.projectNature = �����ͺ��̽� ������Ʈ ������ Ư��

#
## Wizards
# 
datatools.core.ui.category.project = �����ͺ��̽�
datatools.core.ui.category.model = �����ͺ��̽� ��
datatools.core.ui.project.basic = ������ ������ ������Ʈ
datatools.core.ui.project.description = ������ ������ ������Ʈ ����
datatools.core.ui.model.basic = ������ ������ ��

#
## Preferences
#
datatools.core.ui.preferences.modeler = ������
datatools.core.ui.preferences.default = �����ͺ��̽� �⺻��

#
## Popup && Actions
#
datatools.core.ui.actions.close = �ݱ�
datatools.core.ui.actions.add = SQL �߰�
datatools.core.ui.actions.addMQT = MQT
datatools.core.ui.actions.addSchema = ��Ű��
datatools.core.ui.actions.addTable = ���̺�
datatools.core.ui.actions.addView = ��
datatools.core.ui.actions.addColumn = ��
datatools.core.ui.actions.delete = ����
datatools.core.ui.actions.addTrigger = Ʈ����
datatools.core.ui.globalActionHandlerProviders = ������ ���� �۾�
datatools.core.ui.actions.selectSupplier = UNIQUE ���� ���� ���̺��� �̵�
datatools.core.ui.actions.fe=DDL ����...
datatools.core.ui.actions.re=DDL�κ��� ������ �����Ͼ...
datatools.core.ui.actions.dataModeler = ������ �𵨷�
datatools.core.ui.actions.addDomain = ������
datatools.core.ui.actions.addSequence = ������
datatools.core.ui.actions.addStoredProcedure = ����� ���ν���
datatools.core.ui.actions.addJavaStoredProcedure = Java ����� ���ν���
datatools.core.ui.actions.generateForeignKeyIndex = �ε���
datatools.core.ui.actions.generatePrimaryKeyIndex = �ε���
datatools.core.ui.actions.addDatabase = �����ͺ��̽�
datatools.core.ui.actions.addTableIndex = �ε���
datatools.core.ui.actions.addTableCheckConstraint = CHECK ���� ����
datatools.core.ui.actions.addUniqueConstraint = UNIQUE ���� ����
datatools.core.ui.actions.addAlias = ��Ī
datatools.core.ui.actions.addDistinctUDT = ���� ����� ���� ����
datatools.core.ui.actions.addStructuredUDT = ������ ����� ���� ����
datatools.core.ui.actions.addMQTIndex = �ε���
datatools.core.ui.actions.addMQTTrigger = Ʈ����
#
## Editors
#
datatools.core.ui.model.editor = SQL �� ������

#
## Decorators
#
datatools.core.ui.modelexplorer.modelExplorerColumnDecoration = ������ ����- �� ������ ����
datatools.core.ui.modelexplorer.modelExplorerForeignKeyDecoration = ������ ���� - �ܷ� Ű �Ǵ� �⺻ Ű ǥ��
datatools.core.ui.modelexplorer.DependencyDecoration = ������ ���� - ���� ���
datatools.core.ui.modelexplorer.bookmarkDecoration  = ������ ���� - å���� ǥ�ñ�
datatools.core.ui.modelexplorer.filterDecoration = ������ ���� - ���� Ž���� ���� ��� ǥ�ñ�
datatools.core.ui.modelexplorer.indextriggerDecoration = ������ ���� - �ε��� �� Ʈ���� ���

#
## Model Explorer Sorter Provider
#
datatools.core.ui.modelexplorer.sorterProviders = �� Ž���� ���� ������
datatools.core.ui.modelexplorer.menu.storageOrderSorter = ����� ����
datatools.core.ui.modelexplorer.menu.name = �̸�
datatools.core.ui.modelexplorer.menu.type = ����
datatools.core.ui.modelexplorer.menu.stereotype = ���׷���Ÿ��
datatools.core.ui.modelexplorer.menu.visibility = ǥ�� ����

#
## Model Explorer DnD
#
datatools.core.ui.modelexplorer.dragDrop = ��� ����

#
## Marker
#
datatools.core.ui.modelexplorer.marker.dangling = ���� ����


#
## Type for Label Service 
#
database = �����ͺ��̽�
schema = ��Ű��
baseTable = ���̺�
column = ��
domain = ������
udt = ����� ���� ����
index = �ε���
procedure = ����� ���ν���
view = ��
parameter = Parameter
trigger = Ʈ����
sequence = ������
source= ����
attributeDefinition = Ư�� ����
function = ����� ���� �Լ�
dependency = ���� ����
primaryKey = �⺻ Ű
foreignKey = �ܷ� Ű
folder = ���� ����
CheckConstraint = CHECK ���� ����
UniqueConstraint = UNIQUE ���� ����
existingConnection = ���� ����
connectedConnection = �ǽð� ����
disconnectedConnection = ���� ����
cachedConnection = ĳ�õ� ����
catalog = īŻ�α�
user = �����
group = �׷�
role = ����
authorization = ���� ID

DEFAULT_SCHEMA_FILTER_PROPERTY_PAGE_NAME=�⺻�� ��Ű�� ����
DEFAULT_TABLE_FILTER_PROPERTY_PAGE_NAME=�⺻�� ���̺� ����
DEFAULT_STORED_PROCEDURE_FILTER_PROPERTY_PAGE_NAME=�⺻�� ����� ���ν��� ����
FILTER_SETTINGS_PROPERTY_PAGE_NAME=���� ����