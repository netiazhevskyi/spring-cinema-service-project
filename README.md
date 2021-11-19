### **Cinema Service**

#### **Description:**

An example of a REST WebServer developed using Spring Framework (MVC and Security).

This application represents shop, where users can buy tickets for the available movies.

- Main idea to create application is to show knowledge of Spring Core, Security and MVC,

Hibernate, Java Core, as well as REST architectural style 

- Application implements 3 layer architecture with controller, service and DAO layers.

- Each user must login in order to access application.

- It implements Authentication using an existing DataSource configuration. Database used is MySQL.

- Each user has list of roles that define list of resources accessible for this user.

- JSON format is used to transmit data in a web application.  

#### **Technologies used:**

- Java 11

- Spring Framework (Core, MVC, Security)

- MySQL

- Hibernate ORM

#### **To run this app locally:**

- Fork this project to your repository

- Clone project locally and open it in IntelliJ IDEA

- Change properties for the folliwing line in db.properties file:

```
db.driver=DRIVER

db.url=URL TO DATABASE

db.user=USERNAME

db.password=PASSWORD

```
- Simply run application on your computer. You should Postman API to send Get, Post,

Delete, Put requests to the webserver.
