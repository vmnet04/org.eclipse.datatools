#
#************************************************************************
# Copyright (c) 2007 Actuate Corporation.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
#
# Contributors:
#  Actuate Corporation - initial API and implementation
#  
#************************************************************************
#
# Externalized messages of the Web Services Data Source Designer

#page.type.name

# Common

# WebServiceSelectionPage
webServiceSelectionPage.message.default=Source de donn�es Services Web
webServiceSelectionPage.message.error=Sp�cifiez l'URL de point de fin SOAP ou s�lectionnez un descripteur WSDL.
webServiceSelectionPage.group.wsdl=Descripteur WSDL
webServiceSelectionPage.group.endPoint=Point de fin &SOAP
webServiceSelectionPage.group.customClass=&Classe de pilote personnalis�e
webServiceSelectionPage.group.classPath=Che&min de la classe de pilote
webServiceSelectionPage.label.wsdl=Si le descripteur WSDL des Services Web est disponible, entrez son URL ou recherchez son emplacement dans le syst�me de fichiers local.
webServiceSelectionPage.label.wsdlURI=URL ou emplacement du descripteur &WSDL :
webServiceSelectionPage.label.endPoint=Sp�cifiez l'URL du point de fin SOAP. Cette valeur est facultative si le point de fin d�fini dans le WSDL doit �tre utilis�,\nou si vous utilisez une classe de connexion personnalis�e qui ne requiert pas d'URL de point de fin.
webServiceSelectionPage.label.customClass=Si les connexions et les requ�tes vers les Services Web sont effectu�es par l'interm�diaire d'une classe Java personnalis�e, indiquez ici le nom de classe complet.
webServiceSelectionPage.label.classPath=Liste des r�pertoires et des fichiers JAR suppl�mentaires s�par�s par des points-virgules (;) dans laquelle effectuer une recherche de la classe de pilote personnalis�e.
webServiceSelectionPage.button.browse=Pa&rcourir...

# OperationPage
operationPage.message.default=S�lectionnez une op�ration d�finie dans le descripteur WSDL de la source de donn�es.
operationPage.message.regenerate.SOAPRequest=G�n�rez � nouveau la requ�te SOAP et reconnectez le point de fin selon l'op�ration modifi�e.
operationPage.title.operationChanged=Op�ration modifi�e
operationPage.label.selectOpearation=Op�ration &s�lectionn�e
operationPage.label.document=&Documentation

# SoapParametersPage
soapParametersPage.message.default=Entrez les param�tres de l'op�ration WSDL s�lectionn�e.
soapParametersPage.button.selectAll=&S�lectionner tout
soapParametersPage.button.deselectAll=&D�s�lectionner tout
soapParametersPage.column.paramName=N&om
soapParametersPage.column.dataType=Type de &donn�es

# SoapRequestPage
soapRequestPage.message.defaultTitle=Modifiez le mod�le de requ�te SOAP de ce jeu de donn�es. 
soapRequestPage.message.regenerateTemplate=Le mod�le de texte de requ�te sera � nouveau g�n�r� d'apr�s l'op�ration SOAP s�lectionn�e. Les modifications que vous avez apport�es au texte seront supprim�es.\n\nVous confirmez ?
soapRequestPage.label.prompt=Inutile de remplir cette zone si la classe de connexion personnalis�e ne requiert aucun texte de requ�te.
soapRequestPage.title.regenerateTemplate=G�n�rer � nouveau un mod�le
soapRequestPage.button.regenerateTemplate=G�n�re&r � nouveau un mod�le
soapRequestPage.button.insertParameter=Modifi&er les param�tres...
soapRequestPage.button.clear=&Effacer
soapRequestPage.paramEditDialog.title=Modifier la propri�t� de param�tre

# ParameterInputDialog
parameterInputDialog.column.name=&Nom
parameterInputDialog.column.type=Type de &donn�es
parameterInputDialog.column.defaultValue=&Valeur par d�faut
parameterInputDialog.button.edit=Modifi&er...

# SoapResponsePage
soapResponsePage.message.default=Modifiez la r�ponse SOAP.
soapResponsePage.group.schema=S�lectionnez le sch�ma de r�ponse SOAP.
soapResponsePage.group.xml=S�lectionnez l'exemple de message de r�ponse SOAP.
soapResponsePage.radio.defaultSchema=Utilisez le sch�ma de r�ponse d'&op�ration d�fini dans la source de donn�es WSDL.
soapResponsePage.radio.reponseSchema=Utilisez le sch�ma de la &r�ponse.
soapResponsePage.radio.externalSchema=Utiliser le fichier de sch�ma &XML externe :
soapResponsePage.radio.endPoint=Services Web de la requ�te au point de &fin SOAP :
soapResponsePage.radio.externalXML=Utiliser l'exemple de fichier de &donn�es externe
soapResponsePage.button.browse1=Par&courir...
soapResponsePage.button.browse2=&Parcourir...
soapResponsePage.button.connect=&Se connecter maintenant

# XMLTableMappingPage

# XMLColumnMappingPage

# WSConsole
wsConsole.message.error.cantRetrieveSOAPResponse=La r�ponse SOAP ne peut pas �tre r�cup�r�e, v�rifiez le r�seau ou le param�tre de la r�ponse SOAP.
