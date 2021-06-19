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

<div class="clearfix"></div>
	
  <div class="content-wrapper">
    <div class="container-fluid">
    
	<%
	
	DBHandler objdh=new DBHandler();
	int movid=objdh.IntMovieid();
	
	
	%>
	
	
	
	
		 <div class="row">
			<div class="col-lg-10 mx-auto">
			   <div class="card">
			     <div class="card-body">
				   <div class="card-title">Upload Movie</div>
				   <hr>
				    <form action="movieupload" method="post">
					 <div class="form-group">
					  <label for="input-1">Movie id</label>
					  <input type="text"  class="form-control" name="txtmovieid" id="input-1" value="<%=movid %>" placeholder="Enter movie id">
					 </div>
					 <div class="form-group">
					  <label for="input-2">Movie name</label>
					  <input type="text" class="form-control" name="txtmoviename" id="input-2" placeholder="Enter movie name">
					 </div>
				<div class="form-group ">
				  <label for="basic-select" class="col-sm-3 col-form-label">Ratings</label>
				  <div class="col-sm-6">
					<select class="form-control" id="select" name="txtOpt">
                          <option> 1</option>
                          <option> 2</option>
                          <option> 3</option>
                          <option> 4</option>
                          <option> 5</option>
                        </select>
				  </div>
				</div>
				<div class="form-group">
				<label for="input-1">Start to End</label>
				<div id="dateragne-picker">
                 <div class="input-daterange input-group">
                  <input type="date" class="form-control" name="txtstartdate" />
                  <div class="input-group-prepend">
                   <span class="input-group-text">to</span>
                  </div>
                  <input type="date" class="form-control" name="txtenddate" />
                 </div>
               </div>
				</div>
				
				
		  	<div class="form-group row">
			    <label for="slot912" class="col-sm-2 col-form-label">SLOT 9-12</label>
			    <div class="col-sm-2">
			    <input type="checkbox" class="form-control" id="slot912" name="slot912" value="true">
			    	<input type="hidden" name="slot912" value="false">
			    			
			    </div>
		  	</div>
			
			<div class="form-group row">
			    <label for="slot1215" class="col-sm-2 col-form-label">SLOT 12-15</label>
			    <div class="col-sm-2">
			    <input type="checkbox" class="form-control" id="slot1215" name="slot1215" value="true">
			    	<input type="hidden" name="slot1215" value="false">
			    			
			    </div>
		  	</div>
		  	
		  	<div class="form-group row">
			    <label for="slot1518" class="col-sm-2 col-form-label">SLOT 15-18</label>
			    <div class="col-sm-2">
			    <input type="checkbox" class="form-control" id="slot1518" name="slot1518" value="true">
			    <input type="hidden" name="slot1518" value="false">
			    			
			    </div>
		  	</div>
		  	
				
				
				
				
				
				<div class="form-group">
					  <label for="input-1">Gold price</label>
					  <input type="text" class="form-control" name="txtGprice" id="input-1" placeholder="Enter gold price">
					 </div>
	
	<div class="form-group">
					  <label for="input-1">Silver Price</label>
					  <input type="text" class="form-control" name="txtSprice" id="input-1" placeholder="Enter silver price">
					 </div>
					 				 
		
                <div class="form-group">
                  <label for="input-1" class="col-sm-8 col-form-label">upload image</label>
                  <div class="col-sm-10">
                    <input type="file" class="form-control" id="input-8" name="file" required>
                  </div>
				
			   </div>
			   <div class="form-group ">
				  <label for="basic-select" class="col-sm-3 col-form-label">Language</label>
				  <div class="col-sm-10">
					<select class="form-control" id="basic-select" name="txtlang">
                          <option> Hindi</option>
                          <option> English</option>
                          <option> Punjabi</option>
                         
                        </select>
				  </div>
				</div>
				
				<input type="submit" value="submit" onclick="funcal()" class="btn btn-primary " >
				
				</form>
			  </div>
		
		  </div><!--End Row-->









	
<div>
</div>
</div>
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