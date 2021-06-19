<%@page import="icsd.movieid"%>
<%@page import="icsd.DBHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%


int movie=Integer.parseInt(request.getParameter("id"));

%>

<% 
DBHandler objdh=new DBHandler();
movieid objm=objdh.getmoviebyid(movie);


%>

<img src="assets/images/<%=objm.getImage()%>">



</body>
</html>