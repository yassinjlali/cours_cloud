FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ADD target/tpseanceOne-0.0.1-SNAPSHOT.jar tpseanceOne-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/tpseanceOne-0.0.1-SNAPSHOT.jar"]