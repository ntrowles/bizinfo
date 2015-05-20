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

<title>商业信息</title>

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
					<a href="guestbusinessinformation">商业信息</a>
				</h1>
				<p>
					踏出 <font size="2" color="#808000">商业时代</font> 第一步.
				</p>
			</div>
			<div class="fl_right">

				<a href="guestbusinessinformation">English</a>|<a
					href="guestbusinessinformationcn">中文</a>

			</div>
			<br class="clear" />
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="topbar">
		<div class="wrapper">
			<div id="topnav">
				<ul>
					<li><a href="welcomePagecn">主页</a></li>
					<li class="active"><a href="guestbusinessinformationcn">商业信息</a>
						<ul>
							<li><a href="guestlistBusinessLinks/1/1">商业资讯</a></li>
							<li><a href="guestlistBusinessLinks/3/1">商业买卖</a></li>
							<li><a href="guestlistBusinessLinks/2/1">生意经</a></li>
							<li><a href="guestlistBusinessLinks/4/1">移民资讯</a></li>
						</ul></li>

					<li><a href="guestdownloadcn">应用下载</a></li>
					<li><a href="guestcontactuscn">联系我们</a></li>
					<li class="last"><a href="guestaboutuscn">关于我们</a></li>
				</ul>
			</div>

			<br class="clear" />
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="breadcrumb">
		<div class="wrapper">
			<ul>
				<li class="first">商业信息</li>
				<li>&#187;</li>
				<li class="current"><a href="guestbusinessinformationcn">商业信息汇总</a></li>
			</ul>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<h1>
				<a href="guestlistBusinessLinks/1/1">商业新闻</a>
			</h1>
			<h1>
				<a href="guestlistBusinessLinks/3/1">生意买卖</a>
			</h1>
			<h1>
				<a href="guestlistBusinessLinks/2/1">生意经</a>
			</h1>
			<h1>
				<a href="guestlistBusinessLinks/4/1">移民资讯</a>
			</h1>

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
