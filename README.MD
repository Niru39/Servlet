## JSP Implicit Objects

Implicit objects created by the web container that are available to all the jsp pages.

9 jsp implicit object:

| Object | Type | Description |
| -----  | ---- | ----------- |
| out | JspWriter | For printing value of the variables|
| request | HttpServletRequest | Used to get request information such as parameter, header information, remote address, server name, content type etc. It can also be use to set, get and remove attributes from jsp request scope.|
| response | HttpServletResponse | Used to add or manipulate response such as redirect response to another resource, send error etc|
| config | ServletConfig | Used to get the initialized parameter for a particular JSP page.| 
| application | ServletContext | Used to get initialization parameter from the configuration file (web.xml). It can also be used to get, set or remove attribute from the application scope.|
| session | HttpSession | Used to set, get or remove attribute or to get session information.|
| pageContext | PageContext | Used to set, get or remove attribute from one of the following scopes i.e: page, request, session and application. |
| page | Object | This object is assigned to the reference of auto generated servlet class.|
| exception | Throwable | This object can be used to print the exception. But it can only be used in error pages.| 

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


