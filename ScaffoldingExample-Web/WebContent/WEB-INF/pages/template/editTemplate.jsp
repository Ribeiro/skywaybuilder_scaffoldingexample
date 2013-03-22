<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<html>
<head>
<title>Edit Template</title>
</head>
<body>
<fmt:setBundle basename="bundles.template-resources"/>
<p>
	<c:if test='${template.id != null}'>
		<a class="button" href="${pageContext.request.contextPath}/selectTemplate.html?id=${template.id}&"><fmt:message key="navigation.back"/></a>
	</c:if>
	<c:if test='${template.id == null}'>
		<a class="button" href="${pageContext.request.contextPath}/indexTemplate.html"><fmt:message key="navigation.back"/></a>
	</c:if>
</p>

<h2><fmt:message key="template.title"/></h2><br/>
<form:form action="${pageContext.request.contextPath}/saveTemplate.html" 
	method="POST" modelAttribute="template">
	<table class="table">
		<tr>
			<td class="tdLabel">
				<fmt:message key="template.id.title"/>:
			</td>
			<td>
						<form:input id="id" path="id"/>
						<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "id",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="template.id.help"/>", constraints : {places:0}}})); </script>
			</td>
		</tr>
		<tr>
			<td class="tdLabel">
				<fmt:message key="template.name.title"/>:
			</td>
			<td>
						<form:input id="name" path="name"/>
						<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "name",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="template.name.help"/>"}})); </script>
			</td>
		</tr>
		<tr>
			<td class="tdLabel">
				<fmt:message key="template.description.title"/>:
			</td>
			<td>
						<form:input id="description" path="description"/>
						<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "description",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="template.description.help"/>"}})); </script>
			</td>
		</tr>
	</table>
	<p>
		<input class="button" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/>
		<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
	</p>
</form:form>
</body>
</html>