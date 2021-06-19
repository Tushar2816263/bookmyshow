<%@page import="com.sun.org.apache.bcel.internal.generic.LSTORE"%>
<%@page import="icsd.movies"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="oracle.jdbc.pool.OracleDataSource"%>
<%@page import="java.sql.Connection"%>
<%@page import="icsd.DBHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

  <meta charset="utf-8"/>
  <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
  <meta name="description" content=""/>
  <meta name="author" content=""/>
  <title>admin panel</title>
  <!--favicon-->
  <link rel="icon" href="assets/images/favicon.ico" type="image/x-icon">
  <!-- simplebar CSS-->
  <link href="assets/plugins/simplebar/css/simplebar.css" rel="stylesheet"/>
  <!-- Bootstrap core CSS-->
  <link href="assets/css/bootstrap.min.css" rel="stylesheet"/>
  <!-- animate CSS-->
  <link href="assets/css/animate.css" rel="stylesheet" type="text/css"/>
  <!-- Icons CSS-->
  <link href="assets/css/icons.css" rel="stylesheet" type="text/css"/>
  <!-- Sidebar CSS-->
  <link href="assets/css/sidebar-menu.css" rel="stylesheet"/>
  <!-- Custom Style-->
  <link href="assets/css/app-style.css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>

<!-- Start wrapper-->
 <div id="wrapper">
 
  <!--Start sidebar-wrapper-->
   <div id="sidebar-wrapper" data-simplebar="" data-simplebar-auto-hide="true">
     <div class="brand-logo">
      <a href="index-2.html">
       <img src="assets/images/logo-icon.png" class="logo-icon" alt="logo icon">
       <h5 class="logo-text">welcome admin</h5>
     </a>
	 </div>
	 <ul class="sidebar-menu do-nicescrol">
      
      <li>
        <a href="index-2.html" class="waves-effect">
          <i class="icon-home"></i> <span>admin backend</span> <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="sidebar-submenu">
          <li><a href="index-2.html"><i class="fa fa-circle-o"></i> Upload Movies</a></li>
          <li><a href="index2.html"><i class="fa fa-circle-o"></i> create admin</a></li>
          <li><a href="index3.html"><i class="fa fa-circle-o"></i> offer code</a></li>
        </ul>
      </li>
      </ul>
      	 
   </div>
   <!--End sidebar-wrapper-->

<!--End topbar header-->


<%
DBHandler objdh=new DBHandler();
LinkedList<movies> lst1=objdh.getmovies();

%>











<div class="clearfix"></div>
	
  <div class="content-wrapper">
    <div class="container-fluid">
    
   
<div class="row">
        <div class="col-lg-12">
          <div class="card">
            <div class="card-header"><i class="fa fa-table"></i><h2>Movies information</h2></div>
            <div class="card-body">
              <div class="table-responsive">
              <table id="default-datatable" class="table table-bordered">
                <th>
                    <tr>
                        <th>movieid </th>
                        <th>moviename</th>
                        <th>stars</th>
                        <th>startdate</th>
                        <th>end date</th>
                        <th>Slot 9-12</th>
                        <th>Slot 12-15</th>
                        <th>Slot 15-18</th>
                        <th>gold price</th>
                        <th>silver price</th>
                        <th>language</th>
                    </tr>
                </th>
                <tbody>
                
                <% for(movies m:lst1)
                {
                
                %>
                    <tr>
                        <td><%=m.getStrmovieid() %></td>
                        <td><%=m.getStrmoviename() %></td>
                        <td><%=m.getRating() %></td>
                        <td><%=m.getStrdate() %></td>
                        <td><%=m.getEndate() %></td>
                        <td><%=m.getSlot1() %></td>
                        <td><%=m.getSlot2() %></td>
                        <td><%=m.getSlot3() %></td>
                        <td><%=m.getGoldprice() %></td>
                        <td><%=m.getSilverprice() %></td>
                        <td><%=m.getLanguage() %></td>
      
                    </tr>
      <% 
                }                  
    
	%>
	
	</div>		
		  </div><!--End Row-->




  <!-- Bootstrap core JavaScript-->
  <script src="assets/js/jquery.min.js"></script>
  <script src="assets/js/popper.min.js"></script>
  <script src="assets/js/bootstrap.min.js"></script>
	
  <!-- simplebar js -->
   <script src="assets/plugins/simplebar/js/simplebar.js"></script>
  <!-- waves effect js -->
  <script src="assets/js/waves.js"></script>
  <!-- sidebar-menu js -->
  <script src="assets/js/sidebar-menu.js"></script>
  <!-- Custom scripts -->
  <script src="assets/js/app-script.js"></script>
	




</body>
</html>