<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>Home | Corlate</title>

<!-- core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/animate.min.css" rel="stylesheet">
<link href="css/prettyPhoto.css" rel="stylesheet">
<link href="css/owl.carousel.min.css" rel="stylesheet">
<link href="css/icomoon.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/responsive.css" rel="stylesheet">
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
<link rel="shortcut icon" href="images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="images/ico/apple-touch-icon-57-precomposed.png">
</head>
<!--/head-->

<%@ include file="header.jsp"%>
<div class="page-title"
	style="background-image: url(images/page-title.png)">
	<h1>Sign Up</h1>
</div>

<section id="contact-page">
	<div class="container">
		<div class="large-title text-center">
			<h2>Sign Up</h2>
			<p>
				All users on MySpace will know that there are millions of people out
				there. Every day <br> besides so many people joining this
				community.
			</p>
		</div>
		<div class="row contact-wrap">
			<div class="status alert alert-success" style="display: none"></div>
			<form id="main-contact-form" class="contact-form" name="contact-form"
				method="post" action="UserController">
				<div class="col-sm-5 col-sm-offset-1">
					<div class="form-group">
						<label>Name *</label> <input type="text" name="name"
							class="form-control" placeholder="Name" required="required">
					</div>
					<div class="form-group">
						<label>Email *</label> <input type="email" name="email"
							class="form-control" placeholder="Email" required="required">
					</div>

					<div class="form-group">
						<label>Password *</label> <input type="password"
							placeholder="Password" name="password" class="form-control">
					</div>
				</div>
				<div class="col-sm-5 col-sm-offset-1">
					<div class="form-group">
						<label>Phone *</label> <input type="number" name="mobile" placeholder="Phone"
							class="form-control">
					</div>
					<div class="form-group">
						<label>Company Name *</label> <input type="text"
							placeholder="Company Name" name="companyname" class="form-control">
					</div>


					<div class="form-group">
						<label>Confirm Password *</label> <input type="password"
							placeholder="ConfirmPassword" name="confirmpassword" class="form-control">
					</div>
				</div>

				<div class="form-group">
					<div class="center">
						<button type="submit" name="action" value="signup" class="btn btn-primary btn-lg"
							required="required">Sign Up</button>
					</div>
				</div>
			</form>
		</div>
		<!--/.row-->
	</div>
	<!--/.container-->
</section>
<!--/#contact-page-->


<section id="bottom">
	<div class="container fadeInDown" data-wow-duration="1000ms"
		data-wow-delay="600ms">
		<div class="row">
			<div class="col-md-2">
				<a href="#" class="footer-logo"> <img
					src="images/logo-black.png" alt="logo">
				</a>
			</div>
			<div class="col-md-10">
				<div class="row">
					<div class="col-md-3 col-sm-6">
						<div class="widget">
							<h3>Company</h3>
							<ul>
								<li><a href="#">About us</a></li>
								<li><a href="#">We are hiring</a></li>
								<li><a href="#">Meet the team</a></li>
								<li><a href="#">Copyright</a></li>
								<li><a href="#">Terms of use</a></li>
								<li><a href="#">Privacy policy</a></li>
								<li><a href="#">Contact us</a></li>
							</ul>
						</div>
					</div>
					<!--/.col-md-3-->

					<div class="col-md-3 col-sm-6">
						<div class="widget">
							<h3>Support</h3>
							<ul>
								<li><a href="#">Faq</a></li>
								<li><a href="#">Blog</a></li>
								<li><a href="#">Forum</a></li>
								<li><a href="#">Documentation</a></li>
								<li><a href="#">Refund policy</a></li>
								<li><a href="#">Ticket system</a></li>
								<li><a href="#">Billing system</a></li>
							</ul>
						</div>
					</div>
					<!--/.col-md-3-->

					<div class="col-md-3 col-sm-6">
						<div class="widget">
							<h3>Developers</h3>
							<ul>
								<li><a href="#">Web Development</a></li>
								<li><a href="#">SEO Marketing</a></li>
								<li><a href="#">Theme</a></li>
								<li><a href="#">Development</a></li>
								<li><a href="#">Email Marketing</a></li>
								<li><a href="#">Plugin Development</a></li>
								<li><a href="#">Article Writing</a></li>
							</ul>
						</div>
					</div>
					<!--/.col-md-3-->

					<div class="col-md-3 col-sm-6">
						<div class="widget">
							<h3>Our Partners</h3>
							<ul>
								<li><a href="#">Adipisicing Elit</a></li>
								<li><a href="#">Eiusmod</a></li>
								<li><a href="#">Tempor</a></li>
								<li><a href="#">Veniam</a></li>
								<li><a href="#">Exercitation</a></li>
								<li><a href="#">Ullamco</a></li>
								<li><a href="#">Laboris</a></li>
							</ul>
						</div>
					</div>
					<!--/.col-md-3-->
				</div>
			</div>


		</div>
	</div>
</section>
<!--/#bottom-->
<footer id="footer" class="midnight-blue">
	<div class="container">
		<div class="row">
			<div class="col-sm-6">
				&copy; 2013 <a target="_blank" href="http://shapebootstrap.net/"
					title="Free Twitter Bootstrap WordPress Themes and HTML templates">ShapeBootstrap</a>.
				All Rights Reserved.
			</div>
			<div class="col-sm-6">
				<ul class="pull-right">
					<li><a href="#">Home</a></li>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Faq</a></li>
					<li><a href="#">Contact Us</a></li>
				</ul>
			</div>
		</div>
	</div>
</footer>
<!--/#footer-->

<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.prettyPhoto.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.isotope.min.js"></script>

</body>

</html>
