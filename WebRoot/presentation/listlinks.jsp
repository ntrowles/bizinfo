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

<title>Link List</title>

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
			<li><a href="adminPage" class="active"><span class="outer"><span
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
						<li><a href="adminURL">Add New URL/Website</a></li>
						<li><a href="admindirectURL">Add Single Links</a></li>
					</ul>
					<!-- // .sideNav -->
				</div>
				<!-- // #sidebar -->

				<!-- h2 stays for breadcrumbs -->
				<h2>
					<a href="incomingPage">List</a> &raquo;
					<c:forEach items="${tbusinesstypes}" var="tb">
						<c:if test="${tb.id == businesstypeid}">
							<a class="active">${tb.typename}</a>
						</c:if>
					</c:forEach>
				</h2>

				<div id="main">
					<form class="jNice">
						<h3></h3>
						<table cellpadding="0" cellspacing="0">
							<tr class="odd">
								<th>Title</th>
								<th>Action</th>
								<th>Update</th>
							</tr>
							<c:if test="${!empty tparselinks}">
								<c:forEach items="${tparselinks}" var="emp">
									<c:if test="${businesstypeid == emp.typeid}">
										<tr>
											<td id="tid" class="action" style="display:none;">${emp.id}</td>
											<td id="ttypeid" class="action" style="display:none;">${emp.typeid}</td>
											<td class="action"><a href="${emp.outlinkurl}"
												id="title" class="view">${emp.outlinktitle}</a></td>
											
											<td class="action"><a
												href="deleteLink/${emp.id}/${emp.typeid}" class="delete">delete</a></td>
											<td class="action"><a
												href="editLink${emp.id}" class="edit">edit</a></td>
										</tr>
									</c:if>
								</c:forEach>
							</c:if>



						</table>


						<a href="deleteHistory${businesstypeid}" class="button_notok"><span>Clear
								History</span></a> <a href="listalltype" class="button_grey_round"><span>Return
								to Business Type Page</span></a>

						<!-- Previous & Next Page -->
						<!--  
						<div class="pagination">
							<a href="listprevious" class="next">&laquo; Previous</a>
							<a href="listnext" class="next">Next &raquo;</a>
						</div>
						-->
						<!--  PAGINATION END  -->

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
