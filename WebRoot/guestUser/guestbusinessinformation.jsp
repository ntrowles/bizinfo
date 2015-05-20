<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>List Categories</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="guestUser/styles/layout.css"
	type="text/css" />


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
			<div class="fl_right">

				<a href="guestbusinessinformation">English</a>|<a href="guestbusinessinformationcn">中文</a>

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
				<li class="current"><a href="guestbusinessinformation">Business
						Information</a></li>
			</ul>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<h1>
				<a href="guestlistBusinessLinks/1/1">Business News</a>
			</h1>
			<p>
			    Business news provides the fresh business information in the Australia business market,<br>
			    which give you the resources of business idea.
			</p>
			<h1>
				<a href="guestlistBusinessLinks/3/1">Business Sale</a>
			</h1>
			<p>
			    Business sale provides the hot business buying and selling in the Australia market,<br>
			    which give you the good choices in your future investment.
			</p>
			<h1>
				<a href="guestlistBusinessLinks/2/1">Business Experience</a>
			</h1>
			<p>
			    Business experience provides the best suggestions the Australia business market,<br>
			    which make sure you can engage into the business faster.
			</p>
			<h1>
				<a href="guestlistBusinessLinks/4/1">Migration Information</a>
			</h1>
			<p>
			    Migration information provides the content and analysis of government policies in Australia, <br>
			    which give you some useful tips to move into Australia.
			</p>

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
