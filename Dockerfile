FROM  openjdk:8
EXPOSE 8083
ADD /target/Timesheet-spring-boot-core-data-jpa-mvc-REST-1-0.0.1-SNAPSHOT.war Timesheet-spring-boot-core-data-jpa-mvc-REST-1.war
ENTRYPOINT ["java", "-jar", "Timesheet-spring-boot-core-data-jpa-mvc-REST-1.war"]