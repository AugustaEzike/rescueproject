<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<nav class="navbar navbar-expand-lg ">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Food Rescue</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse " id="navbarNav">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="index.html">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Donate</a>
          </li>
          <li class="nav-item">
            <a class="nav-link ">Rescue</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <div class="container ">
    <div class="row login">
        <div class="col-sm-6">
            <h5 class="card-title">Login</h5>
                <div class="card">
                     <div class="card-body">
                        <h5 class="card-title">UserName</h5>
                        <input type="text" name="name" class="px-3" placeholder="Enter username">
                         <h5 class="card-title">Password</h5>
                        <input type="text" name="password" class="px-3" placeholder="Enter password">
                        <br>
                        <span> <input type="checkbox">Remember me </span>
                        <span><a  href="#">Lost Password</a></span>
                        <span> <a  href="#" class="login btn btn-primary">Login</a></span>
                     </div>
                </div>
        </div>
        
        <div class=" signup">
        	<form action="" method="post">
        		<input type="text" name="name" placeholder="Enter Name" required>
        		<input type="email" name="email" placeholder="Enter your email" required>
        		<input type="password" name="password" placeholder="Enter your password" required>
        		<input type="password" name="password" placeholder="Enter your password again" required>
        		<span> <a  href="#" class="login btn btn-primary">Register</a></span>
        	</form>
      
  		</div>
    </div>
</div>


 


  <div class="footer container py-5">
    <div class="row">
        <div class="col-lg-9 m-auto text-center">
            <hr>
            <h1>Join Our Mailing List</h1>
            <input type="text" class="px-3" placeholder="Enter your Email">
            <button class="btn2">Submit</button>
        </div>
    </div>
    <div class="row">
        <div class="col-lg-3 py-3 text-center m-auto connect">
            <div class="text-center m-auto">
                  <span><i class="fab fa-facebook"></i></span>
                  <span><i class="fab fa-instagram"></i></span>
                  <span><i class="fab fa-twitter"></i></span>
                  <span><i class="fab fa-google-plus"></i></span>
            </div>
        </div>
    </div>
    <p class="text-center" >Copyright 2021 All rights reserved || This template is made by Augusta</p>
</div>
  
</body>
</html>