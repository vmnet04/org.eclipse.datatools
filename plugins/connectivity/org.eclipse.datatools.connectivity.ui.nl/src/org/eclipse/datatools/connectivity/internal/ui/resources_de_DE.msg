## Copyright (c) 2005, 2009 Sybase, Inc.
## All rights reserved. This program and the accompanying materials
## are made available under the terms of the Eclipse Public License v1.0
## which accompanies this distribution, and is available at
## http://www.eclipse.org/legal/epl-v10.html
##
## Contributors:
##    Sybase, Inc. - initial API and implementation
##	  IBM Corporation = bug fix #203829
##	  Actuate Corporation - bug fix #261452
################################################################################ 
plugin.internal_error=Interner Fehler - org.eclipse.datatools.connectivity
ImportProfilesDialog.btnOverwrite.text=&Vorhandene Verbindungsprofile gleichen Namens �berschreiben
ExportProfilesDialog.button.text2=Dur&chsuchen...
ExportProfilesDialog.group.text=Zu exportierendes Verbindungsprofil ausw�hlen\:
ExportProfilesDialog.button.text1=Alles a&bw�hlen
ExportProfilesDialog.button.text=Alles a&usw�hlen
ImportProfilesDialog.button.text=Dur&chsuchen...
ExportProfilesDialog.label.text=&Dateinamen angeben\:
ImportProfilesDialog.label.text=&Dateinamen angeben\:
ImportProfilesDialog.text.text=Hinweis\: Das Verbindungsprofil f�r den Import muss von einem Typ sein,\nder mithilfe des neuen Verbindungsprofilassistenten erstellt werden kann.\nNicht unterst�tzte Verbindungsprofiltypen werden verworfen.
ExportProfilesDialog.null.title=Verbindungsprofile exportieren
ImportProfilesDialog.null.title=Verbindungsprofile importieren
ExportProfilesDialog.btnEncryption.text=Dateiinhalt &verschl�sseln
actions.export.noselection=Bitte w�hlen Sie mindestens ein Verbindungsprofil aus\!
actions.export.nofile=Bitte geben Sie den Dateinamen an\!
actions.export.norepository = Geben Sie ein Ziel-Repository an.
actions.export.notvalidfile = Geben Sie einen g�ltigen Dateinamen und Pfad an.
dialog.exception.title=Ausnahmebedingung
dialog.exception.message=Abgefangene Ausnahmebedingung\: {0}
NewCPWizard.title=Neues Verbindungsprofil
IntroductionWizardPage.title=Einf�hrungsseite
IntroductionWizardPage.intro=Dieser Assistent f�hrt Sie durch die Erstellung eines Verbindungsprofils.
CPWizardSelectionPage.title = Verbindungsprofil
CPWizardSelectionPage.desc = W�hlen Sie einen Verbindungsprofiltyp.
CPWizardSelectionPage.group = &Verbindungsprofiltypen:
CPWizardSelectionPage.defaultName =Neu: {0}
CPWizardSelectionPage.defaultNameExtended =Neu: {0}({1})
actions.connect.job=Serverjob verbinden
actions.connect.uijob=Sicht aktualisieren
actions.ping.job=Serverjob mit Ping �berpr�fen
actions.ping.uijob=Dialogjob anzeigen
actions.connect.title=Verbindung zum Server wird hergestellt...
actions.ping.title=Server wird mit Ping �berpr�ft...
actions.ping.success=�berpr�fung mit Ping erfolgreich\!
actions.ping.failure=�berpr�fung mit Ping fehlgeschlagen\!
actions.delete.title=L�schen best�tigen
actions.delete.confirm=Soll das Verbindungsprofil "{0}" wirklich gel�scht werden?
properties.dialog=Eigenschaftendialog
properties.category.general=Allgemein
properties.connectionprofile.name=Profilname
properties.connectionprofile.desc=Beschreibung
properties.connectionprofile.autoconnect=Automatisch verbinden
properties.category.name=Kategoriename
properties.category.id=Kategorie-ID
ServersView.action.showproperties=&Eigenschaften
ServersView.action.refresh=&Aktualisieren
ServersView.action.newCP=&Neu...
ServersView.action.exportCPs=&Exportieren...
ServersView.action.importCPs=&Importieren...
NewConnectionProfileWizard.title=Neues Verbindungsprofil
NewConnectionProfileWizard.create.failure=Fehler bei Verbindungsprofilerstellung
NewConnectionProfileWizardPage.Status.DuplicateName=Der Name des Verbindungsprofils ist bereits vorhanden\!
NewConnectionProfileWizardPage.Status.NoName=Bitte geben Sie den Namen des Verbindungsprofils an\!
NewConnectionProfileWizardPage.Status.NoRepository = Geben Sie ein Repository an.
NewConnectionProfileWizardPage.Status.NoSpacesInName = Verbindungsprofilname darf nicht mit Leerzeichen beginnen oder enden.
NewConnectionProfileWizardPage.title = Verbindungsprofil erstellen
NewConnectionProfileWizardPage.desc = Geben Sie die Profilinformationen ein.
NewConnectionProfileWizardPage.cp_name = Na&me:
NewConnectionProfileWizardPage.cp_desc = &Beschreibung (optional):
NewConnectionProfileWizardPage.choices=Bitte ausw�hlen\:
NewConnectionProfileWizardPage.summary_cp_name=Name
NewConnectionProfileWizardPage.summary_cp_desc=Beschreibung
NewConnectionProfileWizardPage.Button.AutoConnect = Beim Starten &automatisch verbinden
NewConnectionProfileWizardPage.Button.AutoConnect1 = Beim Starten automatisch verbinden
NewConnectionProfileWizardPage.summary_autoconnect = Beim Starten automatisch verbinden
NewConnectionProfileWizardPage.summary_autoconnect_on_finish = Beim Beenden automatisch verbinden
NewConnectionProfileWizardPage.localRepository = In Arbeitsplatz-Repository erstellen (lokal)
NewConnectionProfileWizardPage.chooseRepository = Repository w�hlen:
ConnectionProfileDetailsPage.Button.TestConnection=Verbindung &testen
ConnectionProfileDetailsPage.AskConfirmation=Best�tigungsdialog
ConnectionProfileDetailsPage.AskReconnect=Die Informationen dieses Verbindungsprofils wurden ge�ndert. M�chten Sie die Verbindung zum Server wiederherstellen?
SummaryWizardPage.title=Zusammenfassung
SummaryWizardPage.description=Diese Informationen wurden auf den vorherigen Seiten zusammengestellt.
SummaryWizardPage.property=Eigenschaft
SummaryWizardPage.value=Wert
dialog.title.error=Fehler
dialog.title.success=Erfolgreich
rename.dialog.title=Umbenennungsdialog
rename.dialog.message=Neuen Verbindungsprofilnamen eingeben\:
rename.dialog.errmsg.existing=Der Name ist vorhanden, bitte geben Sie einen anderen Namen ein\!
rename.dialog.errmsg.invalid=Der Name ist ung�ltig, bitte geben Sie einen g�ltigen Namen ein\!
rename.dialog.errmsg.NoSpacesInName = Verbindungsprofilname darf nicht mit Leerzeichen beginnen oder enden.
error.connect={1}.  Details finden Sie in der Protokolldatei.
error.contentExtension=Beim Herstellen der Verbindung zur Erweiterung "{0}" f�r das Profil "{1}" trat ein Fehler auf (Fehler\: {2}).
CPVersionPropertyPage.desc=Versionsinformationen f�r {0}.\nDiese Informationen wurden beim letzten Verbindungsversuch erhalten.  Falls der letzte Verbindungsversuch nicht erfolgreich war, sind keine Informationen verf�gbar.
CPVersionPropertyPage.button.updateVersion=Versionshinweise verbinden und aktualisieren
CPVersionPropertyPage.label.versionUnavailable=Die Versionsinformationen sind f�r dieses Profil nicht verf�gbar.
CPVersionPropertyPage.label.techVersions=Folgende Technologien sind auf diesem Server verf�gbar\:
ConnectionProfileSummaryPage.button.testConnection=Verbindung &testen
CommonLabelProviderBase.label.version={0} ({1} v. {2}) 
CommonLabelProviderBase.label.version.versionless={0} ({1}) 
CommonLabelProviderBase.label.localRepository=Arbeitsplatz-Repository (lokal)

properties.connectionprofile.type = Profiltyp
DSE.Refresh.label = &Aktualisieren
DSE.View.Tooltip = Datenquellen-Explorer

CPDeleteChange.name = Verbindungsprofil {0} l�schen
CPDeleteChange.error.ProfileDoesNotExist = Das Verbindungsprofil, das Sie l�schen m�chten, ist nicht vorhanden.
CPDeleteChange.delete.failure = Das L�schen des Verbindungsprofils ist fehlgeschlagen.
CPDeleteProcessor.name = Prozessor zum L�schen der DTP-Verbindung
CPDuplicateProcessor.name = Prozessor zum Vervielf�ltigen des DTP-Verbindungsprofils
CPCopyChange.name = Verbindungsprofil {0} vervielf�ltigen
CPCopyChange.error.ProfileDoesNotExist = Das Verbindungsprofil, das Sie vervielf�ltigen m�chten, ist nicht vorhanden.
CPCopyChange.title.error = Das Vervielf�ltigen des Verbindungsprofils ist fehlgeschlagen.
CPCopyChange.error.InvalidTarget = Das angegebene Ziel ist kein g�ltiges Verbindungsprofil-Repository.
CPCopyChange.error.RepositoryNotConnected = Keine Verbindung zum Ziel-Verbindungsprofil-Repository {0}.
CPMoveProcessor.name = Prozessor zum Verschieben des DTP-Verbindungsprofils
CPMoveChange.name = Verbindungsprofil {0} verschieben
CPMoveChange.error.ProfileDoesNotExist = Das Verbindungsprofil, das Sie verschieben m�chten, ist nicht vorhanden.
CPMoveChange.title.error = Das Verschieben des Verbindungsprofils ist fehlgeschlagen.
CPCreateChange.name = Verbindungsprofil {0} erstellen
CPCreateChange.error.NewProfileDoesNotHaveName = F�r das Erstellen eines neuen Verbindungsprofils ist ein Name erforderlich.
CPCreateChange.error.NewProfileAlreadyExists = Ein Verbindungsprofil mit dem neuen Namen ist bereits vorhanden.
CPCreateChange.error.NewProfileDoesNotHaveProviderID = Die Anbieter-ID des Verbindungsprofils ist f�r eine Erstellung des neuen Verbindungsprofils erforderlich.
CPCreateChange.error.NewProfileDoesNotHaveNonNullPropertiesObject = Ein Eigenschaftsobjekt mit einem Wert ungleich Null ist f�r die Erstellung eines neuen Verbindungsprofils erforderlich.
CPCreateChange.create.failure = Das Erstellen des Verbindungsprofils ist fehlgeschlagen.
CPCreateProcessor.name = Prozessor zum Erstellen der DTP-Verbindung
CPRenameChange.name = Verbindungsprofil {0} umbenennen
CPRenameProcessor.name = Prozessor zum Umbenennen der DTP-Verbindung
CPRenameChange.title.error = Das Umbenennen des Verbindungsprofils ist fehlgeschlagen.

PropertyDescriptor.error.title = Fehler beim Verarbeiten des Eigenschaften-Deskriptors f�r die Treiberdefinition
PropertyDescriptor.error.msg = Fehler beim Verarbeiten von Eigenschaften f�r die Treiberdefinition aufgetreten.
PasswordTextPropertyDescriptor.property.label = Kennwort
DriverClassBrowsePropertyDescriptor.property.label = Treiberklasse
DriverClassBrowsePropertyDescriptor.jardialog.title = In der JAR-Liste verf�gbare Klassen
DriverClassBrowsePropertyDescriptor.jardialog.msg = Geben Sie den Namen der Treiberklasse an, oder w�hlen Sie eine Klasse aus den verf�gbaren JARs.
DriverClassBrowsePropertyDescriptor.noclasses.title = Keine Treiberklassen verf�gbar
DriverClassBrowsePropertyDescriptor.noclasses.msg = F�r die aktuelle JAR-Liste sind keine Treiberklassen verf�gbar.

StatusBar.Connected = Verbunden
StatusBar.Disconnected = Verbindung getrennt
StatusBar.ConnectedMessage = {0} ({1})

StatusBar.WorkingOffline = Offline arbeiten

DATATOOLS.SERVER.UI.EXPLORER.WORKOFFLINE = Offline &arbeiten
DATATOOLS.SERVER.UI.EXPLORER.UPDATE_OFFLINE = Offline &speichern

DriverPropertyEditorDescriptor.InvalidID = Eigenschaftseditor-Deskriptor verf�gt �ber keine g�ltige ID
DriverPropertyEditorDescriptor.InvalidTargetTemplateID = Eigenschaftseditor-Deskriptor verf�gt �ber keine g�ltige Zielvorlagen-ID
DriverPropertyEditorDescriptor.InvalidTargetPropertyId = Eigenschaftseditor-Deskriptor verf�gt �ber keine g�ltige Zieleigenschafts-ID
DriverPropertyEditorDescriptor.InvalidCustomPropertyEditorClass = Eigenschaftseditor-Deskriptor verf�gt �ber keinen g�ltigen benutzerdefinierten Eigenschaftseditor

ExtensibleProfileDetailsWizardPage.title = Treiber- und Verbindungsdetails angeben
ExtensibleProfileDetailsWizardPage.description = W�hlen Sie einen Treiber aus der Dropdown-Liste, und geben Sie Anmeldedetails f�r die Verbindung an.
ExtensibleProfileDetailsWizardPage.driverCombo.label = &Treiber:
ExtensibleNewConnectionProfileWizard.title = Neues Verbindungsprofil

DriverUIContributorComposite.group = Eigenschaften

CommonDriverUIContributor.optionaltab = &Optional
CommonDriverUIContributor.optionalProps.label = Zus�tzliche Eigenschaften:
CommonDriverUIContributor.generaltab = &Allgemein

OtherDriverUIContributor.databaseName.label = &Datenbank:
OtherDriverUIContributor.url.label = &URL:
OtherDriverUIContributor.userName.label = &Benutzername:
OtherDriverUIContributor.password.label = Kenn&wort:
OtherDriverUIContributor.savePassword.label = &Kennwort speichern
OtherDriverUIContributor.summaryData.database = Datenbank
OtherDriverUIContributor.summaryData.username = Benutzername
OtherDriverUIContributor.summaryData.savePassword = Kennwort speichern
OtherDriverUIContributor.summaryData.true = Wahr
OtherDriverUIContributor.summaryData.false = Falsch
OtherDriverUIContributor.summaryData.url = URL

OtherDriverUIContributor.errormessage.requiresdatabase = Enter a database name.
OtherDriverUIContributor.errormessage.requiresurl = Enter a URL.
OtherDriverUIContributor.errormessage.requiresusername = Enter a user name.

ConnectAction.title = Eigenschaften f�r {0}

Boolean.true = Wahr
Boolean.false = Falsch

NewRepositoryWizard.title = Neues Repository-Assistent-Fenster

NewConnectionProfileWizardPage.Status.ContainsColon= Verbindungsprofilname darf keinen Doppelpunkt (:) enthalten!

