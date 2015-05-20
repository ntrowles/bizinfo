<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Add URL</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<!-- CSS -->
<link href="style/css/transdmin.css" rel="stylesheet" type="text/css"
	media="screen" />
<!--[if IE 6]><link rel="stylesheet" type="text/css" media="screen" href="style/css/ie6.css" /><![endif]-->
<!--[if IE 7]><link rel="stylesheet" type="text/css" media="screen" href="style/css/ie7.css" /><![endif]-->

<!-- JavaScripts-->
<script type="text/javascript" src="style/js/jquery.js"></script>
<script type="text/javascript" src="style/js/jNice.js"></script>
<script type="text/javascript" src="js/URLlinks.js"></script>

</head>

<body>
	<div id="wrapper">
		<!-- h1 tag stays for the logo, you can use the a tag for linking the index page -->
		<h1>
			<a href="http://www.curtin.edu.au/"><span>BizInfo Admin
					System</span></a>
		</h1>

		<!-- You can name the links with lowercase, they will be transformed to uppercase by CSS, we prefered to name them with uppercase to have the same effect with disabled stylesheet -->
		<ul id="mainNav">
			<li><a href="adminPage"><span class="outer"><span
						class="inner admin">DASHBOARD</span></span></a></li>
			<!-- Use the "active" class for the active menu item  -->
			<li><a href="showoperation"><span class="outer"><span
						class="inner operation">HELP</span></span></a></li>
			<li><a href="showlist"><span class="outer"><span
						class="inner list">STATISTICS</span></span></a></li>
			<li><a href="downloadPage"><span class="outer"><span
						class="inner download">APP DOWNLOAD</span></span></a></li>
			<li><a href="aboutus"><span class="outer"><span
						class="inner aboutus">ABOUT US</span></span></a></li>
			<li><a href="logout"><span class="outer"><span
						class="inner logout">LOGOUT</span></span></a></li>
		</ul>
		<!-- // #end mainNav -->

		<div id="containerHolder">
			<div id="container">
				<div id="sidebar">
					<ul class="sideNav">
						<li><a href="adminBusinesstype">Add Categories</a></li>
						<li><a href="adminURL" class="active">Add New URL/Website</a></li>
						<li><a href="admindirectURL">Add Single Links</a></li>
					</ul>
					<!-- // .sideNav -->
				</div>
				<!-- // #sidebar -->

				<!-- h2 stays for breadcrumbs -->
				<h2>
					Add URL
				</h2>

				<div id="main">
					<form method="post" action="addURL" class="jNice" onsubmit="return validateURL();">
						<h3>List Existed URLs/websites<a href="Operation/manualURL.txt">(How to add a new URL/website?)</a></h3>
						<table cellpadding="0" cellspacing="0">
							<tr class="odd">
								<th>URL</th>
								<th>Category</th>
								<th>Action</th>
								<th>Web Crawling</th>
							</tr>
							<c:if test="${!empty turls}">
								<c:forEach items="${turls}" var="emp">
									<tr>
										<td class="action">${emp.urllink}</td>
										<c:forEach items="${tbusinesstypes}" var="tbt">
											<c:if test="${emp.typeid==tbt.id}">
												<td class="action"><a href="listBusinessLinks${tbt.id}"
													class="view">${tbt.typename}</a></td>
											</c:if>
										</c:forEach>
										<td class="action"><a href="deleteURL${emp.id}"
											class="delete">delete</a></td>
										<td class="action"><a href="parseURL${emp.id}"
											class="edit">crawler</a></td>
									</tr>
								</c:forEach>
							</c:if>
						</table>
						<br>

						<h3>Add URL Section</h3>
						<fieldset>
							<p>
								<label>URL :</label><input id="linkurl" type="text" class="text-long"
									name="turl.urllink" />
							</p>

							<p>
								<label>Category:</label> <select name="turl.typeid">
								<c:if test="${!empty tbusinesstypes}">
									<c:forEach items="${tbusinesstypes}" var="tbt">
										<option value="${tbt.id}">${tbt.typename}</option>
									</c:forEach>
								</c:if>
								</select>
							</p>
							<input type="submit" value="Submit New URL" />
						</fieldset>
					</form>
				</div>
				<!-- // #main -->

				<div class="clear"></div>
			</div>
			<!-- // #container -->
		</div>
		<!-- // #containerHolder -->

		<p id="footer">
			Page Created by Joseph Lin.
		</p>
	</div>
	<!-- // #wrapper -->
</body>
</html>
