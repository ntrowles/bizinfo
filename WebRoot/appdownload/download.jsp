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
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<!-- CSS -->
<link href="style/css/transdmin.css" rel="stylesheet" type="text/css"
	media="screen" />
	
<style>
img {
    float: left;
    margin: 0 20px 20px 0;
    width: 100px;
    height: 150px;
}
</style>

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
			<li><a href="adminPage"><span class="outer"><span
						class="inner admin">DASHBOARD</span></span></a></li>
			<!-- Use the "active" class for the active menu item  -->
			<li><a href="showoperation"><span class="outer"><span
						class="inner operation">HELP</span></span></a></li>
			<li><a href="showlist"><span class="outer"><span
						class="inner list">STATISTICS</span></span></a></li>
			<li><a href="downloadPage" class="active"><span
					class="outer"><span class="inner download">APP
							DOWNLOAD</span></span></a></li>
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
				<h2>APP DOWNLOAD and Configuration</h2>

				<div id="main">
					<form action="" class="jNice">
						<h3>How to download and install the APP</h3>
						<table cellpadding="0" cellspacing="0">
							<tr class="odd">
								<td class="action"><a class="view"
									href="appdownload/Step1.jpg">Step 1: configure your phone</a></td>
							</tr>
							<tr>
								<td class="actionText"><a class="view"
									href="appdownload/Step1.jpeg"><img
										src="appdownload/Step1.jpeg"></a>To install
									the app from our web site, you first have to tell your phone
									that it is ok to ‘install an Android app without the market’ or
									‘unknown sources’. This requires you to change a setting on
									your phone if you have not already done so. From your Settings
									app, select Applications. If the Unknown Sources checkmark is
									not green, press it to turn this option on.</td>

							</tr>
							<tr class="odd">
								<td class="action"><a class="view">Step 2: download the
										apps from the website</a></td>
							</tr>
							<tr>
								<td class="actionText"><a class="view"
									href="appdownload/Step2a.jpeg"><img
										src="appdownload/Step2aICON.jpeg"></a>Step
									2a: Please click this button to download the app onto your
									android device. <br> <a class="view"
									href="appdownload/Step2b.jpeg"><img
										src="appdownload/Step2bICON.jpeg"></a>Step
									2b: You should see a flashing arrow in the notification bar at
									the top of your notification screen. When the arrow stops
									flashing, your download is complete.</td>
							</tr>
							<tr class="odd">
								<td class="action"><a class="view"
									href="appdownload/Step3.png">Step 3: install the app on
										your phone</a></td>
							</tr>
							<tr>
								<td class="actionText"><a class="view"
									href="appdownload/Step3.png"><img
										src="appdownload/Step3ICON.png"></a>Step
									3a. When the download is finished, pull down the Notification
									bar on your android device and look for the 'Download Complete'
									notification. Select that entry. <br> <a class="view"
									href="appdownload/Step3b.jpeg"><img
										src="appdownload/Step3bICON.jpeg"></a>Step
									3b. Click on 'Open' to start using the app.</td>
							</tr>
							<tr class="odd">
								<td class="action"><a class="view"
									href="appdownload/Step4.jpeg">Step 4: Remember!</a></td>
							</tr>
							<tr>
								<td class="actionText"><a class="view"
									href="appdownload/Step4.jpeg"><img
										src="appdownload/Step4ICON.jpeg"></a>Don’t
									forget to turn off ‘unknown sources’ or uncheck '‘install an
									Android app without the market’ from your mobile phone
									‘settings’</td>
							</tr>
							<tr class="odd">
								<td class="action"><a href="appdownload/Step5.png"
									class="view">Step 5: Use the app on your phone</a></td>
							</tr>
							<tr>
								<td class="actionText"><a class="view"
									href="appdownload/Step5.png"><img
										src="appdownload/Step5ICON.png"></a>Once
									the app has been installed, you should find this icon on your
									phone screen. Click on it to use the app.</a></td>
							</tr>
							<tr class="odd">
								<td class="action"></td>
							</tr>
							<tr class="odd">
								<td class="action"><a class="button_downloadapp"
									href="downloadapp"></a></td>
							</tr>
						</table>
					</form>
				</div>
				<!-- // #main -->

				<div class="clear"></div>
			</div>
			<!-- // #container -->
		</div>
		<!-- // #containerHolder -->

		<p id="footer">
			Page Created @ 2014.10. <a href="http://www.curtin.edu.au">Copyright
				Reserved.</a>
		</p>
	</div>
	<!-- // #wrapper -->
</body>
</html>
