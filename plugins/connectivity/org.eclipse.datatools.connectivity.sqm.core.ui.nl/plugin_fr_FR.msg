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
datatools.core.ui.modelExplorerSelection = S�lection d'explorateur de mod�le

#
## Preferences for Label Decoration
#
datatools.core.ui.preferences.labeldecorators = D�corations d'�tiquettes

#
## Preferences
#
datatools.core.ui.preferences.data = D�veloppement SQL
datatools.core.ui.preferences.output = Sortie

#
## Views
#
datatools.core.ui.modelElementProperties = Propri�t�s d'�l�ments de mod�les de donn�es
datatools.core.ui.views.interactiveSQL = Afficher SQL

#
## Model Explorer
#
datatools.core.ui.contentProviders = Fournisseur de contenu de mod�le physique
datatools.core.ui.parserProviders = Fournisseur d'analyseur de mod�le physique
datatools.core.ui.iconProviders = Fournisseur d'ic�ne de mod�le physique

#
## Nature 
#
datatools.core.ui.projectNature = Nature des donn�es des projets de la base de donn�es

#
## Wizards
# 
datatools.core.ui.category.project = Base de donn�es
datatools.core.ui.category.model = Mod�le de base de donn�es
datatools.core.ui.project.basic = Projet de conception de donn�es
datatools.core.ui.project.description = Cr�er un projet de conception de donn�es
datatools.core.ui.model.basic = Mod�le de donn�es physique

#
## Preferences
#
datatools.core.ui.preferences.modeler = Donn�es
datatools.core.ui.preferences.default = D�fauts de la base de donn�es

#
## Popup && Actions
#
datatools.core.ui.actions.close = Fermer
datatools.core.ui.actions.add = Ajouter un SQL
datatools.core.ui.actions.addMQT = MQT
datatools.core.ui.actions.addSchema = Sch�ma
datatools.core.ui.actions.addTable = Table
datatools.core.ui.actions.addView = Vue
datatools.core.ui.actions.addColumn = Colonne
datatools.core.ui.actions.delete = Supprimer
datatools.core.ui.actions.addTrigger = D�clencheur
datatools.core.ui.globalActionHandlerProviders = Actions globales de donn�es
datatools.core.ui.actions.selectSupplier = Naviguer vers une table de contraintes unique
datatools.core.ui.actions.fe=G�n�rer un DDL...
datatools.core.ui.actions.re=Ing�nierie inverse � partir d'un DDL...
datatools.core.ui.actions.dataModeler = Modeleur de donn�es
datatools.core.ui.actions.addDomain = Domaine
datatools.core.ui.actions.addSequence = S�quence
datatools.core.ui.actions.addStoredProcedure = Proc�dure stock�e
datatools.core.ui.actions.addJavaStoredProcedure = Proc�dure stock�e Java
datatools.core.ui.actions.generateForeignKeyIndex = Index
datatools.core.ui.actions.generatePrimaryKeyIndex = Index
datatools.core.ui.actions.addDatabase = Base de donn�es
datatools.core.ui.actions.addTableIndex = Index
datatools.core.ui.actions.addTableCheckConstraint = Contrainte de v�rification
datatools.core.ui.actions.addUniqueConstraint = Contrainte unique
datatools.core.ui.actions.addAlias = Pseudo
datatools.core.ui.actions.addDistinctUDT = Type distinct d�fini par l'utilisateur
datatools.core.ui.actions.addStructuredUDT = Type structur� d�fini par l'utilisateur
datatools.core.ui.actions.addMQTIndex = Index
datatools.core.ui.actions.addMQTTrigger = D�clencheur
#
## Editors
#
datatools.core.ui.model.editor = Editeur de mod�le SQL

#
## Decorators
#
datatools.core.ui.modelexplorer.modelExplorerColumnDecoration = Outils de donn�es - Type de donn�es de colonne
datatools.core.ui.modelexplorer.modelExplorerForeignKeyDecoration = Outils de donn�es - Indicateur de cl� principale ou �trang�re
datatools.core.ui.modelexplorer.DependencyDecoration = Outils de donn�es - D�coration de d�pendance
datatools.core.ui.modelexplorer.bookmarkDecoration  = Outils de donn�es - Indicateur de signet
datatools.core.ui.modelexplorer.filterDecoration = Outils de donn�es - Indicateur du n�ud de filtre de l'explorateur du serveur
datatools.core.ui.modelexplorer.indextriggerDecoration = Outils de donn�es - D�coration du d�clencheur et de l'index

#
## Model Explorer Sorter Provider
#
datatools.core.ui.modelexplorer.sorterProviders = Fournisseur de tri d'explorateur de mod�le
datatools.core.ui.modelexplorer.menu.storageOrderSorter = Ordre de stockage
datatools.core.ui.modelexplorer.menu.name = Nom
datatools.core.ui.modelexplorer.menu.type = Type
datatools.core.ui.modelexplorer.menu.stereotype = St�r�otype
datatools.core.ui.modelexplorer.menu.visibility = Visibilit�

#
## Model Explorer DnD
#
datatools.core.ui.modelexplorer.dragDrop = Glisser-D�placer

#
## Marker
#
datatools.core.ui.modelexplorer.marker.dangling = R�f�rence pendante


#
## Type for Label Service 
#
database = Base de donn�es
schema = Sch�ma
baseTable = Table
column = Colonne
domain = Domaine
udt = Type d�fini par l'utilisateur
index = Index
procedure = Proc�dure stock�e
view = Vue
parameter = Param�tre
trigger = D�clencheur
sequence = S�quence
source= Source
attributeDefinition = D�finition d'attribut
function = Fonction d�finie par l'utilisateur
dependency = D�pendance
primaryKey = Cl� principale
foreignKey = Cl� �trang�re
folder = Dossier logique
CheckConstraint = Contrainte de v�rification
UniqueConstraint = Contrainte unique
existingConnection = Dossier de connexions
connectedConnection = Connexion directe
disconnectedConnection = Connexion d�connect�e
cachedConnection = Connexion en cache
catalog = Catalogue
user = Utilisateur
group = Groupe
role = R�le
authorization = ID d'autorisation

DEFAULT_SCHEMA_FILTER_PROPERTY_PAGE_NAME=Filtre de sch�ma par d�faut
DEFAULT_TABLE_FILTER_PROPERTY_PAGE_NAME=Filtre de table par d�faut
DEFAULT_STORED_PROCEDURE_FILTER_PROPERTY_PAGE_NAME=Filtre de proc�dure stock�e par d�faut
FILTER_SETTINGS_PROPERTY_PAGE_NAME=Param�tres de filtre
