<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.dao.ServiceDao"%>
<%@page import="com.bean.Service"%>
<%@page import="java.util.List"%>
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
<!-- <link rel="shortcut icon" href="images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="images/ico/apple-touch-icon-57-precomposed.png"> -->
</head>
<!--/head-->


<%@ include file="admin_header.jsp"%>
<%
 Service s = ServiceDao.getServiceById(Integer.parseInt(request.getParameter("id")));
%>
<div class="page-title"
	style="background-image: url(images/page-title.png)">
	<h1>Services</h1>
</div>

<section id="services" class="service-item">
	<div class="container">
		<div class="center fadeInDown">
			<h2>Our Service</h2>
			<p class="lead">
				We provide consultancy to different startups for UI,designing,theme
				<br> tagline. We believe in a business lead with trust and
				quality
			</p>
		</div>
		<div class="row">
			<div class="col-sm-6 col-md-4">
				<div class="media services-wrap fadeInDown">
					<div class="pull-left">
					<a href="admin_edit_services.jsp?id=<%=s.getId()%>">
						<img class="img-responsive" src= "upload/<%=s.getImage()%>"style="width: 400 px;height :400px;"
						>
						</a>
					</div>
					
					<div>
						<h3 class="media-heading"><%=s.getSrvicename() %></h3>
						<p><%=s.getPrice() %></p>
						<p><%=s.getAbout() %></p>
					</div>
				</div>
			</div>
		</div>
		<!--/.row-->
	</div>
	<!--/.container-->
</section>
<!--/#services-->