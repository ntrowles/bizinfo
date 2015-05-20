<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>help</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    Links added can include text, video and audio but must be placed in the correct position.<br>
    <p>
    <b>Category</b>
    This refers to the categories that appear on the app such as 'Business News' and 'Business Experience'. Please note that adding more categories makes the app interface longer than one mobile screen.
    </p>
    <p>
    <b>Website/URL</b>
    This refers to the addition of a link to an entire website, without specifying any particular content. This should be done only if the entire website is relevant to the app's users.
    </p>
    <p>
    <b>Single link</b>
    This refers to the addition of a specific link to a particular item. 
    </p>
  </body>
</html>
