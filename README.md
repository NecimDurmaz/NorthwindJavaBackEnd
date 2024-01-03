Business Management Project
=======================

This project contains the source code for the Northwind sample project used in Engin Demiroğ's Java Camp Backend training.

About the Project
------------
This project provides a basic business management system using the Northwind data structure. The system supports functions such as customer management, product management, and order management. The project was developed using the Java programming language and the Spring Boot framework.

Project Structure
-------------
The project consists of the following packages:

>com.northwind: Main package
> 
   >> 1)adapters: Adapters for external systems (e.g., sending emails) 
> 
   >> 2)api: RESTful API controllers
> 
   >> 3)config: Configuration classes
> 
   >> 4)dataAccess: Data access layer (repositories, entities, etc.)
> 
   >> 5)core: Core business logic and services 
> 
   >> 6)exceptions: Custom exception classes
> 
   >> 7)utils: Utility classes
> 

Installation
------------

1.  Clone the repository to your local machine:

    bashCopy code

    ```
    git clone https://github.com/lburakakca/BusinessManagementProject.git
    ```

2.  Open the project in your favorite IDE (such as IntelliJ or Eclipse).
3.  Build the project using Maven:

    Copy code

    ```
    mvn clean install
    ```

4.  Run the project using the Spring Boot Maven plugin:

    Copy code

    ```
    mvn spring-boot:run
    ```

5.  Open your web browser and go to [http://localhost:8080](http://localhost:8080) to access the application.

Usage
-----

The e-commerce website includes the following pages:

*   Home page: Displays the list of products available for sale.
*   Product detail page: Displays detailed information about a particular product, including its name, description, price, and image.
*   Shopping cart page: Displays the list of items in the shopping cart and allows the user to update or remove items.
*   Checkout page: Displays a form for the user to enter their shipping and payment information and complete the purchase.

Contributing
------------

Contributions to the project are welcome. If you find a bug or want to suggest an improvement, please open an issue on the GitHub repository.

License
-------

This project is licensed under the [MIT License](LICENSE).ses
 
