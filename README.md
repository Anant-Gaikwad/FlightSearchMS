# FlightSearch MicroService

Flight Search with passenger details  Requirment : 
 1. Add logger in filter to log all request and responce
 2. Add Interceptor to validate request param pattern(flight Number as : FL_<ALPHA>_<NUMERIC>)
 3. Add Create and insert scripts through flyway.
 4. Get valid response 
  
Installation Setps
For further reference, please consider the following sections:

Pre-Requisites on Local Machine
   1. Java 1.8
   2. Maven
   3. Mysql running on port 3306

Installation

Once Installation is done follow following steps:

1. Set the properties into the application.properties as:

    spring.datasource.username=(set your Mysql UserName)
    spring.datasource.password=(set your Mysql password)

The app when it comes up will have 2 Flights with Passenger details inserted in the system via flyway Migration scripts-

Steps to Run

1. Run you project with mvn spring-boot:run 

2. Open Postman to test URL with http://localhost:8081/flight/getFlight?flightNo=FL_SIN_1011
   
3. To see all flights  http://localhost:8081/flight/getAllFlight
