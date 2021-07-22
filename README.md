# REST API Calculator

This application will use Java and Spring Boot to form a REST API application that will act as simple calculator

## Setup

You can test if the setup works in your local by performing the following steps

```shell
mvn clean install
```

You should expect a successful build when you see the following

```text
[INFO] --- maven-jar-plugin:3.2.0:jar (default-jar) @ rest-calculator ---
[INFO] Building jar: C:\Users\ngjos\projects\rest-api-calculator\target\rest-calculator-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- spring-boot-maven-plugin:2.5.2:repackage (repackage) @ rest-calculator ---
[INFO] Replacing main artifact with repackaged archive
[INFO]
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ rest-calculator ---
[INFO] Installing C:\Users\ngjos\projects\rest-api-calculator\target\rest-calculator-0.0.1-SNAPSHOT.jar to C:\Users\ngjos\.m2\repository\com\blackcurrant\poc\rest\api\calculator\rest-calculator\0.0.1-SNAPSHOT\rest-calculator-0.0.1-SNAPSHOT.jar
[INFO] Installing C:\Users\ngjos\projects\rest-api-calculator\pom.xml to C:\Users\ngjos\.m2\repository\com\blackcurrant\poc\rest\api\calculator\rest-calculator\0.0.1-SNAPSHOT\rest-calculator-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.358 s
[INFO] Finished at: 2021-07-22T14:10:05+08:00
[INFO] ------------------------------------------------------------------------
```

You can trigger the built binary by running below command

```shell
java -jar target/rest-calculator-0.0.1-SNAPSHOT.jar
```

You can just the following commands to trigger the rest api calls supported in this application

```shell
curl -s "localhost:8080/addition?num1=5&num2=10"
```

```shell
curl -s "localhost:8080/fibonacci?input=10"
```

```shell
curl -s "localhost:8080/currentTime"
```

```shell
curl -s "localhost:8080/json_format"
```
