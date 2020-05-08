# Spring IOC

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

#### Branches

  - master: basic IoC with constructor and setter injection
  - autowire: master + autowiring feature of Spring
  - bean-scope: autowire + beans scope in Spring (singleton and prototype)
  - annotation: bean-scope + annotation based configuration
  
#### Beans tag for IOC

```
<beans
	xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd"
>
</beans>
```

##### JARs required for IOC

  - spring-beans-5.0.5.RELEASE.jar
  - spring-context-5.0.5.RELEASE.jar
  - spring-core-5.0.5.RELEASE.jar
  - spring-expression-5.0.5.RELEASE.jar
  - spring-jcl-5.0.5.RELEASE.jar
  
#### Beans tag for Annotation based configuration

```
<beans
	xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans 
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context 
       http://www.springframework.org/schema/context/spring-context.xsd" 
>
</beans>
```

##### Additional JARs required for Annotation based configuration

  - spring-aop-5.0.5.RELEASE.jar
  