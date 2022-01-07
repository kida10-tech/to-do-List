# TO-DO List

To Do List

## Tech specifications:

PostgreSQL 14.0
SpringBoot 2.6.2
Gradle
Flyway: DB migration
JWT: Authentication
Spring Security
Postman 

## Register info:

You need to provide a username and a password (size=8) to signup as a USER.

Once you have registered, you must signin to get a JWT. This will be used to authorize the different endpoints in the Controller.
You should try this using Postman.

## Database migration:

The code already have the necessary scripts to persist the database.
The migration is resolved using Flyway plugin. It will create 2 tables, one for the Users and the other one for lists.

### Database configuration:
spring:
datasource:
    url: jdbc:postgresql://localhost:5432/todo_list
    username: postgres
    password: postgres
jpa:
    show-sql: true

## User permissions:

As a registered user you will be capable of creating, updating, deleting and get the lists you consider.
Soft delete has been applied as you may want to keep the list in your database. Everytime you delete a list it will disappear from Postman but still persist in the database.




