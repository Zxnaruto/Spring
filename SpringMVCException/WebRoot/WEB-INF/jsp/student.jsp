<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'student.jsp' starting page</title>
    
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
   <h2>Student Information</h2>
<form:form method="POST" action="/SpringMVCException/addStuden">
   <table>
   <tr>
   <td><form:label path="name">Name</form:label></td>
   <td><form:input path="name" /></td>
   </tr>
   <tr>
   <td><form:label path="age">Age</form:label></td>
   <td><form:input path="age" /></td>
   </tr>
   <tr>
   <td><form:label path="id">id</form:label></td>
   <td><form:input path="id" /></td>
   </tr>
   <tr>
   <td colspan="2">
   <input type="submit" value="Submit"/>
   </td>
   </tr>
   </table>  
</form:form>

  </body>
</html>
