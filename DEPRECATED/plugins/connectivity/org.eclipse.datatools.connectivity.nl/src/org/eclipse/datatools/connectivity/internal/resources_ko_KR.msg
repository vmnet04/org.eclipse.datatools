## Copyright (c) 2005, 2011 Sybase, Inc. and others.
## All rights reserved. This program and the accompanying materials
## are made available under the terms of the Eclipse Public License v1.0
## which accompanies this distribution, and is available at
## http://www.eclipse.org/legal/epl-v10.html
##
## Contributors:
##    Sybase, Inc. - initial API and implementation
##    IBM Corporation - migrated to new wizard framework
##    IBM Corporation - fix for defect 222818
##    Actuate Corporation - added the cipherProvider extension point [BZ 358686]
################################################################################ 
plugin.internal_error=내부 오류 - org.eclipse.datatools.connectivity
ConnectionProfileConstants.unknownVersion=알 수 없음
dialog.title.error.loadconnectionfactory = "{0}" 연결 팩토리 로드 중 오류가 발생했습니다!
ConnectJob.name={0}에 대한 연결 작성 중.
ConnectJob.status.info=하나 이상의 확장자에 대해 {0}에 대한 연결을 작성할 수 없습니다.
ConnectJob.status.error={0}에 연결할 수 없습니다.
DisconnectJob.name={0}에 대한 연결을 닫는 중.
DisconnectJob.status.info=하나 이상의 확장에 대해 {0}에 대한 연결을 닫을 수 없습니다.
DisconnectJob.status.error={0}에서 연결을 끊을 수 없습니다.
CreateConnectionJob.name={1}에 대해 {0}을(를) 생성하고 있습니다.
CreateConnectionJob.error={1}에 대한 {0} 연결 작성 중 오류 발생(오류\: {2}).
OpenConnectionEventJob.name={0}에 대한 연결 열기 이벤트 처리 중.
CloseManagedConnectionJob.name={1}에 대한 {0} 연결을 닫고 있습니다.
CloseManagedConnectionJob.error={1}에 대한 {0} 연결을 닫는 도중 오류가 발생했습니다(오류\: {2}).
CloseConnectionEventJob.name={0}에 대한 연결 닫기 이벤트 처리 중.
assert.invalid.profile = 구문 분석 오류\: 잘못된 특성({0})
assert.invalid.profile.duplicateFactory = 구문 분석 오류\: 중복된 팩토리 ID 및 중복된 우선 순위({0})
assert.invalid.profile.nullFactory = 구문 분석 오류\: 널(Null) 팩토리 또는 팩토리 ID({0}/{1})
dialog.title.error.loadwizard = "{0}"의 새로운 마법사 로드 중 오류가 발생했습니다!
operation.new.connectionprofile = 프로필 생성\: "{0}"
error.connect = 프로필 "{0}" 연결에 문제가 있습니다.  자세한 내용은 로그 파일을 참조하십시오.
marker.error = 프로필 "{0}" 연결에 문제가 있습니다.  (오류\: {1})
drivermarker.error = 드라이버 "{0}"에 문제가 발생했습니다(오류\: {1}).
drivermarker.import.error = 프로필 "{0}"을(를) 가져오는 도중 생성된 드라이버 정의의 jar 목록이 누락되었습니다.
profile.duplicate =연결 프로파일 이름 "{0}" 중복.
profile.notexist = 프로필 "{0}" 연결이 없습니다!
duplicate.profile.name = {0}({1})의 복사본
DriverConnectionBase.error.unknown=지정되지 않은 오류로 연결에 실패했습니다.
DriverConnectionBase.error.driverDefinitionNotSpecified=드라이버 정의가 지정되지 않았습니다.
DriverConnectionBase.error.driverDefinitionNotFound=드라이버 정의를 찾을 수 없습니다.
error.loadprofilesxml = 프로필 연결 데이터 로드 중 오류가 발생했습니다.
error.saveprofilesxml = 프로필 연결 데이터 저장 중 오류가 발생했습니다.
error.loaddriversxml = 드라이버 정의 데이터 로드 중 오류 발생
error.savedriversxml = 드라이버 정의 데이터 저장 중 오류 발생

trace.error.propertiesPersistenceHook = 기본값(profile type={0}, extension={1})을 사용하는 propertiesPersistenceHook을 로드할 수 없습니다.
trace.error.propertiesPersistenceHookSaveError = 영구 후크 속성을 호출하는 동안 오류가 발생했습니다. 모든 속성(profile={0}, extension={1})이 유지됩니다.
trace.error.propertiesPersistenceHookLoadError = 영구 후크 속성을 호출하는 동안 오류가 발생했습니다. 임시 속성(profile={0}, extension={1})이 설정되지 않습니다.
trace.error.migration = 연결 프로필 공급자에 대한 마이그레이션 요소를 로딩하는 중 오류 발생(ID={0}, 마이그레이션 클래스={1})
trace.error.drivermigration = 프로필의 드라이버 인스턴스 생성 도중 오류가 발생했습니다(ID={0}, 드라이버 ID={1}).

migration.error.providerDoesNotExist = 마이그레이션 요소를 로딩하는 중 오류 발생: 지정된 newProviderID가 잘못됨(newProviderID={0})
migration.error.invalidPropertyMigrationElement = 마이그레이션 요소를 로딩하는 중 오류 발생: propertyMigration은 newPropertyKey 또는 oldPropertyKey 중 하나 또는 모두를 지정해야 합니다.
migration.error.unknownParentElement = 마이그레이션 요소를 로딩하는 중 오류 발생: 알 수 없는 상위 요소(상위 요소 이름={0})

DriverUtil.taskName = {0}의 클래스 처리 중

Category.Name.Unknown=지원 안 함

WorkOfflineJob.name = {0}을(를) 오프라인 작업 모드로 변경하고 있습니다.
WorkOfflineJob.status.error = 하나 이상의 확장을 위해 {1}에 대한 오프라인 연결을 만들 수 없습니다.

SaveWorkOfflineDataJob.name = {0}의 오프라인 데이터를 저장합니다.
SaveWorkOfflineDataJob.status = 오프라인 데이터 상태를 저장합니다.

CreateOfflineConnectionJob.name = {1}에 대한 오프라인 {0} 연결을 만들고 있습니다.
CreateOfflineConnectionJob.error = {1}에 대한 오프라인 {0} 연결을 만드는 도중 오류가 발생했습니다(오류\: {2}).

ManagedConnection_save_not_connected_error = 오프라인 데이터를 저장하려면 서버에 연결되어 있어야 합니다.
ManagedConnection_offline_not_supported_error = {0}이(가) 오프라인 작업을 지원하지 않습니다.

drivers.error.finding.property.no.template = 드라이버 템플릿에서 {0}을(를) 검색하는 동안 문제가 발생했습니다.

JDBCConnection.technologyName = JDBC
JDBCConnection.invalidDriverDefinition = {0}\: {1}. 대신 데이터베이스 프로필에 저장된 드라이버 속성을 사용합니다.

error.database.not.start = 시작 데이터베이스 명령이 전달되지 않았습니다. 오류 코드 = {0}, SQL 문 = {1}.
PluginResourceLocator.invalidURL = 잘못된 URL {0} (오류\: {1})
ConnectivityPlugin.error.noDefaultWorkspace = 기본 작업 영역 위치를 확인할 수 없습니다.  OSGi-less 플랫폼 구성 플러그인 또는 datatools 작업 영역 경로를 확인하십시오.
CipherProviderExtensions.missingRequiredAttrValue = {2}이(가) 제공한 {1} 확장명의 {0} 요소에 필수 특성 값이 하나 이상 누락되었습니다. {3}={4}, {5}={6}
CipherProviderExtensions.invalidClassAttrValue = {2}이(가) 제공한 {1} 확장명의 잘못된 클래스 유형({0})  {3} Java 인터페이스를 구현해야 합니다.
CipherProviderExtensions.conflictingExtensions = 등록된 ICipherProvider({0})는 같은 파일 확장명({3})에 대해 {2}의 다른 확장명이 제공한 ICipherProvider({1})로 대체되었습니다.


