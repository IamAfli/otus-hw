FROM amazoncorretto:17-al2-native-jdk
COPY ./build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
