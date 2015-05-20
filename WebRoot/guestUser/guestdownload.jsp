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

<title>Apps Download</title>

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

				<a href="guestdownload">English</a>|<a href="guestdownloadcn">中文</a>

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
					<li><a href="guestbusinessinformation">Business
							Information</a>
						<ul>
							<li><a href="guestlistBusinessLinks/1/1">Business News</a></li>
							<li><a href="guestlistBusinessLinks/3/1">Business Sale</a></li>
							<li><a href="guestlistBusinessLinks/2/1">Business
									Experience</a></li>
							<li><a href="guestlistBusinessLinks/4/1">Migration
									Information</a></li>
						</ul></li>
					<li class="active"><a href="guestdownload">BizInfo App Download</a></li>
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
				<li class="current"><a href="guestdownload">Apps Download</a></li>
			</ul>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<h3><i>Currently, we only have an android version, please do not
				try this on an iphone or Windows phone.</i></h3>

			<h1>To install the Bizinfo App on your device, you must give your
				phone permission to 'install an Android app not from the Google Play
				Store'. To do this:</h1>
			<p>1) Go to 'Settings' and check the option that allows
				installation of apps from unknown sources</p>
			<p>2) Click the link/button below to begin download of the
				bizinfo app on your device (you can use an android tablet too!).</p>
			<p>3) Once the download is completed, pull down the Notification
				bar on your device and install the app. Then follow the instructions
				to open 'Bizinfo' app.</p>
			<p>4) <strong>IMPORTANT:</strong> after you install the Bizinfo app, please
				uncheck the 'Allow Unknown Sources' option to keep your device
				secure.</p>

			
				<a class="button_downloadapp" href="downloadapp"></a>
			


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
