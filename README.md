# Contents 

This project assumes you have Maven installed on your machine.

This repo is dedicated to a job assessment for [ERP International](https://erpinternational.com/). The contents
of the assessment are in a Word doc within this repo:

Sr. Full Stack Java Developer Assessment - Req #2021-3500.doc

## Building

This section assumes you have the dependencies already on the executing machine.

This project uses at Lombok and MapStruct to generate code.

Running a simple `mvn clean install` should generate the code needed to run the Spring application.

## Available Scripts

To run the assessment you need to run Spring and React environment. You can run them together using the script:
`init.sh`
Located in the project root. Make sure you don't spin up a ton of java processes. This is a very quick and dirty script.

------
Alternatively, you can run the commands separately.

Spring startup: `mvn spring-boot:run`

Frontend startup: `npm start`

Note, you must be in the frontend directory to run `npm start`

---
Once the application is started, API docs and local H2 DB console through the following links:

http://localhost:8080/swagger-ui/

http://localhost:8080/h2-console/

The front end application is available at:

http://localhost:3000
