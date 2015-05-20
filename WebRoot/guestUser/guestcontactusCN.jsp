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

<title>联系我们</title>

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
					<a href="guestbusinessinformation">商业信息</a>
				</h1>
				<p>
					踏出 <font size="2" color="#808000">商业时代</font> 第一步.
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
					<li><a href="welcomePagecn">主页</a></li>
					<li><a href="guestbusinessinformationcn">商业信息</a>
						<ul>
							<li><a href="guestlistBusinessLinks/1/1">商业资讯</a></li>
							<li><a href="guestlistBusinessLinks/3/1">商业买卖</a></li>
							<li><a href="guestlistBusinessLinks/2/1">生意经</a></li>
							<li><a href="guestlistBusinessLinks/4/1">移民资讯</a></li>
						</ul></li>

					<li><a href="guestdownloadcn">应用下载</a></li>
					<li class="active"><a href="guestcontactuscn">联系我们</a></li>
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
				<li class="current"><a href="guestaboutus">联系我们</a></li>
			</ul>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<h2>您的回馈，是我们宝贵的财富！</h2>
			<form action="sendEmailcn" method="post"
				onsubmit="return validateForm();">
				<p>
					<input type="text" name="name" id="name" value="" size="22" /> <label
						for="name"><small>昵称 (必填)</small></label>
				</p>
				<p>
					<input type="text" name="email" id="email" value="" size="22" /> <label
						for="email"><small>邮箱 (可选)</small></label>
				</p>
				<p>
					<input type="text" name="rurl" id="rurl" value="http://" size="22" />
					<label for="rurl"><small>推荐链接 (可选)</small></label>
				</p>
				<p>
					<select name="subject" id="subject">
						<option value="商业新闻">商业新闻</option>
						<option value="生意买卖">生意买卖</option>
						<option value="生意经">生意经</option>
						<option value="移民资讯">移民资讯</option>
					</select> <label for="subject"><small>主题 (必选)</small></label>
				</p>
				<p>
					<textarea name="feedback" id="feedback" cols="100%" rows="10"></textarea>
					<label for="comment"><small>评论 (必填)</small></label>
				</p>
				<p>
					<input name="submit" type="submit" id="submit" value="提交" />
					&nbsp; <input name="reset" type="reset" id="reset" tabindex="5"
						value="重设" onclick="resetform();" />
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
