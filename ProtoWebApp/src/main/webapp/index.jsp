<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
Http Servlet Request Information
<table border="1">
<tr><td>Server Name</td><td><%=request.getServerName()%></td></tr>
<tr><td>Server Port</td><td><%=request.getServerPort()%></td></tr>
<tr><td>Remote User</td><td><%=request.getRemoteUser()%></td></tr>
<tr><td>Remote Host</td><td><%=request.getRemoteHost()%></td></tr>
<tr><td>Remote Addr</td><td><%=request.getRemoteAddr()%></td></tr>
<tr><td>Request URL</td><td><%=request.getRequestURL()%></td></tr>
<tr><td>Request URI</td><td><%=request.getRequestURI()%></td></tr>
<tr><td>isSecure</td><td><%=request.isSecure()%></td></tr>
</table>
</body>
</html>
