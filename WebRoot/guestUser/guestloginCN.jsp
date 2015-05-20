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

<title>主页</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="imagetoolbar" content="no" />
<link rel="stylesheet" href="guestUser/styles/layout.css"
	type="text/css" />

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>

<body id="top">
	<div id="header">
		<div class="wrapper">
			<div class="fl_left">
				<h1>
					<a href="guestbusinessinformationcn">商业信息</a>
				</h1>
				<p>
					踏出 <font size="2" color="#808000">商业时代</font> 第一步.
				</p>
			</div>
			<div class="fl_right">

				<a href="welcomePage">English</a>|<a href="welcomePagecn">中文</a>

			</div>
			<br class="clear" />
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="topbar">
		<div class="wrapper">
			<div id="topnav">
				<ul>
					<li class="active"><a href="welcomePagecn">主页</a></li>
					<li><a href="guestbusinessinformationcn">商业信息</a>
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
	<div id="featured_slide">
		<div class="wrapper">
			<div class="featured_content">
				<ul id="accordion">
					<li class="current">
						<div class="featured_box">
							<h2>1. 如何规划您的生意.</h2>
							<p>商业信息是您开启买卖生意的第一步。它为您提供了最新的准确信息，为您成功的生意奠定坚实的基础， 为您开始全新的商业视野
								...</p>
							<p class="readmore">
								<a href="http://www.bbgbb.com.au/how-to-buy-a-small-business/">详细
									&raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/1.png" alt="" />
							<p>商业视野</p>
						</div>
					</li>
					<li>
						<div class="featured_box">
							<h2>2. 澳大利亚商业信息</h2>
							<p>
								<br />1. 商业资讯; <br /> 2. 生意买卖;<br /> 3. 生意经; <br /> 4. 移民资讯.
							</p>
							<p class="readmore">
								<a href="guestbusinessinformationcn">详细 &raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/2.png" alt="" />
							<p>商业信息</p>
						</div>
					</li>
					<li>
						<div class="featured_box">
							<h2>3.联系我们</h2>
							<p>如果您有什么好的建议，或者推荐一个相关的链接，请联系我们. 您的回馈，是我们宝贵的财富！</p>
							<p class="readmore">
								<a href="guestcontactuscn">详细 &raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/3.png" alt="" />
							<p>联系我们</p>
						</div>
					</li>
					<li>
						<div class="featured_box">
							<h2>4. 下载应用</h2>
							<p>我们的Android 应用产品提供最新最快的澳大利亚商业信息， 让您的开业旅程更加顺畅如意。</p>
							<p class="readmore">
								<a href="guestdownloadcn">详细 &raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/4.png" alt="" />
							<p>下载应用</p>
						</div>
					</li>
					<li>
						<div class="featured_box">
							<h2>5. 关于我们</h2>
							<p>我们的团队为您提供最好最新的商业信息应用。</p>
							<p class="readmore">
								<a href="guestaboutuscn">详细 &raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/5.png" alt="" />
							<p>关于我们</p>
						</div>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="homecontent">
		<div class="wrapper">
			<ul>
				<li>
					<h2 class="title">
						<img src="guestUser/img/6.jpg" alt="" />商业资讯
					</h2>
					<p>商业资讯为您提供全球最新的新闻媒体，报刊，视频的商业头条.</p>
					<p class="readmore">
						<a href="guestlistBusinessLinks/1/1">详细 &raquo;</a>
					</p>
				</li>
				<li>
					<h2 class="title">
						<img src="guestUser/img/7.jpg" alt="" />生意买卖
					</h2>
					<p>生意买卖为您提供澳洲最新最火的投资生意，店铺买卖等等.</p>
					<p class="readmore">
						<a href="guestlistBusinessLinks/3/1">详细 &raquo;</a>
					</p>
				</li>
				<li class="last">
					<h2 class="title">
						<img src="guestUser/img/8.jpg" alt="" />生意经
					</h2>
					<p>生意经为您提供最真实的生意经历，最权威的评论分析.</p>
					<p class="readmore">
						<a href="guestlistBusinessLinks/2/1">详细 &raquo;</a>
					</p>
				</li>
			</ul>
			<br class="clear" />
		</div>
	</div>
	<!-- ####################################################################################################### -->
	<div id="container">
		<div class="wrapper">
			<div id="content">
				<h2>关于‘商业信息’的 Android移动设备应用</h2>
				<p>
					此Android App 由 <a
						href="http://101.177.66.126/BIGCOM/product/healthcare/contact.jsp">BIS4</a>开发.
				</p>
				<p>
					此应用的技术是基于 <a href="http://developer.android.com/develop/index.html">Android
						SDK</a>.
				</p>

				<p>此应用主要提供以下服务（澳大利亚）:</p>
				<ul>
					<li><a href="guestlistBusinessLinks/1/1">商业资讯</a></li>
					<li><a href="guestlistBusinessLinks/3/1">生意买卖</a></li>
					<li><a href="guestlistBusinessLinks/2/1">生意经</a></li>
					<li><a href="guestlistBusinessLinks/4/1">移民资讯</a></li>
				</ul>

				<p>
					希望此应用能带给您全新的体验。关于配置和下载，请参考 <a
						href="guestdownloadcn">下载应用.</a>
				</p>
			</div>
			<div id="column">
				<div class="holder">
					<h2>移民资讯</h2>
					<ul id="latestnews">
						<li><img class="imgl" src="guestUser/img/9.jpg" alt="" />
							<p>
								<strong><a
									href="http://australia.gov.au/topics/immigration">移民政策.</a></strong>
							</p>
							<p>移民政策为您提供最新最详细的移民政策更新变化，为您的需求保驾护航.</p></li>
						<li class="last"><img class="imgl" src="guestUser/img/10.jpg"
							alt="" />
							<p>
								<strong><a href="guestlistBusinessLinks/4/1">移民咨询.</a></strong>
							</p>
							<p>移民咨询为您提供最新最全的移民经验分享，为您开辟一条捷径.</p></li>
					</ul>
				</div>
			</div>
			<br class="clear" />
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
