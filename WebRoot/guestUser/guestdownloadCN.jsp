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

<title>应用下载</title>

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
					<a href="guestbusinessinformation">商业信息</a>
				</h1>
				<p>
					踏出 <font size="2" color="#808000">商业时代</font> 第一步.
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
					<li><a href="welcomePagecn">主页</a></li>
					<li><a href="guestbusinessinformationcn">商业信息</a>
						<ul>
							<li><a href="guestlistBusinessLinks/1/1">商业资讯</a></li>
							<li><a href="guestlistBusinessLinks/3/1">商业买卖</a></li>
							<li><a href="guestlistBusinessLinks/2/1">生意经</a></li>
							<li><a href="guestlistBusinessLinks/4/1">移民资讯</a></li>
						</ul></li>
					
					<li class="active"><a href="guestdownloadcn">应用下载</a></li>
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
				<li class="current"><a href="guestdownload">应用下载</a></li>
			</ul>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<h1>如何下载并安装‘商业信息’应用</h1>

			<p>1. 勾选手机的'设置 - 未知资源'选项.</p>
			<p>2. 点击网页下方的“下载'商业信息'应用”按钮下载应用.</p>
			<p>3. 安装相应的下载项目.</p>
			<p>具体设置请参考<a href="guestconfigurecn">应用配置.</a></p>

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
