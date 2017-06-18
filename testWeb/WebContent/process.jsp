<%@ page trimDirectiveWhitespaces="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员注册处理</title>
</head>
<body>

<%

String username=request.getParameter("username");
String email=request.getParameter("email");
String password=request.getParameter("password");
String captchar=request.getParameter("captchar");


System.out.println("username:"+username+",email:"+email+",password:"+password+",captchar:"+captchar);


%>
</body>
</html>