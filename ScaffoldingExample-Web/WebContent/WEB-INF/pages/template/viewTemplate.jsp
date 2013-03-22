<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<html>
<head>
<title>View Template</title>
</head>
<body>
<fmt:setBundle basename="bundles.template-resources"/>
	<p>
		<a class="button" href="${pageContext.request.contextPath}/indexTemplate.html"><fmt:message key="navigation.back"/></a>
	</p>
	<h2><fmt:message key="template.title"/></h2><br/>
		
	<table>
		<tr>
			<td class="tdLabel">
				<fmt:message key="template.id.title"/>:
			</td>
			<td>
						${template.id}
			</td>
		</tr>
		<tr>
			<td class="tdLabel">
				<fmt:message key="template.name.title"/>:
			</td>
			<td>
						${template.name}
			</td>
		</tr>
		<tr>
			<td class="tdLabel">
				<fmt:message key="template.description.title"/>:
			</td>
			<td>
						${template.description}
			</td>
		</tr>
	</table>
	<p>
		<a class="button" href="${pageContext.request.contextPath}/editTemplate.html?id=${template.id}&"><fmt:message key="navigation.edit"/></a>
		<a class="button" href="${pageContext.request.contextPath}/deleteTemplate.html?id=${template.id}&"><fmt:message key="navigation.delete"/></a>
 	</p>
	
</body>
</html>