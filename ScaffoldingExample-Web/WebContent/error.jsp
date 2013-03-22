<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${exception}</title>
</head>
<body>
<pre>
An error occurred processing your request: 

<% Exception e = ((Exception)request.getAttribute("exception"));
	if (e != null)
		e.printStackTrace(new java.io.PrintWriter(out)); %>
</pre>
</body>
</html>