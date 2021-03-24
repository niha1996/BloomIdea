<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.bean.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!--/head-->

<body class="homepage">
	<%
		User u = null;
		if (session != null) {
			if (session.getAttribute("u") != null) {
				u = (User) session.getAttribute("u");
			}
		}
	%>
	<header id="header">
		<div class="top-bar">
			<div class="container">
				<div class="row">
					<div class="col-sm-6 col-xs-12">
						<div class="top-number">
							<p>
								<i class="fa fa-phone-square"></i> +918054203882
							</p>
						</div>
					</div>
					<div class="col-sm-6 col-xs-12">
						<div class="social">
							<ul class="social-share">

								<%
									if (u != null) {
								%>
								<li><i class="ti-power-off"></i><a href="signout.jsp">SignOut
										<%=u.getName()%></a></li>
								<%
									} else {
								%>
								<li><i class="ti-power-off"></i><a href="signin.jsp">SignIn</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<li><i class="ti-power-off"></i><a href="signup.jsp">SignUp</a></li>
								<%
									}
								%>


							</ul>

							<div class="search">
								<form role="form">
									<input type="text" class="search-form" autocomplete="off"
										placeholder="Search"> <i class="fa fa-search"></i>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--/.container-->
		</div>
		<!--/.top-bar-->

		<nav class="navbar navbar-inverse" role="banner">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="admin_index.jsp"><img
						src="images/logo.png" alt="logo"></a>
				</div>

				<div class="collapse navbar-collapse navbar-right">
					<ul class="nav navbar-nav">
						<li><a href="add_services.jsp">Add Service</a></li>
						<li><a href="admin_view_services.jsp">View Services</a></li>
						<li><a href="add_blogs.jsp">Add Blogs</a></li>
					</ul>
				</div>
			</div>
			<!--/.container-->
		</nav>
		<!--/nav-->

	</header>
	<!--/header-->
</body>