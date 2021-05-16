# OpenSource_05 CO-A
### Google Map API KEY 발급
1. https://console.cloud.google.com/apis/dashboard 에 접속하여 프로젝트 만들기 클릭
2. 적당한 프로젝트 명을 적고 프로젝트 생성이 완료되면 ENABLE APIS AND SERVICES( API 및 사용 서비스 사용 설정) 클릭
3. maps sdk for android를 검색하여 Maps SDK for Android를 선택 후 사용 클릭
4. 좌측 상단에 있는 탐색메뉴에서 메뉴에서 API 및 서비스 -> 사용자 인증 정보 -> 사용자 인증 정보 만들기 클릭
5. 사용자 인증 정보 만들기 메뉴에서 API 키 클릭
6. 키 제한 클릭
7. 애플리케이션 제한사항에서  Android 앱을 선택하고 항목  추가를 클릭
8. 프로젝트 패키지 이름과 SHA-1 인증서 입력 
####-1 SHA-1 인증서 얻는 법
8-1-1 윈도우 + R 눌러서 실행 창 열고 cmd 입력하여 명령프롬프트 창 출력
8-1-2 아래 코드 복사해서 입력
```
(Window) 
"C:\Program Files\Android\Android Studio\jre\bin\keytool" -list -v -keystore "%USERPROFILE%\.android\debug.keystore" -alias androiddebugkey -storepass android -keypass android
(Linux)
keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android
```
8-1-3 관련 정보가 나오면 SHA1 옆에 있는 문자열을 복사
####8-2 프로젝트 패키지 이름은 MainActivity.java 1번줄에 있는 package 옆에 있는 com.# 을 복사해서 넣어준다.
9. API 제한사항에서 키 제한을 선택하고 콤보박스에서 Maps SDK for Android를 체크 후 저장 클릭
10. 생성된 API 키를 복사
11. 프로젝트의 app->manifests->AndroidManifest.xml 를 열고 코드 중간에 <meta-data android:name="com.google.android.geo.API_KEY" android:value="API키" /> 입력
12. 메뉴에서 Tools -> SDK Manager 선택
13. SDK Tools 탭을 클릭하고 Google Play services 항목을 체크하고 OK를 클릭하여 설치를 진행(체크되어 있다면 생략 가능)
14. 모듈 app의 build.gradle에 Google Play Services 라이브러리를 프로젝트에서 사용한다고 추가해줘야함 
    implementation 'com.google.android.gms:play-services-maps:17.0.1'
    implementation 'com.google.android.gms:play-services-location:18.0.0' 코드 입력 후 위에 있는 Sync Now 클릭
16. 설치가 완료되면 Google Map API 이용 가능
