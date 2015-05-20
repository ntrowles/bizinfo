<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>ListLinks</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="guestUser/styles/layout.css"
	type="text/css" />
<script type="text/javascript"
	src="guestUser/scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript"
	src="guestUser/scripts/jquery.easing.1.3.js"></script>
<script type="text/javascript"
	src="guestUser/scripts/jquery.hoverIntent.js"></script>
<script type="text/javascript"
	src="guestUser/scripts/jquery.hslides.1.0.js"></script>
<script type="text/javascript"
	src="guestUser/scripts/jquery.hslides.setup.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body id="top">
	<div id="header">
		<div class="wrapper">
			<div class="fl_left">
				<h1>
					<a href="guestbusinessinformation">Business Information</a>
				</h1>
				<p>
					Find the  <font size="2" color="#808000">right business information</font> 
					for you here.
				</p>
			</div>
			
			<br class="clear" />
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="topbar">
		<div class="wrapper">
			<div id="topnav">
				<ul>
					<li><a href="welcomePage">Home</a></li>
					<li class="active"><a href="guestbusinessinformation">Business
							Information</a>
						<ul>
							<li><a href="guestlistBusinessLinks/1/1">Business News</a></li>
							<li><a href="guestlistBusinessLinks/3/1">Business Sale</a></li>
							<li><a href="guestlistBusinessLinks/2/1">Business
									Experience</a></li>
							<li><a href="guestlistBusinessLinks/4/1">Migration
									Information</a></li>
						</ul></li>
					<li><a href="guestdownload">BizInfo App Download</a></li>
					<li><a href="guestcontactus">Contact Us</a></li>
					<li class="last"><a href="guestaboutus">About us</a></li>
				</ul>
			</div>

			<br class="clear" />
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="breadcrumb">
		<div class="wrapper">
			<ul>
				<li class="first">BizInfo</li>
				<li>&#187;</li>
				<c:forEach items="${tbusinesstypes}" var="tb">
					<c:if test="${tb.id == businesstypeid}">
						<li class="current"><a class="active">${tb.typename}</a></li>
					</c:if>
				</c:forEach>
			</ul>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<ul>
				<c:if test="${!empty tparselinks}">
					<c:forEach items="${tparselinks}" var="emp" varStatus="loopCounter">
						<c:if test="${businesstypeid == emp.typeid}">

							<li><label>${startpagenumber + loopCounter.count}&#187;
							</label><a href="visitLinks${emp.id}" id="title" class="view">${emp.outlinktitle}</a></li>
						</c:if>
					</c:forEach>
				</c:if>
			</ul>
			<!--  PAGINATION START  -->
			<div class="pagination">
				<span class="previous-off"><a
					href="guestprelist/${businesstypeid}/${pageNumber}" class="next">&laquo;
						Previous</a></span> <span id="span1"><a
					href="guestlistBusinessLinks/${businesstypeid}/1">1</a></span> <span
					id="span2"><a
					href="guestlistBusinessLinks/${businesstypeid}/2">2</a></span> <span
					id="span3"><a
					href="guestlistBusinessLinks/${businesstypeid}/3">3</a> </span> <span
					id="span4"><a
					href="guestlistBusinessLinks/${businesstypeid}/4">4</a> </span> <span
					id="span5"><a
					href="guestlistBusinessLinks/${businesstypeid}/5">5</a> </span> <span
					id="span6"><a
					href="guestlistBusinessLinks/${businesstypeid}/6">6</a> </span> <span
					id="span7"><a
					href="guestlistBusinessLinks/${businesstypeid}/7">7</a> </span> <span
					id="spannext"><a
					href="guestnextlist/${businesstypeid}/${pageNumber}" class="next">Next
						&raquo;</a></span>
			</div>
			<!--  PAGINATION END  -->
		</div>

	</div>

	<!-- ####################################################################################################### -->
	<div id="copyright">
		<div class="wrapper">
			<p class="fl_right">
				Template by <a title="Welcome to BIS4">Joseph_Lin</a>
			</p>
			<br class="clear" />
		</div>
	</div>
</body>
</html>
