

##  Spring Boot made easy
Use [Spring initializer](https://start.spring.io/) to generate stubbed applications. Can be done through the web site,
or by pulling directly via curl.   From web site, pick options, then can be downloaded as zip file, or
select "Share".  This should produce a url like:

```
https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.2.2&packaging=jar&jvmVersion=17&groupId=com.bkonash&artifactId=crud&name=crud&description=Demo%20project%20for%20Spring%20Boot&packageName=com.bkonash.crud&dependencies=web,h2,data-jdbc
```

That can be converted to a curl command, as follows:

```
curl https://start.spring.io/starter.tgz -d type=maven-project -c language=java -dplatformVersion=3.2.2 -d packaging=jar -d jvmVersion=17 -d groupId=com.bkonash -d artifactId=crud -d name=crud -d description=Demo%20project%20for%20Spring%20Boot -d packageName=com.bkonash.crud -d dependencies=web,h2,data-jdbc |tar -xzvf -
```

Maybe all the url args could just be passed after starter.tgz as is?

## Detailed guide for developing REST services
[Building REST services with Spring](https://spring.io/guides/tutorials/rest)

