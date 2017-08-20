<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>abhishek</title>
</head>
<body>
<h1>Hello World</h1>
<% System.out.println("never let you go");%>
<!--  <%= new java.util.Date()%>-->

<form action="check" method="get">
   Enter the no. 1 : <input type = "text" name = "t1">
   <br>
   Enter the no. 2 : <input type = "text" name = "t2">
   <br>
   <input type = "submit" value = "Go"> 
</form>
 
</body>
</html>