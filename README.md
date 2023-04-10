# Spring boot3 OAuth2 GitHub Authorization Server for Social Login.
* Demo project for OAuth2 + Spring-boot3 + GitHub as Authorization server.

A sample project that shows how to implement OAuth2 login using Github as a resource server

### Application diagram

![Diagram](./diagram.png?raw=true "Diagram")

### OAuth2.0 flow (How things really work in action)

![Diagram](./oauth2-flow.png?raw=true "OAuth 2.0 flow diagram")

### Steps to create a gitHub application
* Go to [GitHub developer portal](https://github.com/settings/developers)
* Create a new application and provide the required information
    * Set the homepage URL to http://localhost:8080
    * Authorization callback URL to http://localhost:8080/login/oauth2/code/github.

### Update the `application.yml` file
After creating a new application, you will a client ID and a client secret. Copy this two information and paste the in the `application.yml` file

```
spring:
  security:
    oauth2:
      client:
        registration:
          github:
            clientId: github-app-client-id-here
            clientSecret: github-app-client-secret-here
```

### Start the application and enjoy your Social-login

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#web)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#actuator)
* [OAuth2 Client](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#web.security.oauth2.client)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

