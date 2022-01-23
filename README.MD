## Request Dispatcher
The RequestDispatcher interface provides the facility of dispatching the request to another resource it may be html, servlet or jsp. This interface can also be used to include the content of another resource as well.
It is one of the way of servlet collaboration.

The RequestDispatcher provides two methods :
* forward() method

  forward the request from a servlet to another resource (servlet, JSP file, or HTMl file) on the server.

  ![forward() method](/images/request.png)

* include() method

  includes the content of a resource (servlet, JSP page, or HTML file) in the response.

  ![include() method](/images/response.png)

### Prerequisite
* Java 8 or higher x64
* Apache Tomcat 7.0 or higher [Download Here](https://tomcat.apache.org/download-70.cgi)
* Intellij Idea

### Running the project
* Clone the repository

  ``git clone https://github.com/nischalshakya30/SERVLET_DEMOS.git``

* Open the IDE

* Go to theFile / Open the project

* Setup up the apache tomcat server

* Run the project 


