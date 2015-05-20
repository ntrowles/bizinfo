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

<title>Home</title>
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

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
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
					Find the  <font size="2" color="#808000">right business information</font> 
					for you here.
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
					<li class="active"><a href="welcomePage">Home</a></li>
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
					<li><a href="guestcontactus">Contact Us</a></li>
					<li class="last"><a href="guestaboutus">About Us</a></li>
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
							<h2>1. How to Plan A Business.</h2>
							<p>Buying or selling an existing small business can be easier
								than setting up a new business from scratch. But the process can
								be daunting, especially if you’ve never been in business before.
								Thus, business information gives you the guide to good start.
								The main reason ...</p>
							<p class="readmore">
								<a href="http://www.bbgbb.com.au/how-to-buy-a-small-business/">Continue
									Reading &raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/1.png" alt="" />
							<p>Business View</p>
						</div>
					</li>
					<li>
						<div class="featured_box">
							<h2>2. Business Information in Australia</h2>
							<p>
								The primary forms of business information include: <br />1.
								Business News; <br /> 2. Business Sales;<br /> 3. Business
								Experience; <br /> 4. Migration Information.
							</p>
							<p class="readmore">
								<a href="guestbusinessinformation">Continue Reading &raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/2.png" alt="" />
							<p>Business Information</p>
						</div>
					</li>
					<li>
						<div class="featured_box">
							<h2>3.Contact Us</h2>
							<p>If you have any feedback or recommend us useful business
								links, please contact us. Your voices, our appreciates.</p>
							<p class="readmore">
								<a href="guestcontactus">Continue Reading &raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/3.png" alt="" />
							<p>Configure Information</p>
						</div>
					</li>
					<li>
						<div class="featured_box">
							<h2>4. Android Apps Download</h2>
							<p>Our Android apps can be used for reading all the
								information that related to the business in Australia. The more
								detail can be seen in 'Business Information'. This section
								provide a link that can be used to download an app on your
								android devices. To see the configure information to install
								this app.</p>
							<p class="readmore">
								<a href="guestdownload">Continue Reading &raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/4.png" alt="" />
							<p>Android Apps Download</p>
						</div>
					</li>
					<li>
						<div class="featured_box">
							<h2>5. About Us</h2>
							<p>We focus on developing online information gathering
								system, and we provide android apps for mobile devices. --
								BIGCOM4</p>
							<p class="readmore">
								<a href="guestaboutus">Continue Reading &raquo;</a>
							</p>
						</div>
						<div class="featured_tab">
							<img src="guestUser/img/5.png" alt="" />
							<p>About Us</p>
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
						<img src="guestUser/img/6.jpg" alt="" />Business News
					</h2>
					<p>The business news refer to the latest news from print media
						(newspapers, newsmagazines), broadcast news (radio and
						television), and more recently the Internet (online newspapers,
						news blogs, etc.).</p>
					<p class="readmore">
						<a href="guestlistBusinessLinks/1/1">Continue Reading &raquo;</a>
					</p>
				</li>
				<li>
					<h2 class="title">
						<img src="guestUser/img/7.jpg" alt="" />Business Sale
					</h2>
					<p>Buying or selling a business is a process, so if you are
						committed to selling your business, or are genuine about buying a
						business, then you've come to the "Business For Sale" Industry
						Authority. Melbourne, Brisbane, Sydney, Perth, Canberra,
						country-wide etc.</p>
					<p class="readmore">
						<a href="guestlistBusinessLinks/3/1">Continue Reading &raquo;</a>
					</p>
				</li>
				<li class="last">
					<h2 class="title">
						<img src="guestUser/img/8.jpg" alt="" />Business Experience
					</h2>
					<p>Want to know how to sell your business or shop privately,
						sell a franchise or business opportunity, without employing the
						services of a Business Broker? Then business experience offers the
						committed seller the help and support to sell successfully.</p>
					<p class="readmore">
						<a href="guestlistBusinessLinks/2/1">Continue Reading &raquo;</a>
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
				<h2>'Bizinfo' App</h2>
				<p>
					This is an Android App templated by  <a
						href="http://bizinfo.susanleong.net/">Joseph_Lin</a>.
				</p>
				<p>
					This app is distributed using an <a
						href="http://developer.android.com/develop/index.html">Android
						SDK</a>, which allows you to get the information from the provided
					business websites.
				</p>
				<p>
					For more information visit <a href="http://bizinfo.susanleong.net/">Business
						Information System for You (BIS4) Gallery</a>.
				</p>
				<p>This app provides four main topics that related to the
					business in Australia:</p>
				<ul>
					<li><a href="guestlistBusinessLinks/1/1">Business News</a></li>
					<li><a href="guestlistBusinessLinks/3/1">Business Sale</a></li>
					<li><a href="guestlistBusinessLinks/2/1">Business
							Experience</a></li>
					<li><a href="guestlistBusinessLinks/4/1">Migration
							Information</a></li>
				</ul>

				<p>
					Anyone who wants to obtain the business information can download
					this app on his/her android devices. It is easy to install and use.
					Please check the details about download and install in the <a
						href="guestconfigure">configure information</a> and <a
						href="guestdownload">Apps Download.</a>
				</p>
			</div>
			<div id="column">
				<div class="holder">
					<h2>Migration Information</h2>
					<ul id="latestnews">
						<li><img class="imgl" src="guestUser/img/9.jpg" alt="" />
							<p>
								<strong><a
									href="http://australia.gov.au/topics/immigration">Migration
										Policy.</a></strong>
							</p>
							<p>Whatever your reason for coming to Australia you will need
								a valid Australian visa. This page provides general immigration
								information.</p></li>
						<li class="last"><img class="imgl" src="guestUser/img/10.jpg"
							alt="" />
							<p>
								<strong><a href="guestlistBusinessLinks/4/1">Migration
										Experience.</a></strong>
							</p>
							<p>The Government of Australia recognises and values the
								positive economic and social contribution that migrants have
								made and continue to make to the State.</p></li>
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
