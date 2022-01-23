## Java Beans and JSP

In order to consider java class as the java bean the java class should follow the following conventions.

* should have no-argument constructor
* implements serializable interface
* should have getter and setter method to get and set the value
* all the instance variable must be private

## Use Bean Action Tag

* **jsp:useBean** action tag is used to locate or instantiate a bean class
* Syntax :
    ``` java
    <jsp:useBean id="instanceName" scope="page|request|session|application" class="packageName.className" 
     type="packageName.className" beanName="packageName.className" | <%= expression>></jsp:useBean>
    ```

## Attributes and usage of jsp:useBean action tag

* id: used to identify the bean in the specified package
* scope: represents the scope of bean. includes page(default),request,session and application.
    * page: can use this bean within the JSP page
    * request: can use this bean from any JSP page that processes the same request
    * session: can use this bean from any JSP page in same session whether it is processes the same request or not
    * application: can use this bean from any JSP page in same application
* class: creates an object of bean class, it must have no-argument constructor and must not be abstract
* type: provides the bean data type if the bean already exists in the scope. Mainly used with class or beanName
  attribute. If you use it without class or beanName, no bean is instantiated.
* beanName: instantiates the bean using the java.beans.Beans.instantiate() method

## jsp:set property syntax

* set all the values of incoming request in the bean
    ``` java
        <jsp:setProperty name="bean" property="*"/>
    ```

* set value for incoming specific property
    ``` java 
        <jsp:setProperty name="bean" property="userName"/>      
    ```

* set specific value in the property
    ``` java 
        <jsp:setProperty name="bean" property="username" value="Chris">

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


