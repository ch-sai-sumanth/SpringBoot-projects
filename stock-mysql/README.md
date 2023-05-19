# USER MANAGEMENT SYSTEM # 


This project is a Stock management system built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The stock data model is defined in the Stock class, which has the following attributes:
```
stockId : unique identifier for each stock
stockName : name of the stock
stockPrice : price of the stock
stockOwnerCount : owner count in the stock
StockType : type of stock
stockBirthTimeStamp : time of stock listed in stockmarket
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

## Functions used :-

### API Endpoints :-


* PostMapping: /stock
```
In database we add a new stock given through API.
```

* GetMapping: /stock/type/{stockType}
```
This endpoint gives us the data of all stocks belongs to particular stockType
```

* GetMapping: "stock/cap/{capPercentage}"
```
This endpoint gives us the data of all stocks which are having ownerCount greater than the given percentage
```
* GetMapping: "stock/abovePrice/price/{price}/lowerData/data/{date}"
```
This endpoint gives us the data of all stocks which are having stock price above the given price range and listed below the stock listing date
```

* PutMapping : "stock/stock/{id}"
```
In database we update a stock using stock ID
```
* PutMapping : "stock/stock/type/{id}"
```
In database we update a stock type by using stock ID
```
* PutMapping : "stock/marketCap/{marketCap}/id/{id}"
```
In database we update a stock marketCapital using stock ID
```

* DeleteMapping : "stock/ownerCount/{count}
```
In database we delete a by which has owner count less than the given count
```

---

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The stock management system project that I developed using Spring Boot is a web-based application that allows users to perform CRUD (Create, Read, Update, Delete) operations on stock data. The system provides a user-friendly interface to manage stock-related information efficiently.

The key features of your project include:

CRUD Operations: The system allows users to create new stock items, retrieve existing items, update item details, and delete items when necessary. This enables efficient management of stock data.

Stock Management: Users can view and manage various aspects of the stock, such as product details, categories, suppliers, and quantities. The system provides the necessary functionalities to add, edit, and remove stock-related information.

Spring Boot Framework: Your project utilizes Spring Boot, which is a popular Java framework that simplifies the development of web applications. Spring Boot provides features like dependency injection, data persistence with Spring Data JPA, and RESTful API development with Spring MVC.

Database Integration: The system integrates with a relational database management system (RDBMS) to store and retrieve stock data. You have designed the necessary database schema and utilized Spring Data JPA to interact with the database through repository interfaces.

User Interface: The project includes a user interface that allows users to interact with the stock management system. You may have implemented the user interface using swagger UI to provide a user-friendly experience.

Overall, your stock management system project using Spring Boot with CRUD operations on stock provides an efficient and user-friendly solution for managing stock-related information. It leverages the power of Spring Boot and database integration to streamline stock management processes and improve productivity.