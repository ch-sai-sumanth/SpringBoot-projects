# Todo App # 


This project is a Todo Application built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The stock data model is defined in the Todo class, which has the following attributes:
```
TodoId : unique identifier for each todo
TodoName : name of the todo
TodoStatus : status wether completed or not

```

---

## Data Flow

```
The user sends a request to the application through the API endpoints.
```


```
The API receives the request and sends it to the appropriate controller method.
```


```
The controller method makes a call to the method in service class.
```


```
The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
```


```
The controller method returns a response to the API.
```


```
The API sends the response back to the user.
```

---

### API Endpoints :-


* PostMapping: /addTodo
```
In database we add a new Todo through API.
```

* GetMapping: "/getAllTodos"
```
This endpoint gives us the data of all Todos'
```

* GetMapping: "getTodoByStatus"
```
This endpoint gives us the data of all Todos' by status
```
* GetMapping: "getTodoById"
```
This endpoint gives us the data od Todo belongs to particular Id
```

* PutMapping : "updateTodoById/{id}/{status}"
```
This end point updates the status of the Todo by using the Todo ID
```


* DeleteMapping : "deleteTodoById/{id}"
```
In database we delete a Todo by using it's ID
```

---

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement CRUD Operations 
```
---

## Project Summary

he project "Todo Application" is developed using the Spring Boot framework and involves performing CRUD (Create, Read, Update, Delete) operations on a collection of tasks. The user interface for interacting with the application is Postman, a popular API development tool, and the data is stored in a List collection within the application.

The Todo Application allows users to manage their tasks by providing functionalities to create new tasks, retrieve existing tasks, update task details, and delete tasks. These operations are implemented using the Spring Boot framework, which provides a robust and efficient platform for developing Java-based applications.

The application's user interface is built using Postman, which allows users to easily interact with the application's APIs. Postman provides a convenient way to send requests to the application, view and modify data, and receive responses. It is widely used in the development and testing of APIs.

The data storage mechanism used in the application is a List collection. This means that the tasks are stored in memory as a list of objects, allowing for efficient retrieval, modification, and deletion of tasks. However, it's important to note that the data will not persist beyond the lifetime of the application. If the application is restarted, the task data will be reset.

Overall, the Todo Application developed using Spring Boot with CRUD operations and a Postman UI provides a convenient way for users to manage their tasks. It leverages the power of Spring Boot for efficient development and utilizes Postman for easy interaction with the application's APIs.