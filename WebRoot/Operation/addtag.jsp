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

<title>Add Tag</title>

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
<script type="text/javascript" src='js/addtag.js'></script>

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
					Add Web Crawler
				</h2>

				<div id="main">
					<form method="post" action="addparseTag" class="jNice">
						<h3><a href="Operation/manualTag.txt">List Web Crawlers</a></h3>
						<table cellpadding="0" cellspacing="0">
							<tr class="odd">
								<th>URL</th>
								<th>Category</th>
								<th>Get Links</th>
								<th>Crawler</th>
								<th>Action</th>
							</tr>
							<c:if test="${!empty tparsetags}">
								<c:forEach items="${tparsetags}" var="emp">
									<tr>
										<c:if test="${emp.urlid==parseurlid}">
											<c:forEach items="${turls}" var="tu">
												<c:if test="${emp.urlid==tu.id}">
													<td class="action"><a class="view">${tu.urllink}</a></td>
													<c:forEach items="${tbusinesstypes}" var="tbt">
														<c:if test="${tu.typeid==tbt.id}">
															<td class="action"><a
																href="listBusinessLinks${tbt.id}" class="view">${tbt.typename}</a></td>
															<td class="action"><a
																href="Parselinks/${emp.id}/${tbt.id}" class="Edit">Get</a></td>
														</c:if>
													</c:forEach>
												</c:if>
											</c:forEach>

											<td>${emp.content}</td>
											<td class="action"><a
												href="deleteTag/${emp.id}/${parseurlid}" class="delete">delete</a></td>
										</c:if>
									</tr>
								</c:forEach>
							</c:if>
							
						</table>
						<br>
						<h3>Add Web Crawler Section</h3>
						<input value="${parseurlid}" name="tparsetag.urlid" type="hidden">
						<input id="countValue" value="1" type="hidden">
						<fieldset id="TagAttribute">
							<p>
								<label>Crawler: (you can click 'Add Tag' for
									different levels, then click 'Add Tag Content')</label><input type="text"
									class="text-long" name="tparsetag.content" id="ParseContent"
									disabled />
							</p>

							<p></p>
						</fieldset>
						<a class="button_grey_round"
							onclick="javascript:addSelect('TagAttribute')"><span>Add Tag</span>
							</a> <a class="button" onclick="javascript:addContent()"
							style="visibility:hidden" id="addcontentbutton"><span>Add Tag
								Content</span></a> <a class="button_ok" href="javascript:;"
							onclick="parentNode.submit();" style="display:none;"
							id="submitbutton"><span>Add New Tag</span></a>
							
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
