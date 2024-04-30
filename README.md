# SKN Reactive Spring Boot Security Configuration Library

[![Maven Central](https://img.shields.io/maven-central/v/best.skn/skn-spring-security)](https://central.sonatype.com/artifact/best.skn/skn-spring-security) [![Javadoc](https://javadoc.io/badge2/best.skn/skn-spring-security/1.2.0/javadoc.svg)](https://javadoc.io/doc/best.skn/skn-spring-security/1.2.0) [![Apache License 2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

&nbsp;

## **_JavaDocs:_**

### Read the Javadoc for the main Service APIs

- [CsrfService API](https://javadoc.io/static/best.skn/skn-spring-security/1.1.0/best/skn/security/services/CsrfService.html)
- [PrincipalService API](https://javadoc.io/static/best.skn/skn-spring-security/1.1.0/best/skn/security/services/PrincipalService.html)
- [SessionService API](https://javadoc.io/static/best.skn/skn-spring-security/1.1.0/best/skn/security/services/SessionService.html)

&nbsp;

## **_Introduction:_**

### This is a simple Java Reactive Spring Boot Library for security configuration

### I made this library so that I can use it in most of my spring boot reactive projects without writing the same codes over and over again

### The main API Classes of this library are `CsrfService`, `PrincipalService` & `SessionService`, each of which holds a method for GET request

&nbsp;

## **_Details:_**

### **(1) `CsrfService` Class:**

- It needs to be instantiated first
- It must be used in controller GET requests
- It has 1 method to get CSRF Token if CSRF is enabled in Spring Security
- This method throws `Exception` if error occurs getting and showing CSRF token

### **(2) `PrincipalService` Class:**

- It needs to be instantiated first
- It must be used in controller GET requests
- It has 1 method to get Principal information i.e. the info of the authenticated users
- This method throws `Exception` if error occurs getting and showing Principal info

### **(3) `SessionService` Class:**

- It needs to be instantiated first
- It must be used in controller GET requests
- It has 1 method to get Web Session information
- This method throws `Exception` if error occurs getting and showing Web Session info

&nbsp;

## **_Requirements:_**

- 💀 Minimum Java Version: `21`
- 💀 Minimum Maven Version: `3.9.6`
- 💀 Minimum Spring Boot Version: `3.2.5`
- 💀 Spring Web Flux (Reactive Spring Boot)
- 💀 Spring Security
- 💀 Spring Session
- 💀 Spring OAuth2 Client

&nbsp;

## **_Usage:_**

### For `Maven`, inside `dependencies` tag of `pom.xml`, copy the following

> ```xml
> <dependency>
>   <groupId>best.skn</groupId>
>   <artifactId>skn-spring-security</artifactId>
>   <version>1.2.0</version>
> </dependency>
> ```

### Write the following in the terminal

> ```zsh
> mvn install
> ```

### First create a configuration class

> ```java
> import best.skn.security.configurations.*;
>
> @Configuration
> @Import(
>   {
>     CsrfConfiguration.class,
>     PrincipalConfiguration.class,
>     SessionConfiguration.class
>   }
> )
> public class SecurityInfoConfiguration {}
> ```

### Inside your Java Code, import the package like this for `CsrfService`

> ```java
> import best.skn.security.services.CsrfService;
> ```

### Inside your Java Code, import the package like this for `PrincipalService`

> ```java
> import best.skn.security.services.PrincipalService;
> ```

### Inside your Java Code, import the package like this for `SessionService`

> ```java
> import best.skn.security.services.SessionService;
> ```

### For external configuration in `application.yaml`, follow the instructions below

> #### (1) CORS Configuration: When setting your CORS allowed origins, you have to give a list of String as a parameter in Spring Security, but with this library you can externalize it
>
> > ##### (a) First inside your CORS configuration, do this
> >
> > ```java
> > import best.skn.security.properties.CorsSourceProperty;
> >
> > @Configuration
> > @EnableConfigurationProperties(CorsSourceProperty.class)
> > public class CorsSourceConfiguration() {
> >
> >   @Autowired
> >   private CorsSourceProperty corsSourceProperty;
> >
> >   // your configuration here. The class name is arbitary.
> > }
> > ```
> >
> > ##### (b) In `application.yaml`, do this
> >
> > ```yaml
> > skn:
> >   security:
> >     cors:
> >       origins:
> >         - http://localhost:3000
> >         - http://localhost:5173
> > ```
>
> #### (2) Login Configuration: When setting your custom login url, you have to give a String as a parameter in Spring Security, but with this library you can externalize it
>
> > ##### (a) First inside your Login configuration, do this
> >
> > ```java
> > import best.skn.security.properties.LoginProperty;
> >
> > @Configuration
> > @EnableConfigurationProperties(LoginProperty.class)
> > public class LoginConfiguration() {
> >
> >   @Autowired
> >   private LoginProperty loginProperty;
> >
> >   // your configuration here. The class name is arbitary.
> > }
> > ```
> >
> > ##### (b) In `application.yaml`, do like this
> >
> > ```yaml
> > skn:
> >   security:
> >     login:
> >       url: http://localhost:5173/api/auth/login
> > ```
>
> #### (3) OAuth2 Configuration: When setting your custom successful login redirection url for OAuth2, you have to give a String as a parameter in Spring Security, but with this library you can externalize it
>
> > ##### (a) First inside your OAuth2 configuration, do this
> >
> > ```java
> > import best.skn.security.properties.OAuth2Property;
> >
> > @Configuration
> > @EnableConfigurationProperties(OAuth2Property.class)
> > public class OAuth2Configuration() {
> >
> >   @Autowired
> >   private OAuth2Property oAuth2Property;
> >
> >   // your configuration here. The class name is arbitary.
> > }
> > ```
> >
> > ##### (b) In `application.yaml`, do just like this
> >
> > ```yaml
> > skn:
> >   security:
> >     oauth2:
> >       client:
> >         success:
> >           redirect: http://localhost:5173/api/auth/status
> > ```
>
> #### (4) Security Configuration: When setting your authenticated exchanges, you have to give a list of String as a parameter in Spring Security, but with this library you can externalize it
>
> > ##### (a) First inside your Security configuration, do this
> >
> > ```java
> > import best.skn.security.properties.SecurityProperty;
> >
> > @Configuration
> > @EnableConfigurationProperties(SecurityProperty.class)
> > public class SecurityConfiguration() {
> >
> >   @Autowired
> >   private SecurityProperty securityProperty;
> >
> >   // your configuration here. The class name is arbitary.
> > }
> > ```
> >
> > ##### (b) In `application.yaml`, you can do this
> >
> > ```yaml
> > skn:
> >   security:
> >     authorize:
> >       exchanges:
> >         - /
> >         - /skn/**
> >         - /api/auth/**
> >         - /api/mail/**
> > ```

### For instructions for `Gradle` & others: Visit [Maven Central](https://central.sonatype.com/artifact/best.skn/skn-spring-security)

&nbsp;

## **_Dedicated To:_**

- 👩‍🎨`Prodipta Das Logno` & 🧛‍♀️`Atoshi Sarker Prithula`: The two most special ladies of my life. I can't thank them enough for always treasuring me a lot. I am lucky that I met with these two amazing ladies. They have two special places in my heart and no other girl can ever replace them.
- 💯`My Parents`: The greatest treasures of my life ever.
