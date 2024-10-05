FROM openjdk:17

COPY target/core-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/

EXPOSE 8085

CMD ["java", "-jar", "/usr/local/tomcat/webapps/core-0.0.1-SNAPSHOT.jar"]