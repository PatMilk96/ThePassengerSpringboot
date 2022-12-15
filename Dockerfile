FROM openjdk:17
COPY target/PassengerSpringboot-*.jar /Passenger.jar
CMD ["java", "-jar", "/Passenger.jar"]