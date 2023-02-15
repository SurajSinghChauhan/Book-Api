# Spring Boot, MySQL, JPA, Rest API
Build Restful CRUD API for a blog using Spring Boot, Mysql, JPA and Hibernate.

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/SurajSinghChauhan/Book-Api.git
```

**2. Create Mysql database**
```bash
create database test_api
```
- run `at port 3307`

-run command `use test_api`

**4. Run the app using maven**

```bash
mvn spring-boot:run
```
The app will start running at <http://localhost:8080>

## Explore Rest APIs

The app defines following CRUD APIs.

### Insert

| Method | Url | Decription | Sample Valid Request Body | 
| ------ | --- | ---------- | --------------------------- |
| POST   | http://localhost:8080/books | Add Books | [JSON](#signup) |

### Books

| Method | Url | Description | Sample Valid Request Body |
| ------ | --- | ----------- | ------------------------- |
| GET    | http://localhost:8080/books | Get all books | |

___________________________________________________________________________________________________

**Similar other update and delete commands**
