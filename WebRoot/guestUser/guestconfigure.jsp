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

<title>Configuration</title>

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
				
					<a href="guestconfigure">English</a>|<a href="guestconfigurecn">中文</a>
				
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
					<li class="active"><a href="guestconfigure">Configure
							Information</a></li>
					<li><a href="guestdownload">Apps Download</a></li>
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
				<li class="current"><a href="guestconfigure">Configure
						Information</a></li>
			</ul>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<h1>Currently, we only have an android version, please do not
				try this on an iphone or Windows phone.</h1>

			<p>
				To install the Bizinfo App on your device, you must give your phone
				permission to 'install an Android app not from the Google Play
				Store'. To do this:
			</p>
			<p>1) Go to 'Settings' and check the option that allows
				installation of apps from unknown sources</p>
			<p>2) Click the link/button below to begin download of the
				bizinfo app on your device (you can use an android tablet too!).</p>
			<p>3) Once the download is completed, pull down the Notification
				bar on your device and install the app. Then follow the instructions
				to open 'Bizinfo' app.</p>
			
			<h1>Configure your devices before download apps</h1>
			<h2>Step 1. Open 'Setting' in your devices</h2>
			<p>From your Settings app, select Applications. If the Unknown
				Sources checkmark is not green, press it to turn this option on.</p>
			<h2>Step 2. Open 'Browser' in your devices</h2>
			<p><a href="">Click here to download the app:</a>
				,
				and click the download button to download android app on your
				android devices.You should see a flashing green arrow in the
				notification bar at the top of your device screen. When the arrow
				stops flashing, your download is complete.</p>
			<h2>Step 3. Open 'Download' in your devices</h2>
			<p>When the download is finished, pull down the Notification bar
				on your android device and look for our Download Complete entry.
				Select that entry and you will see one or more prompts from the
				app’s installer. Follow those to complete the installation.</p>
			<p>PS: If you’ve cleared your notifications before you are ready
				to install, run the Browser, press the Menu key, and from the More
				list, press Downloads. You’ll find the downloaded .apk file listed
				there.</p>

			<h2>Step 4. Open 'BizInfo' app in your devices</h2>
			<p>When the install is finished, find the app on your
				applications. Click to open it and enjoy the information trip!</p>

			<h2>Step 5. keep security</h2>
			<p>After you install our app, if the Unknown Sources checkmark is
				green, press it to turn this option off.It does represent a slight
				security risk to leave this setting on all the time.</p>

			<fieldset>
				<a class="button_ok" href="downloadapp"><span>Download
						Android App</span></a>
			</fieldset>


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
