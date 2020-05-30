# Hibernate vs. Spring Data JDBC session code examples
This code example shows how various Hibernate features work in real-world apps. You can understand better what 
is the session, how does lazy loading and dirty checking work. And in general, what kind of complexity it brings...  
* Just run the application and one of the following endpoints:
  * get all persons
  
  `GET http://localhost:8080/person`
  * update the person email
  ```
  PUT http://localhost:8080/person/1
  Content-Type: application/x-www-form-urlencoded
       
  newEmail=participant@javafest.com.ua
  ```
  * add new note
  ```
  POST http://localhost:8080/person/1/notes
  Content-Type: application/json
  
  {
    "text": "it's not gonna work. haha"
  }
  ```
### Spring Data JDBC example
If you want to see how the same app will work using Spring Data JDBC – **just switch to branch** `spring-data-jdbc-example`