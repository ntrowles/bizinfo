# bizinfo project created by Joseph_Lin

I. Introduction

	Business Information System is developed for business migrations in Australia. The system graps the business information (e.g., business sale, migration information, etc.) from the given links, and displays the related information to the clients.

II. Project Information

	Note that:
	This project was built using Eclipse (version: eclipse-jee-luna).

1. Framework
	
	1.1 components: JSP + Struts2 + Spring4 + Hibernate4

	1.2 integration architecture: 
		
		Struts (JSP Web page) <---> Spring DI (IoC) <--> Hibernate (JPA DAO) <---> Database
	
		1.2.1 Spring + Struts Integration

		This is core logic and starts from registering ContextLoaderListener and StrutsPrepareAndExecuteFilter in web.xml. StrutsPrepareAndExecuteFilter look up struts.xml file in classpath and configure strut’s specific things like Action mappings, global forwards and other things defined in struts.xml file.
		
		1.2.2 Spring + Hibernate Integration

		Best place is to integrate using Spring’s extensive capabilities to work with different ORMs using excellent use of dependency injection.

2. Database

   	2.1 Database scheme
   
   		database name: bizinfo
		(All .sql files under the folder /sqldata can be imported into MySQL database directly).
	
   	2.2 configure file
   
		/resources/jdbc.properties
	
   	2.3 tables
	
		- turl (the given URLs)
		- tbusinesstype (Business Type)
		- ttypefrequency (record the visitor's behavior)
		- tparsetag (HTML Tag)
		- tparselinks (Parse Result)
		- tuser (admin user)
		- tvisitor (record visitors from their android devices)
		- tvisitstatistics (record visitors's behavior)

	2.4 Transactions (JPA)

		Service class uses annotation @Transactional in method, which essentially run all the database queries execution under the method in a single transaction. 
	
3. Folder Structure
   
	3.1 Java Source Code (/src): entity - dao - service - controller - test
   
 		. entity - hibernate - Object
 
 		. dao - spring - database operation
 
 		. service - Spring & Hibernate - access data
 
 		. controller - Struts & Spring - webpage control

	3.2 XML configure files

 		. /resources/applicationContext.xml - Spring
 
 		. /resources/hibernate.cfg.xml - Hibernate
 
 		. /resources/struts.xml - Struts
 	
 		. /WebRoot/WEB-INF/web.xml - Java Servlet

	3.3 Presentation (root folder /WebRoot)

 		3.3.1 Administration Pages
 
     			/admin - instruction page
     
     			/appdownload - reload app/download app
     
     			/Operation - add businesstype/url/tag
     
     			/presentation - links management

 		3.3.2 Client Pages
 
     			/guestUser - guest read the related links and download the android apps

4. Deployment and Demo
   
  	4.1 Server Configuration

      		CentOS 7.0 + Tomcat 7 + MySQL server 5.6 + OpenJDK 1.7

  	4.2 Deployment
  
      		- Packaged the project as bizinfo.war, then deployed to the Tomcat Server.
      
      		- imported the .sql files under /sqldata to MySQL.

  	4.3 Demo (Deployed on the server at DigitalOcean.com)
  
      		Main Page: 
      			
      			http://128.199.219.7:8080/bizinfo/
      
      		Guest visitor Page: 
      			
      			http://128.199.219.7:8080/bizinfo/guestUser/guestlogin.jsp
      
      		Administrator login page: 
      			
      			http://128.199.219.7:8080/bizinfo/admin/login.jsp 
      			(username: gongqi, password: 123456)


