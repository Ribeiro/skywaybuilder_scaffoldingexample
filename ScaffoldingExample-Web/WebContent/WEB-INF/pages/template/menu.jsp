<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.template-resources"/>
<div id="navItem"><img src="${pageContext.request.contextPath}/images/navTop.jpg" /><div id="navItemContent">
		<h3><fmt:message key="template.title"/></h3>
		<ul>
			<li><a class="itemLink" href="${pageContext.request.contextPath}/indexTemplate.html"><fmt:message key="navigation.list"/></a></li>
			<li><a class="itemLink" href="${pageContext.request.contextPath}/newTemplate.html"><fmt:message key="navigation.add"/> <fmt:message key="navigation.new"/></a></li>
		</ul>
	</div><img src="${pageContext.request.contextPath}/images/navBottom.jpg" /></div>