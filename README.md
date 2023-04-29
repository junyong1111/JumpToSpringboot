# JumpToSpringboot

**박응용님의 점프투 스프링부트를 참고하였습니다.**

**필요 선수 지식**

- 자바 기초 지식
- HTML 기초 지식
- CSS 기초 지식
- 자바스크립트 기초 지식
- 폼에 대한 지식
    - GET, POST…
- 데이터베이스에 대한 기초 지식

### 1장 스프링부트 개발 준비

<details>
<summary> 1장 스프링부트 개발 준비 </summary>
<div markdown="1">   

**스프링부트란?**

스프링부트는 자바의 웹 프레임워크로 기존 스프링 프레임워크에 톰캣 서버를 내장하고 여러 편의 기능들을 추가하여 꾸준한 인기를 누리고 있는 프레임워크이다. **즉, 스프링부트는 웹 프로그램을 쉽고 빠르게 만들어 주는 웹 프레임워크다.**

<details>
<summary> —-# 웹 프레임워크란? </summary>
<div markdown="1">   

웹 프로그램을 위해서는 상당히 많은 기능을 만들어야 한다. 예를 들어 쿠키나 세션처리, 로그인/로그아웃, 데이터베이스 처리 등 웹프로그램을 위해 만들어야 할 기능들은 상당히 많다. 웹 프레임워크에는 이런 기능들이 이미 만들어져 있기 때문에 기능을 익혀서 사용하기만 하면된다. 쉽게 말해 웹 프레임워크는 웹 프로그램을 만들기 위한 스타터 키트라고 생각하면 된다.

</div>
</details>

**스프링의 장점**

- **튼튼한 프레임 워크**
    - 스프링부트는 여러 보안 공격을 기본적으로 아주 잘 막아준다.
- **다양한 기능 탑재**
    - 오랜 세월동안 수많은 기능이 추가되고 다듬어짐
- **WAS가 따로 필요 없음**
    - Web Application Server(Tomcat, Weblogic, websphere…등)이 필요
        - 스프링에는 Tomcat이 내장되어 있어 WAS를 신경쓸 필요가 없다.
        - 톰캣 대신 다른 WAS를 사용할 수 있음.
- **설정이 쉽다.**
    - 이전에 스프링만을 사용하는것보다 훨씬 더 단순화 하여 쉽게 사용이 가능
    - 다른 언어로 작성된(파이썬의 장고)와 같은 언어의 간결함을 더 이상 부러워할 필요 없음
- **재미있다.**
    - 일단 해보자…


<details>
<summary> 자바 설치 </summary>
<div markdown="1">   

**JDK 설치**

자바 프로그래밍을 하기 위해 필수적으로 필요한 JDK(Java Development Kit)를 먼저 설치 

[Download the Latest Java LTS Free](https://www.oracle.com/java/technologies/downloads/)

```python
java --version 
#-- 위 명령어로 설치된 java 버전 확인
```

</div>
</details>

<details>
<summary> STS 설치(이클립스) </summary>
<div markdown="1">   

STS(Spring Tool Suite)는 문서파일 작성을 도와주는 도구로 워드나 한글이 있는 것처럼 프로그램 작성을 도와주는 툴들이다. **이러한 툴들을 통합개발환경**이라고 부른다. 이 IDE 중 가장 많이 추천되는 툴은 STS로 스프링 개발에 최적화된 에디터로 **이클립스 기반**으로 제작되었다.

**무료버전 인텔리제이는 사용하는데 있어서 약간의 제약이 있으므로 이클립스를 추천**

**❗️하지만 인텔리제이로 진행**

**인텔리제이**

<details>
<summary> Spring Initializr 설치 </summary>
<div markdown="1">   

인텔리제이 무료버전은 스프링 도구 지원이 안되지만 Spring Initializr를 사용하면 스프링부트 개발을 쉽게 시작할 수 있다.

• [https://start.spring.io/](https://start.spring.io/)

![강좌랑 버전차이가 많이 나서 일단은 기본설정으로 진행했음… ](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/796da698-320d-48b0-9766-71de9db95df1/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-04-28_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_9.17.43.png)

강좌랑 버전차이가 많이 나서 일단은 기본설정으로 진행했음… 

![스크린샷 2023-04-28 오후 9.18.41.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dfd4d3b9-82de-4b3c-9b4e-d64a81827a33/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-04-28_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_9.18.41.png)

의존성 추가 후 생성!!

**다운받은 zip 파일을 프로젝트 홈 디렉토리에서 압축해제**

</div>
</details>

<details>
<summary> 인텔리제이 설치 </summary>
<div markdown="1">   

[IntelliJ IDEA](https://www.jetbrains.com/ko-kr/idea/download/)

무료 버전 설치 후 인텔리제이 실행

Open → Spring initializr 압축파일이 있는 디렉토리를 선택하여 시작.

</div>
</details>

<details>
<summary> 롬복 플러그인 설치 </summary>
<div markdown="1">  

인텔리제이 설정

Preferences → Plugins 에서 롬복(Lombok)을 검색하여 설치

![스크린샷 2023-04-28 오후 9.31.24.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/df14f960-772d-449a-99fc-5a1d9fa64e64/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-04-28_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_9.31.24.png)

</div>
</details>

<details>
<summary> Auto reload 설정 </summary>
<div markdown="1">  

자바 또는 템플릿을 수정할 경우 수작업 없이 자동으로 변경사항 적용

Preferences → Build, Execution, Deployment → compiler에서 다음 항목 활성화

![스크린샷 2023-04-28 오후 10.55.05.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/14ea1934-6610-4847-8d6f-390d5efe7531/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-04-28_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_10.55.05.png)

Preferences → Advanced Settings에서 다음 항목 활성화

![스크린샷 2023-04-28 오후 10.56.10.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d2baf933-f2c4-4c0f-9b16-23e17567197d/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-04-28_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_10.56.10.png)

</div>
</details>

<details>
<summary> 타임리프 </summary>
<div markdown="1">   

템플릿 파일을 변경한 후 자동 적용되게 하려면 application.properties파일에 다음과 같은 내용 추가

Spring initializr 압축파일이 있는 디렉토리/src/main/resources/application.properties에 다음 내용 추가

```java
spring.thymeleaf.cache=false
spring.devtools.restart.enabled=true
spring.thymeleaf.prefix=file:src/main/resources/templates/
```

</div>
</details>

<details>
<summary> Unused 경고 메시지 끄기 </summary>
<div markdown="1">   

인텔리제이 무료 버전은 스프링을 지원하지 않기 때문에 경고 메시지가 나타나기 때문에 설정에서 꺼야 함

Preferences → Editor → Inspections

Java → Declaration redundance 항목 → Unsued declation 체크 해제

![스크린샷 2023-04-28 오후 11.00.52.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bbee94f4-7311-41d9-90aa-8f9f235a338e/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-04-28_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_11.00.52.png)

</div>
</details>

<details>
<summary> Gradle </summary>
<div markdown="1">   

**로컬 서버 실행 및 배포 파일 생성**

- **로컬 서버 실행**
    
    이제부터 Spring Initializr 압축파일이 있는 폴더를 myproject 폴더라고 함
    
    그레이들 창에서 다음과 같이 선택
    
    myproject → Tasks → application → bootRun을 선택 후 마우스 우측 클릭 후 Run
    
    ![스크린샷 2023-04-28 오후 11.04.33.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/84e46b4b-f875-45f4-8986-dbf54eb93da4/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-04-28_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_11.04.33.png)
    
- **배포 파일 생성**
    
    그레이들 창에서 다음과 같이 선택
    
    myproject → Tasks → build → bootJar 우측 클릭 후  Run 
    
    build/libs/ 디렉토리에 .jar 배포 파일 생성 확인
    
    ![스크린샷 2023-04-28 오후 11.09.10.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ce2d0610-6bd1-482c-8b02-4bba16d8b075/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-04-28_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_11.09.10.png)

</div>
</details>

</div>
</details>

<details>
<summary> 스프링부트 맛보기 </summary>
<div markdown="1">   

</div>
</details>

<details>
<summary> 스프링부트 도구 설치 </summary>
<div markdown="1">   

</div>
</details>


</div>
</details>

### 2장 스프링부트 기본 요소 익히기

<details>
<summary> 2장 스프링부트 기본 요소 익히기 </summary>
<div markdown="1">   

</div>
</details>



<!-- 
<details>
<summary>  </summary>
<div markdown="1">   

</div>
</details> -->