# Jokes API # 


This project is a Jokes API built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---


---

## Data Flow

```
The user sends a request to the application through the API
```


```
The API receives the request and sends it to the appropriate controller method.
```


```
The controller method picks the random joke from the List
```

```
The controller method returns a response to the API.
```

```
The API sends the response back to the user.
```

---


* PostMapping:
```
Joke is added in to the database LIST
```

* GetMapping: 
```
Random joke is picked from the Database
```

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement GET and POST Operations 
```
---

## Project Summary

The project is a Spring Boot application that serves random jokes from a list database and allows users to post their own jokes to the list.

The project consists of several components:

Joke class: This class represents a joke and contains properties such as ID and text. It also includes the necessary getters and setters.

JokeController class: This class is responsible for handling HTTP requests related to jokes. It includes two main endpoints:

GET endpoint ("/jokes"): This endpoint retrieves a random joke from the list database and returns it as a response. It utilizes a method in the JokeService class to fetch a random joke.

POST endpoint ("/jokes"): This endpoint allows users to post their own jokes to the list database. The posted joke is sent in the request body, and the JokeService class is responsible for adding it to the list.

JokeService class: This class handles the business logic related to jokes. It includes methods to fetch a random joke from the list and add a new joke to the list.

getRandomJoke() method: This method randomly selects a joke from the list database and returns it.

addJoke(Joke joke) method: This method receives a new joke as a parameter and adds it to the list database.

JokeRepository class: This class acts as a simple in-memory database for storing the list of jokes. It includes a list variable to hold the jokes and methods to retrieve a random joke and add a new joke.

Application class: This class serves as the entry point for the Spring Boot application. It contains the main method to start the application.

With this project, users can send GET requests to retrieve a random joke from the list, and they can also send POST requests to add their own jokes to the list.

Note that this is a simplified overview of a Spring Boot project. In a real-world scenario, you would likely have additional components, such as error handling, validation, and a more robust data persistence mechanism. However, the summary provides a basic understanding of how the project handles the main functionalities you described.