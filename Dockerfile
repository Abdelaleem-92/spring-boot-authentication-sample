FROM openjdk:8
EXPOSE 8080
ADD target/callsign-authentication.jar callsign-authentication.jar
ENTRYPOINT ["java", "-jar", "/callsign-authentication.jar"]