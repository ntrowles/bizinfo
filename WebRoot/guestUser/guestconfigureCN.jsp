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

<title>应用设置</title>

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
					<li><a href="welcomePagecn">主页</a></li>
					<li><a href="guestbusinessinformation">商业信息</a>
						<ul>
							<li><a href="guestlistBusinessLinks/1/1">商业资讯</a></li>
							<li><a href="guestlistBusinessLinks/3/1">商业买卖</a></li>
							<li><a href="guestlistBusinessLinks/2/1">生意经</a></li>
							<li><a href="guestlistBusinessLinks/4/1">移民资讯</a></li>
						</ul></li>
					<li class="active"><a href="guestconfigurecn">应用设置</a></li>
					<li><a href="guestdownloadcn">应用下载</a></li>
					<li><a href="guestcontactus">联系我们</a></li>
					<li class="last"><a href="guestaboutus">关于我们</a></li>
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
				<li class="current"><a href="guestconfigure">应用配置</a></li>
			</ul>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<h1>如何在下载应用之前配置您的移动设备</h1>
			<h2>第一步. 打开你设备上的‘设置(Setting)’选项</h2>
			<p>打开'设置'(Setting)-'应用'(Application)，选中“未知资源”(Unknown Sources)选项.</p>
			<br class="clear" />
			<h2>第二步. 打开您移动设备上的浏览器(Browser)</h2>
			<p>输入网址:
				'http://http://bis4.bizinfo.susanleong.net/BizInfoAdmin/guestUser/guestdownload.jsp',
				然后点击网页下方的“下载'商业信息'应用”按钮，这样应用就下载到你的移动设备上.</p>
			<br class="clear" />
			<h2>第三步. 打开您移动设备上的'下载页'(Download)</h2>
			<p>当下载已经完成的时候，下拉'通知栏'(Notification bar)，
				并找到已经下载的应用(BizInfo.apk).根据提示，一步步安装即可.</p>
			<p>注意: 如果你在安装之前清空了通知栏，可以打开浏览器上的菜单按钮，然后找到下载项.</p>
			<br class="clear" />
			<h2>第四步. 打开'商业信息'应用('BizInfo')</h2>
			<p>当安装完成的时候，点击应用的图标，开启您的商业信息之旅!</p>
			<br class="clear" />
			<h2>第五步. 考虑安全性</h2>
			<p>为了手机的安全性考虑，请在您安装“商业信息”应用之后，关闭'未知资源'(Unknown Sources)选项。</p>
			<br class="clear" />
			<fieldset>
				<a class="button_ok" href="downloadapp"><span>下载'商业信息'应用</span></a>
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
