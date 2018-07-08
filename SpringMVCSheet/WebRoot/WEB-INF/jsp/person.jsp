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
    
    <title>Person Logging</title>
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
   <h2>Person Information</h2>
   <!-- action为想要跳转的jsp的路径 -->
   <form:form method="POST" action="/SpringMVCSheet/">
   <table>
   <tr>
   <td><form:label path="Id">Id</form:label></td>
   <td><form:input path="Id"/></td>
   </tr>
   <tr>
   <td><form:label path="Name">Name</form:label></td>
   <td><form:input path="Name"/></td>
   </tr>
   <tr>
   <td><form:label path="Age">Age</form:label></td>
   <td><form:input path="Age"/></td>
   </tr>
   <tr>
   <td colspan="2">
   <input type="submit" value="Submit" />
   </td>
   
   </tr>
   </table>
   
   </form:form>
  </body>
</html>
