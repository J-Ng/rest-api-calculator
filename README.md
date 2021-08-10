# Rest Api with Spring Boot + MongoDB

This application will use Java and Spring Boot to form a REST API application that will cconnect to MongoDB and run queries on demand.

## MongoDB instlalation

For setup on a windows server, you can follow the instructions mentioned [here](https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/)

## Start up MongoDB

You can start up MongoDB using below command

```shell
mongod.exe --dbpath="J:\MongoDB\data\db"
```

## Populating our DB for this application

We will create a database of Emploees with the fields: name, employee id, job_title, start_date, status 

```text
{"_id":{"$oid":"6111de3885e4fe0b3f2e4d46"},"name":"John Doe","job_title":"SRE Engineer","start_date":"new Date()","status":"Active"}
{"_id":{"$oid":"6111de3885e4fe0b3f2e4d47"},"name":"Jackson Oozy","job_title":"Data Engineer","start_date":"new Date()","status":"Active"}
{"_id":{"$oid":"6111de3885e4fe0b3f2e4d48"},"name":"Tenshin Hanzo","job_title":"Software Engineer","start_date":"new Date()","status":"Active"}
```

## Running our application

You can test if the setup works in your local by performing the following steps

```shell
mvn clean install
```

You should expect a successful build when you see the following

```text
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ rest-mongodb-service ---
[INFO] Installing J:\projects\rest-api-calculator\target\rest-mongodb-service-0.0.1-SNAPSHOT.jar to J:\.m2\repository\com\rocketowl\poc\rest\api\mongodb\rest-mongodb-service\0.0.1-SNAPSHOT\rest-mongodb-service-0.0.1-SNAPSHOT.jar
[INFO] Installing J:\projects\rest-api-calculator\pom.xml to J:\.m2\repository\com\rocketowl\poc\rest\api\mongodb\rest-mongodb-service\0.0.1-SNAPSHOT\rest-mongodb-service-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.550 s
[INFO] Finished at: 2021-08-10T11:30:22+08:00
[INFO] ------------------------------------------------------------------------
```

You can trigger the built binary by running below command

```shell
java -jar target/rest-mongodb-service-0.0.1-SNAPSHOT.jar
```

You can just the following commands to trigger the rest api calls supported in this application

```shell
curl -s "localhost:8080/addition?num1=5&num2=10"
```

