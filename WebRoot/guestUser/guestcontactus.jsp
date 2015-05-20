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

<title>Contact Us</title>

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
<script type="text/javascript" src='js/contact.js'></script>
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
					Find the <font size="2" color="#808000">right business
						information</font> for you here.
				</p>
			</div>
			<div class="fl_right">

				<a href="guestcontactus">English</a>|<a href="guestcontactuscn">中文</a>

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

					<li><a href="guestdownload">BizInfo App Download</a></li>
					<li class="active"><a href="guestcontactus">Contact Us</a></li>
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
				<li class="current"><a href="guestaboutus">About Us</a></li>
			</ul>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<h2>Thank you! We welcome your suggestions and feedback.</h2>
			<form action="sendEmail" method="post"
				onsubmit="return validateForm();">
				<p>
					<input type="text" name="name" id="name" value="" size="22" /> <label
						for="name"><small>Name (required)</small></label>
				</p>
				<p>
					<input type="text" name="email" id="email" value="" size="22" /> <label
						for="email"><small>EMail (optional)</small></label>
				</p>
				<p>
					<input type="text" name="rurl" id="rurl" value="http://" size="22" />
					<label for="rurl"><small>Recommend URL (optional)</small></label>
				</p>
				<p>
					<select name="subject" id="subject">
						<option value="business news">business news</option>
						<option value="business for sale">business for sale</option>
						<option value="business experience">business experience</option>
						<option value="migration information">migration
							information</option>
					</select> <label for="subject"><small>Subject (required)</small></label>
				</p>
				<p>
					<textarea name="feedback" id="feedback" cols="100%" rows="10"></textarea>
					<label for="comment"><small>Comment (required)</small></label>
				</p>
				<p>
					<input name="submit" type="submit" id="submit" value="Submit Form" />
					&nbsp; <input name="reset" type="reset" id="reset" tabindex="5"
						value="Reset Form" onclick="resetform();" />
				</p>
			</form>

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
