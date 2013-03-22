<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<html>
<head>
<title>List Templates</title>
</head>
<body>
<fmt:setBundle basename="bundles.template-resources"/>
	<p>
		<a class="button" href="${pageContext.request.contextPath}/newTemplate.html"><fmt:message key="navigation.new"/> <fmt:message key="template.title"/></a>
	</p>
	
	<table id="templateTable">
		<thead>
		<tr>
			<th><fmt:message key="template.id.title"/></th>
			<th><fmt:message key="template.name.title"/></th>
			<th><fmt:message key="template.description.title"/></th>
		</tr>
		</thead>
		<tbody>
	<c:forEach items="${templates}" var="current" varStatus="i">
		<c:choose>
			<c:when test="${(i.count) % 2 == 0}">
		    	<c:set var="rowclass" value="tableRow1"/>
			</c:when>
			<c:otherwise>
		    	<c:set var="rowclass" value="tableRow2"/>
			</c:otherwise>
		</c:choose>			
		<tr class="${rowclass}">
			<td>
				<a href="${pageContext.request.contextPath}/selectTemplate.html?id=${current.id}&">${current.id}</a>
			</td>
			<td>
						
								${current.name}
						
			</td>
			<td>
						
								${current.description}
						
			</td>
		</tr>
	</c:forEach>
		</tbody>
	</table>
</body>
</html>