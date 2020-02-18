# soap-wx-sample
Soap WX Sample Project

## Step 1: Create the Eclipse project

For this SOAP web services example in Java using Eclipse.
* Create a dynamic web project in Eclipse named soap-ws-example. 
* Web module version 3.1 
* Tomcat 8.5.x as the chosen runtime.

## Step 2: Code the Score class

This example will use two classes: 
1) Simple POJO (Plain Old Java Object) named `Score`
    * three public int variables named `wins`, `losses` and `ties`
    * No setters or getters.
2) Service class named `ScoreService`.
    * Access to the Score class through methods such as getScore(), increase() and get() methods for each variables. 
    * Initialize the static instance of the Score class

## Step 3: Add XML annotations

`Score` class encapsulates will be sent to SOAP web services clients in XML format. Thus, the class requires 
* @XMLType annotation. 
* @XmlAccessorType annotation that indicates field-based access (XmlAccessorType.FIELD)

## Step 4: Add SOAP WebService annotations

To turn the `ScoreService` into a SOAP web service, it needs to be decorated with two annotations: 
* @Stateless to indicate the class complies with all of the semantics of a stateless Enterprise JavaBeans (EJB) architecture 
* @WebService to indicate that the public methods in the class can be accessed through a SOAP-based service.

## @WebMethod annotation

JAX-WS provides a special annotation @WebMethod to override the default method to Web Services Description Language (WSDL) mappings.

## Step 5: Run and test the SOAP web service

* Simply right-click on the soap-ws-example project, and select New > Other > Web Services > Web Service.
* For Service Implementation, Browse `ScoreService` class and click Next.
* When it reaches Start Server, click Start Server to start the web service.

Referenced from: https://www.theserverside.com/video/Step-by-step-SOAP-web-services-example-in-Java-using-Eclipse
