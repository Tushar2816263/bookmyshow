<%@page import="icsd.movies"%>
<%@page import="java.util.LinkedList"%>
<%@page import="icsd.DBHandler"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="mycss.css" >
<link rel="stylesheet" href="css/bootstrap.min.css" >
<script src="js/bootstrap.min.js" ></script>
<script src="jquery.js" ></script>

<style>

 header img
{
width: 900px;
height: 400px;


}


</style>






 <meta name="viewport" content="width=device-width, initial-scale=1">
  
</head>
<body>
<div class="row">

<header class="col-md-12">

<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="assets/images/u1.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="assets/images/u2.jpg" width="910px"  alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="assets/images/sufna.jpg" alt="Third slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>






<link rel="stylesheet" href="css/bootstrap.min.css" >
<script src="js/bootstrap.min.js" ></script>
<script src="jquery.js" ></script>







</header>
</div>
<div class=" main-content col-md-12">
<nav class="navbar navbar-expand-lg navbar-light bg-light">

  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
    <li class="nav-item active ">
        <a class="nav-link " href="#">Home </a>
      </li>
      
      <li class="nav-item active">
        <a class="nav-link" href="#">Movies </a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="adminlogin.html">Admin</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link " href="#">User</a>
      </li>
      
      <li class="nav-item active">
        <a class="nav-link " href="#">Login</a>
      </li>
      
      <li class="nav-item active">
        <a class="nav-link " href="#">Signup</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
</div>




<%

DBHandler obj=new DBHandler();
LinkedList<movies> lst=obj.getmovies();

%>

<table class="table">
<tr>
<th>MOVIE </th>
<th>MOVIE NAME</th>
<th>LANGUAGE</th>
<th>RATING</th>



</tr>

<% 
for(movies m1:lst)
{
	



%>




			<tr>
		
		<td><img src="assets/images/<%=m1.getImg() %>" width="400px"; height="200px;" alt="" /></td>
												<td><h1><%=m1.getStrmoviename() %> </h1></td>
												<td><h2><%=m1.getLanguage() %></h2></td>
												<td><span id="rateMe2"  class="fa fa-star checked"></span><span id="rateMe2"  class="fa fa-star checked"></span><span id="rateMe2"  class="fa fa-star checked"></span><span id="rateMe2"  class="fa fa-star checked"></span><span id="rateMe2"  class="fa fa-star checked"></span><script src="star.js"></script></td>
<td><a href="bookmovie.jsp?id=<%=m1.getStrmovieid() %>" class="btn btn-primary">book ticket</a></td>
			
											</tr>
											
										
			



<%
}

%>





</table>






<div class="col-md-12">
<footer class="mainfooter" role="contentinfo"> 
  <div class="footer-middle">
  <div class="container">
    <div class="row">
      <div class="col-md-3 col-sm-6">
        <!--Column1-->
        <div class="footer-pad">
          <h4>movies information</h4>
          <ul class="list-unstyled">
            <li><a href="#"></a></li>
            <li><a href="#">Payment Center</a></li>
            <li><a href="#">Contact Directory</a></li>
            <li><a href="#">Forms</a></li>
            <li><a href="#">News and Updates</a></li>
            <li><a href="#">FAQs</a></li>
          </ul>
        </div>
      </div>
      <div class="col-md-3 col-sm-6">
        <!--Column1-->
        <div class="footer-pad">
          <h4>about website</h4>
          <ul class="list-unstyled">
            <li><a href="#">Website Tutorial</a></li>
            <li><a href="#">Accessibility</a></li>
            <li><a href="#">Disclaimer</a></li>
            <li><a href="#">Privacy Policy</a></li>
            <li><a href="#">FAQs</a></li>
            <li><a href="#">Webmaster</a></li>
          </ul>
        </div>
      </div>
      <div class="col-md-3 col-sm-6">
        <!--Column1-->
        <div class="footer-pad">
          <h4>Address</h4>
          <ul class="list-unstyled">
            <li><a href="#">haryana</a></li>
            <li><a href="#">panipat</a></li>
            <li><a href="#">132103</a></li>
            <li><a href="#">salarganj gate</a></li>
            <li><a href="#">icsd tech labs</a></li>
            <li>
              <a href="#"></a>
            </li>
          </ul>
        </div>
      </div>
    	<div class="col-md-3">
    		<h4>Follow Us</h4>
            <ul class="social-network social-circle">
             <li><a href="#" class="icoFacebook" title="Facebook"><i class="fa fa-facebook"></i></a></li>
             <li><a href="#" class="icoLinkedin" title="Linkedin"><i class="fa fa-linkedin"></i></a></li>
            </ul>				
		</div>
    </div>
	<div class="row">
		<div class="col-md-12 copy">
			<p class="text-center">&copy; Copyright 2018 - Company Name.  All rights reserved.</p>
		</div>
	</div>


  </div>
  </div>
</footer>
</div>
</div>

</body>
</html>