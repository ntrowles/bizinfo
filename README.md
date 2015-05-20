# bizinfo project created by Joseph_Lin
business Information System

Note:
This project was built on the Eclipse (version: eclipse-jee-luna).

1. Framework

1) components: JSP + Struts2 + Spring4 + Hibernate4

2) configure files: Struts2 - resources/struts.xml;
                    Spring4 - resources/applicationContext.xml;
                    Hibernate4 - resources/hibernate.cfg.xml

2. Database

   2.1 sql file
   
	/sqldata
	
   2.2 configure file
   
	/WebRoot/WEB-INF/jdbc.properties
	
   2.3 tables
   
	database name (MySQL) - bizinfo
	
	Tables:
	
	- turl (URL)
	- tbusinesstype (Business Type)
	- ttypefrequency (record the visitor's behavior)
	- tparsetag (HTML Tag)
	- tparselinks (Parse Result)
	- tuser (admin user)
	- tvisitor (record visitors from their android devices)
	- tvisitstatistics (record visitors's behavior)
	
3. Java Code Arrangement (/src):

   The structure: entity - dao - service - controller
   
 . entity - hibernate - Object
 
 . dao - spring - database operation
 
 . service - Spring & Hibernate - access dao
 
 . controller - Struts & Spring - webpage control

4. configure files (/resources)

 . applicationContext.xml - Spring
 
 . hibernate.cfg.xml - Hibernate (mapping for entity)
 
 . struts.xml - Struts

5. Folder Structure (root folder /WebRoot)

 Main page: /admin/login.jsp
 
 5.1 Administration Pages
 
     /admin - instruction page
     
     /appdownload - reload app/download app
     
     /Operation - add businesstype/url/tag
     
     /presentation - links management

 5.2 Guest Pages
 
     /guestUser - guest read the related links and download the android apps

6. Server Configuration
   
  6.1 System and Tools

      CentOS 7.0 + Tomcat 7 + MySQL server 5.6 + OpenJDK 1.7

  6.2 Deployment
  
      - Packaged the project as bizinfo.war, then deployed to the Tomcat Server.
      
      - imported the .sql files under /sqldata to MySQL.

  6.2 Demo (Deployed on the server at DigitalOcean.com)
  
      Main Page: http://128.199.219.7:8080/bizinfo/
      
      Guest visitor Page: http://128.199.219.7:8080/bizinfo/guestUser/guestlogin.jsp
      
      Administrator login page: http://128.199.219.7:8080/bizinfo/admin/login.jsp 
      (username: gongqi, password: 123456)


