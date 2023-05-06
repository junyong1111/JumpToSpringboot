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

- **튼튼한 프레임 워크**co
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

- 강좌랑 버전차이가 많이 나서 일단은 기본설정으로 진행했음… 
<img width="647" alt="1" src="https://user-images.githubusercontent.com/79856225/236632256-911348e8-fc96-44a1-a78a-6d2075efc8ea.png">

<img width="668" alt="2" src="https://user-images.githubusercontent.com/79856225/236632258-ceb97a94-234e-4ebb-aca1-301d395e67cb.png">

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

<img width="976" alt="3" src="https://user-images.githubusercontent.com/79856225/236632259-93ba4139-0d77-46f1-9d28-7232078743f6.png">

</div>
</details>

<details>
<summary> Auto reload 설정 </summary>
<div markdown="1">  

자바 또는 템플릿을 수정할 경우 수작업 없이 자동으로 변경사항 적용

Preferences → Build, Execution, Deployment → compiler에서 다음 항목 활성화

<img width="291" alt="4" src="https://user-images.githubusercontent.com/79856225/236632260-8bca503e-5cdd-45f9-8101-b3f542b49a40.png">

Preferences → Advanced Settings에서 다음 항목 활성화

<img width="533" alt="5" src="https://user-images.githubusercontent.com/79856225/236632261-8dbf3b50-4d6c-4074-9b8f-039e6a70ed42.png">

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

<img width="322" alt="6" src="https://user-images.githubusercontent.com/79856225/236632262-c38eb6f3-da3b-403c-b012-3232cbcab69f.png">

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
    
   <img width="489" alt="7" src="https://user-images.githubusercontent.com/79856225/236632264-396fead6-94d5-42b3-8f3b-659b685e09ae.png">
    
- **배포 파일 생성**
    
    그레이들 창에서 다음과 같이 선택
    
    myproject → Tasks → build → bootJar 우측 클릭 후  Run 
    
    build/libs/ 디렉토리에 .jar 배포 파일 생성 확인
    
<img width="333" alt="8" src="https://user-images.githubusercontent.com/79856225/236632265-606dc885-3875-4a21-bf15-1777350ac70f.png">

</div>
</details>

</div>
</details>

<details>
<summary> 스프링부트 맛보기 </summary>
<div markdown="1">   

**locallhost:8080/hello 브라우저 요청해보기**

**HelloController**

브라우저에 요청을 처리하기 위해서는 컨트롤러가 필요하며 컨트롤러는 서버에 전달된 클라이언트의 요청을 처리하는 자바 클래스이다.

- 컨트롤러 생성

<img width="333" alt="1" src="https://user-images.githubusercontent.com/79856225/236632429-77f0b7ef-35bd-498c-bb3a-42f151137eeb.png">

해당 위치에서 마우스 우측 버튼을 누르고 New → Class를 선택 → HelloController 이름의 클래스 생성

- 생성된 클래스 코드 수정

```java
package com.example.demo; //자신의 파일 프로젝트 디렉토리 이름

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 아래 에너테이션이 있어야 스프링부트 프레임워크가 컨트롤러로 인식
@Controller
public class HelloController {
// 아래 주소로 요청이 들어오면 hello 메소드가 실행됨
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}
```

- **로컬서버 실행**

그레이들 창에서 bootRun 실행 후 [http://localhost:8080/hello](http://localhost:8080/hello) URL 요청

<img width="839" alt="2" src="https://user-images.githubusercontent.com/79856225/236632431-82f21533-295b-46c6-86ea-bb4cd86fff18.png">


</div>
</details>

<details>
<summary> 스프링부트 도구 설치 </summary>
<div markdown="1">   

이전 실습에서 진행했던 HelloController를 다음과 같이 수정

```java
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Demo Project";
    }
}
```

이렇게 코드를 수정했다고 하고 새로고침을 눌러봐도 보이는 문자열은 변하지 않는다. 수정된 사항을 적용하려면 서버를 다시 리로딩해야 하기 때문인데 이 부분을 상당히 불편할 수 있다. 이 문제를 해결하려면 Spring Boot Devtools를 설치해야 한다.

**서버 재시작 없이 변경사항을 즉시 반영해주는 Spring Boot Devtools 설치**

- **Spring Boot Devtools**

해당 툴을 설치하기 위해서는 Gradle로 설치해야 함. build.gradle을 다음과 같이 수정

```java
plugins {
    id 'java'
    id 'org.springframework.boot' version '3.0.0'
    id 'io.spring.dependency-management' version '1.1.0'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '17'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    **developmentOnly 'org.springframework.boot:spring-boot-devtools'**
}

tasks.named('test') {
    useJUnitPlatform()
}ㄴㅇ
```

—# **developmentOnly**

Gradle의 developmentOnly는 개발환경에만 적용되는 설정이다. 즉, 운영환경에 배포되는 jar, war 파일에는 developmentOnly로 설치된 라이브러리는 제외된다

변경사항 적용을 위해 build.gradle 우측 클릭 후 Run 를 선택하여 필요 라이브러리 다운

<img width="268" alt="3" src="https://user-images.githubusercontent.com/79856225/236632433-54b8ab57-40a0-4da9-bffc-26387337c423.png">

<img width="774" alt="4" src="https://user-images.githubusercontent.com/79856225/236632434-3fa9dd9c-b562-468c-80a6-003d8ed051a7.png">


해당 버튼을 눌러서 코드를 재실행하면 이제부터 서버 재시작없이 변경 가능

- **Live Reload를 이용하여 재호출 없이 변경사항 확인**

—# 크롬 확장 프로그램을 통해서만 가능

Live Reload 확장 프로그램을 설치하면 새로고침 없이 변경사항을 바로 확인 가능하다.

• LiveReload++ - [https://chrome.google.com/webstore/detail/livereload%20%20/ciehpookapcdlakedibajeccomagbfab](https://chrome.google.com/webstore/detail/livereload%20%20/ciehpookapcdlakedibajeccomagbfab)

- **롬복(Lombok)**

롬복은 자바 클래스에 Getter, Setter, 생성자 등을 자동으로 만들어 주는 도구이다. 직접 구현하여 사용해도 되지만 롬복을 사용하면 더 깔끔하다.

1. biuld.gradle에 의존성 추가
    
    ```java
    (... 생략 ...)
    
    dependencies {
        implementation 'org.springframework.boot:spring-boot-starter-web'
        testImplementation 'org.springframework.boot:spring-boot-starter-test'
        developmentOnly 'org.springframework.boot:spring-boot-devtools'
        **compileOnly 'org.projectlombok:lombok'
        annotationProcessor 'org.projectlombok:lombok'**
    }
    
    (... 생략 ...)
    ```
    
    **—# compileOnly**
    
    build.gradle 파일의 compileOnly는 해당 라이브러리가 컴파일 단계에서만 필요한 경우에 사용한다.
    
    **—# annotationProcessor**
    
    컴파일 단계에서 애너테이션을 분석하고 처리하기 위해 사용한다.
    
2. Getter, Setter 작성 후 롬복 작동 확인
    
    main/java/com/example/demo/HelloLombok 클래스를 작성하여 롬복 작동 확인
    
    ```java
    package com.example.demo;
    
    import lombok.Getter;
    import lombok.Setter;
    
    **@Getter
    @Setter**
    public class HelloLombok {
    
        private String hello;
        private int lombok;
    
        public static void main(String[] args) {
            HelloLombok helloLombok = new HelloLombok();
            helloLombok.**setHello("헬로");**
            helloLombok.**setLombok(5);**
    
            System.out.println(helloLombok.**getHello());**
            System.out.println(helloLombok.**getLombok());**
        }
    }
    ```
    
    HelloLombok 클래스에 hello와 lombok 2개의 attribute를 추가 후 클래스명 바로 위에 getter와 setter 애너테이션을 적용하면 getter, setter 메서드를 추가하지 않아도 함수를 사용할 수 있다.
    
3. RequiredArgsConstructor
    
    코드를 아래와 같이 수정
    
    ```java
    package com.example.demo;
    
    import lombok.Getter;
    **import lombok.RequiredArgsConstructor;**
    
    **@RequiredArgsConstructor**
    @Getter
    ~~@Setter~~
    public class HelloLombok {
    
        private **final** String hello;
        private **final** int lombok;
    
        public static void main(String[] args) {
            HelloLombok helloLombok = new HelloLombok**("헬로", 5);**
            System.out.println(helloLombok.getHello());
            System.out.println(helloLombok.getLombok());
        }
    }
    ```
    
    attribute에 final을 적용하고 롬복의 @RequiredArgsConstructor 에너테이션을 적용하면 해당 속성을 필요로하는 생성자가 롬복에 의해 자동으로 생성되며 final이 없는 속성은 생성자에 포함되지 않는다.
    
    final은 한번 설정한 값을 변경할 수 없게 만드는 키워드이다. final을 적용했기 때문에 @Setter는 의미가 없으며 Setter 메서들도 사용이 불가능하다.
    
    아래에 생성자를 직접 작성한 경우와 동일하다.
    
    ```java
    package com.example.demo;
    import lombok.Getter;
    
    @Getter
    public class HelloLombok {
    
        private final String hello;
        private final int lombok;
    
        **public HelloLombok(String hello, int lombok) {
            this.hello = hello;
            this.lombok = lombok;
        }**
    
        public static void main(String[] args) {
            HelloLombok helloLombok = new HelloLombok("헬로", 5);
            System.out.println(helloLombok.getHello());
            System.out.println(helloLombok.getLombok());
        }
    }
    ```
    
    <aside>
    ❗ 롬복을 사용하면 생성자를 더 깔끔하게 만들어준다. 코드에서는 setter와 getter를 통해 해당 클래스레 있는 특성에 접근했는데 클래스 속성명과 메인에서 호출하는 이름이 일치하지 않아도 어떻게 알아보는지 알아볼 필요가 있다.
    
    </aside>

</div>
</details>


</div>
</details>

### 2장 스프링부트 기본 요소 익히기

<details>
<summary> 2장 스프링부트 기본 요소 익히기 </summary>
<div markdown="1">   

**목표**

- 컨트롤러를 이용해 URL과 메핑되는 메소드를 관리
- 자바 JPA를 이용해 데이터베이스를 제어
- Demo 게시판에 질문 목록과 질문 상세 기능을 만든다.


<details>
<summary> 스프링부트 프로젝트의 구조  </summary>
<div markdown="1">   

<img width="1182" alt="1" src="https://user-images.githubusercontent.com/79856225/236632534-f11e9dee-3e44-49d3-8e07-29235bd60cad.png">

현재는 Controller와 Lombok 파일만 생성한 상태이다. 

- **src/main/java 디렉토리**
    
    해당 폴더에 com.example.dmo 패키지는 자바 파일을 작성하는 공간으로 자바 파올로는 Controller와 같은 스프링부트의 컨트롤러, 폼과 DTO, DB처리를 위한 엔티티, 서비스 파일등이 있다.
    
    - [DemoApplication.java](http://DemoApplication.java) 파일
        
        스프링부트 애플레키에션에 시작을 담당하는 파일로 <프로젝트명> + [Application.java](http://Application.java) 파일이다. 클래스위에는 반드시 @SpringBootApplication 에너테이션이 적용되어야 한다.
        
        ```java
        package com.example.demo;
        
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        
        **@SpringBootApplication**
        public class DemoApplication {
        
        	public static void main(String[] args) {
        		SpringApplication.run(DemoApplication.class, args);
        	}
        
        }
        ```
        
- **src/main/resource 디렉토리**
    
    자바 파일을 제외한 HTML, CSS, Javascript, 환경파일 등을 작성하는 공간
    
    - template 디렉토리
        
        templates 디렉토리에는HTML파일 형태로 자바 객체와 연동되는 템플릿 파일을 저장한다. 해당 폴더에는 질문 목록, 질문 상세 등의 HTML 파일을 저장한다.
        
    - static 디렉터리
        
        Static 디렉토리는 Css, Js 그리고 이미지 파일등을 저장하는 공간이다.
        
    - application.proterites 파일
        
        프로젝트의 환경을 설정한다. 프로젝트의 환경, DB등의 설정을 이 파일에 저장
        
- **src/test/java 디렉토리**
    
    프로젝트에서 작성한 파일을 테스트하기 위한 테스트 코드를 작성하는 공간으로 JUnit과 스프링부트의 테스팅 도구를 사용하여 서버를 실행하지 않은 상태에서 main/java 폴더에서 작성한 코드를 테스트 할 수 있다.
    
- **build.gradle 파일**
    
    그레이들이 사용하는 환경 파일이다. 그레이들은 그루비를 기반으로 한 빌드 도구로 Ant, maven과 같은 이전 세대 빌드 도구의 단점을 보완하고 장점을 취합하여 만든 빌드 도구이다. 해당 파일에는 프로젝트를 위해 필요한 플러그인과 라이브러리 등을 기술한다.

</div>
</details>

<details>
<summary> 컨트롤러 </summary>
<div markdown="1">   

**URL 매핑**

[localhost:8080/demo](http://localhost:8080/demo) 페이지를 요청했을 때 안녕하세요 문자열을 출력하도록 구현

URL 매핑을 추가하귀 해애 [MainController.java](http://MainController.java) 파일을 다음과 같이 작성

com/example/demo/MainController.java

```java
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/demo")
    @ResponseBody
    public String index() {
        return "안녕하세요 스프링부트 Demo Main page입니다.";
    }
}
```

- @Controller 에너테이션을 적용하면 해당 클래스는 스프링부트의 컨트롤러가 된다.
- @GetMapping 에너테이션은 URL과 매핑을 담당한다.
- @ResponseBody 에너테이션은 URL 요청에 대한 응답으로 문자열을 리턴하라는 의미
    - 만약 해당 에너테이션을 생략한다면 index라는 이름의 템플릿 파일을 찾게 된다.

서버에 요청이 발생하면 스프링부트는 요청 페이지와 매핑되는 컨트롤러를 대상으로 찾는다.

**❗️demo 요청이 발생하면 /demo URL과 매핑되는 index 메서드를 MainController에서 찾아서 실행한다.**

[localhost:8080/demo](http://localhost:8080/demo)로 확인

</div>
</details>

<details>
<summary> JPA </summary>
<div markdown="1">   

**ORM**

웹서비스는 데이터를 처리할 때 대부분 데이터베이스를 사용하며 이 때 ORM을 이용하면 자바 문법만으로도 데이터베이스를 다룰 수 있다. (장고의 Model과 같은 개념)

```java
Question q1 = new Question();
q1.setSubject("안녕하세요");
q1.setContent("가입 인사드립니다 ^^");
this.questionRepository.save(q1);

Question q2 = new Question();
q2.setSubject("질문 있습니다");
q2.setContent("ORM이 궁금합니다");
this.questionRepository.save(q2);
```

이처럼 데이터를 관리하는 데 사용하는 ORM 클래스를 엔티티(Entity)라고 한다.

**JPA**

스프링부트는 JPA(Java Persistence API)를 사용하여 DB를 처리한다. JPA는 자바 진영에서 ORM의 기술 표준으로 사용하는 인터페이스 모음이다.

> JPA는 인터페이스이다. 따라서 인터페이스를 구현하는 실제 클래스가 필요하다. JPA를 구현한 대표적인 실제 클래스에는 하이버네이트(Hibernate)가 있다.
> 

**H2 데이터베이스 설치**

JPA를 사용하기 전에 데이터를 저장할 데이터베이스를 설치해야하며 굵직한 DB보다 설치도 쉽고 사용도 편리한 H2 데이터베이스를 많이 사용

—# H2 DB는 주로 개발용이나 소규모 프로젝트에서 사용되는 파일 기반의 경량 DB

- **build.gradle에서 의존성을 추가하여 라이브러리 설치**

```java
(... 생략 ...)

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    **compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    runtimeOnly 'com.h2database:h2'**
}

(... 생략 ...)
```

**—# runtimeOnly는 해당 라이브러리가 런타임(Runtime)시에만 필요한 경우에 사용한다. 컴파일(Compile)시에만 필요한 경우에는 runtimeOnly 대신 compileOnly를 사용한다.**

- [**application.properties](http://application.properties) 파일에 데이터베이스 설정**
    
    ```java
    (... 생략 ...)
    # DATABASE
    spring.h2.console.enabled=true
    spring.h2.console.path=/h2-console
    spring.datasource.url=jdbc:h2:~/local
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=
    ```
    
    - spring.h2.console.enabled - H2 콘솔의 접속을 허용할지의 여부이다. true로 설정한다.
    - spring.h2.console.path - 콘솔 접속을 위한 URL 경로이다.
    - spring.datasource.url - 데이터베이스 접속을 위한 경로이다.
    - spring.datasource.driverClassName - 데이터베이스 접속시 사용하는 드라이버이다.
    - spring.datasource.username - 데이터베이스의 사용자명이다. (사용자명은 기본 값인 sa로 설정한다.)
    - spring.datasource.password - 데이터베이스의 패스워드이다. 로컬 개발 용도로만 사용하기 때문에 패스워드를 설정하지 않았다.
    
    사용자의 홈디렉터리는 윈도우의 경우에는 `C:\Users\(사용자명)` 이고 맥OS의 경우에는 `/Users/(사용자명)` 이다. 본인이 사용하는 OS에 맞는 홈디렉터리에 `local.mv.db` 파일을 생성하자. 파일은 내용 없이 빈파일로 생성한다.
    
- spring.datasource.url에 설정한 결로에 해당하는 DB파일을 만들어야 한다.
    
    그리고 `spring.datasource.url`에 설정한 경로에 해당하는 데이터베이스 파일을 만들어야 한다. 위에서 `spring.datasource.url`을 `jdbc:h2:~/local` 로 설정했기 때문에 사용자의 홈디렉터리(`~` 에 해당하는 경로) 밑에 `local.mv.db` 라는 파일을 생성해야 한다. 만약 `jdbc:h2:~/test`라고 설정했다면 `test.mv.db` 라는 파일을 생성해야 한다.
    
- toutch lcal.mv.db  명령어를 통해 파일 생성
    
    ```java
    ~ % touch local.mv.db
    // 홈디렉토리에서 진행
    ```
    
- • [http://localhost:8080/h2-console](http://localhost:8080/h2-console) 주소로 H2 콘솔 접속

<img width="281" alt="1" src="https://user-images.githubusercontent.com/79856225/236632613-c4dbb615-b1fe-4116-8b89-cc0bf2737e37.png">


**JPA 환경설정**

- **build.gradle 파일 수정**

```java
(... 생략 ...)

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    developmentOnly 'org.springframework.boot:spring-boot-devtools'
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    runtimeOnly 'com.h2database:h2'
    **implementation 'org.springframework.boot:spring-boot-starter-data-jpa'**
}
(... 생략 ...)
```

—# **implementation**

build.gradle 파일의 implementation은 해당 라이브러리 설치를 위해 일반적으로 사용하는 설정이다. implementation은 해당 라이브러리가 변경되더라도 이 라이브러리와 연관된 모든 모듈들을 컴파일하지 않고 직접 관련이 있는 모듈들만 컴파일하기 때문에 rebuild 속도가 빠르다.

- [**application.properties](http://application.properties) 파일 수정**

```java
(... 생략 ...)
# JPA
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
```

- spring.jpa.properties.hibernate.dialect - 데이터베이스 엔진 종류를 설정한다.
- spring.jpa.hibernate.ddl-auto - 엔티티를 기준으로 테이블을 생성하는 규칙을 정의한다.

<aside>
❗ **spring.jpa.hibernate.ddl-auto**

위 설정에서 spring.jpa.hibernate.ddl-auto를 update로 설정했다. update와 같은 설정값에 대해서 간단히 알아보자.

- none - 엔티티가 변경되더라도 데이터베이스를 변경하지 않는다.
- update - 엔티티의 변경된 부분만 적용한다.
- validate - 변경사항이 있는지 검사만 한다.
- create - 스프링부트 서버가 시작될때 모두 drop하고 다시 생성한다.
- create-drop - create와 동일하다. 하지만 종료시에도 모두 drop 한다.

개발 환경에서는 보통 update 모드를 사용하고 운영환경에서는 none 또는 validate 모드를 사용한다.

</aside>

- 엔티티 : 데이터베이스에 저장되는 데이터를 객체로 매핑한 것

</div>
</details>

<details>
<summary> 엔티티 </summary>
<div markdown="1">   

—# 엔티티 

엔티티는 데이터베이스 테이블과 매핑되는 자바 클래스를 말하며 모델 또는 도메인 모델이라고 부르기도 한다. **장고의 모델과 개념이 비슷하다.**

**엔티티의 속성 구상하기**

엔티티의 속성을 구상하는것은 데이터베이스 모델을 구상하는것과 같으며 어떤 테이블이 필요한지를 구상하는것과 같다.

- **질문(Question) 엔티티에는 최소한 다음과 같은 속성이 필요**
    
    
    | 속성명 | 설명 |
    | --- | --- |
    | id | 질문의 고유 번호 |
    | subject | 질문의 제목 |
    | content | 질문의 내용 |
    | create_date | 질문을 작성한 일시 |
- **답변(Answer) 엔티티에는 최소한 다음과 같은 속성이 필요**
    
    
    | 속성명 | 설명 |
    | --- | --- |
    | id | 답변의 고유 번호 |
    | question | 질문(어떤 질문의 답변인지) |
    | content | 답변의 내용 |
    | create_date | 답변을 작성한 일시 |

**질문 엔티티 작성하기**

- main/java/com/examole/demo/Question.java

```java
package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
```

- **코드 에너테이션**
    - **엔티티를 만들기 위해 @Entity 에너테이션을 적용해야 JPA가 인식한다.**
    - **롬복의 Getter Setter을 위한 에너테이션 적용**
- **엔티티(모델)속성 에너테이션**
    - **Id**
        - @GeneratedValue를 적용하면 저장할 대 해당 속성에 값이 1씩 자동으로 증가하여 저장한다.
        - strategy는 고유번호를 생성하는 옵션으로 GenerationType.IDENTITY옵션을 주면 해당 해당 컬럼만의 독립적인 시퀀스를 생성하여 번호를 증가시킨다.
    - **Coulmn(length =200)**
        - 테이블의 세부 설정을 위해 사용된다.
        - Length 옵션을 주면 컬럼의 길이를 설정할 수 있다.
        - columnDefinition = “TEXT” 옵션을 주면 “내용”처럼 글 자 제한없음
    - **OneToMany**
        - 질문에서 답변 엔티티를 참조하기 위한 에너테이션
        - 질문에는 여러 답변이 달릴 수 있다.
        - CascadeType.REMOVE를 사용하여 질문 삭제 시 그 질문에 달린 모든 답변을 함께 삭제할 수 있다.

**답변 엔티티 생성하기**

```java
package com.example.demo;

import java.time.LocalDateTime;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
}
```

- 질문과 비슷하며 질문의 id를 알기 위해 question 변수를 추가했다.
    - 답변은 하나의 질문에 여러개가 달릴 수 있는 구조이므로 ManyToOne 태그를 적용

**H2 콘솔에서 확인**

- [http://localhost:8080/h2-console](http://localhost:8080/h2-console) 주소로 H2 콘솔 접속

<img width="205" alt="1" src="https://user-images.githubusercontent.com/79856225/236632636-ba36c9b4-2751-440f-90b0-f87db066d541.png">

</div>
</details>

<details>
<summary> 레포지터리 </summary>
<div markdown="1">   



</div>
</details>

</div>
</details>



<!-- 
<details>
<summary>  </summary>
<div markdown="1">   

</div>
</details> -->