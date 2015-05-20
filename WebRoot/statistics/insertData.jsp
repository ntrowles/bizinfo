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

<title>insertData</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->



</head>

<body>
	<%
		int linkid;
		String macaddress;
		linkid = Integer.parseInt(request.getParameter("linkid"));
		macaddress = request.getParameter("macaddress");
		out.println(macaddress);
	%>


<h1> Welcome to BizInfo!</h1>
<h2>欢迎来到澳大利亚商业信息中心！</h2>
	<h3>
		Please wait for direct to the target URL ... ...<br /> 
		请稍等，正在为您转向目标网页 。。。
	</h3>

	<form method="post" action="addstatistics" name="frm">
		<input name="tvisitstatistics.linkid" type="hidden" value=<%=linkid %> />
		<input name="tvisitor.macaddress" type="hidden" value=<%=macaddress %> />

	</form>
	<script>
		document.frm.submit();
	</script>

</body>
</html>
