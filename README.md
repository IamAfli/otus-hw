Simple web application for OTUS homework 1

Runs on port 8000

Available APIs:
- GET /greeting
  - parameter 'name' - string, optional
- GET /health


---

Build application

```
./gradlew clean build
```

Run application

```
# command
java -jar ./build/libs/$JAR_FILE_NAME.jar

# example
java -jar ./build/libs/otus-homework-1-0.0.1-SNAPSHOT.jar
```
