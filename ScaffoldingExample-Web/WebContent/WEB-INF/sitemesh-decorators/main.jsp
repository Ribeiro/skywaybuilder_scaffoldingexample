<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<%@taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
    <head>
        <title><decorator:title default="My Project" /></title>
		<style type="text/css" media="screen">
			@import url("${pageContext.request.contextPath}/resources/dojo/resources/dojo.css");
			@import url("${pageContext.request.contextPath}/resources/dijit/themes/tundra/tundra.css");
		</style>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/dojo/dojo.js" djconfig="parseOnLoad: true" ></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/spring/Spring.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/spring/Spring-Dojo.js"></script>
		<script type="text/javascript">dojo.require("dojo.parser");</script>
		
		<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" /> 
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/favicon.ico">
		<decorator:head />
    </head>
	<body class="tundra spring">
		<div id="mainWrapper">
			<div id="loginSpacer"></div>
			<div id="header">
		        <jsp:include page="/WEB-INF/sitemesh-common/header.jsp" />
		    </div>
			<div id="contentWrapper">
				<div id="nav">
					<jsp:include page="/WEB-INF/sitemesh-common/sidebar.jsp" />
				</div>
				<div id="content">      
					<decorator:body />      
				</div><!-- end content -->
			</div><!-- end contentWrapper -->   
			<div class="clearfooter"><!-- this area stays empty --></div>
		</div><!-- end mainWrapper -->
		<div id="footer">
			<jsp:include page="/WEB-INF/sitemesh-common/footer.jsp" />
		</div><!-- end footer -->
		<jsp:include page="/WEB-INF/sitemesh-common/login.jsp" />
	</body>
</html>



