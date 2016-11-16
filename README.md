Learning netflix stack using spring cloud.
* Eureka
* Feign

# Structure
* Eureka-server: Just the eureka server where the services register itselves;\
* rest_service: A simple service just with a test rest method that returns hello;
* service-consumer: A test consumer that users `Feign` to consume the method inside `rest_service` consulting Eureka server.
