/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.10
 * Generated at: 2021-03-17 07:29:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.User;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1615182035519L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.bean.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>Home | Corlate</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- core CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/icomoon.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<!--/head-->\r\n");
      out.write("\r\n");
      out.write("<body class=\"homepage\">\r\n");
      out.write("\t");

		User u = null;
		if (session != null) {
			if (session.getAttribute("u") != null) {
				u = (User) session.getAttribute("u");
			}
		}
	
      out.write("\r\n");
      out.write("\t<header id=\"header\">\r\n");
      out.write("\t\t<div class=\"top-bar\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"top-number\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"fa fa-phone-square\"></i> +918054203882\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6 col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"social\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"social-share\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									if (u != null) {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"ti-power-off\"></i><a href=\"signout.jsp\">SignOut ");
      out.print(u.getName() );
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									} else {
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"ti-power-off\"></i><a href=\"signin.jsp\">SignIn</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"ti-power-off\"></i><a href=\"signup.jsp\">SignUp</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

									}
								
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form role=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"search-form\" autocomplete=\"off\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"Search\"> <i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/.container-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--/.top-bar-->\r\n");
      out.write("\r\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse\" role=\"banner\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\tdata-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"index.jsp\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"images/logo.png\" alt=\"logo\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse navbar-right\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about-us.jsp\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"services.jsp\">Services</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"portfolio.jsp\">Portfolio</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\">Pages <i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"blog-item.jsp\">Blog Single</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"pricing.jsp\">Pricing</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"404.jsp\">404</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blog.jsp\">Blog</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact-us.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/.container-->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<!--/nav-->\r\n");
      out.write("\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!--/header-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"page-title\" style=\"background-image: url(images/page-title.png)\">\r\n");
      out.write("        <h1>Single Blog</h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section id=\"blog\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"blog container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-8\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"blog-item\">\r\n");
      out.write("                        <a href=\"#\"><img class=\"img-responsive img-blog\" src=\"images/blog1.png\" width=\"100%\" alt=\"\" /></a>\r\n");
      out.write("                        <div class=\"blog-content\">\r\n");
      out.write("                            <a href=\"#\" class=\"blog_cat\">UI/UX DESIGN</a>\r\n");
      out.write("                            <h2><a href=\"blog-item.jsp\">Consequat bibendum quam liquam viverra</a></h2>\r\n");
      out.write("                            <div class=\"post-meta\">\r\n");
      out.write("                                <p>By <a href=\"#\">Martin Garrix</a></p>\r\n");
      out.write("                                <p><i class=\"fa fa-clock-o\"></i> <a href=\"#\">18 May 2017</a></p>\r\n");
      out.write("                                <p><i class=\"fa fa-comment\"></i> <a href=\"#\">32</a></p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    share:\r\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-facebook\"></a>\r\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-twitter\"></a>\r\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-linkedin\"></a>\r\n");
      out.write("                                    <a href=\"#\" class=\"fa fa-pinterest\"></a>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h3>Curabitur quis libero leo, pharetra mattis eros. Praesent consequat libero eget dolor convallis vel rhoncus magna scelerisque. Donec nisl ante, elementum eget posuere a, consectetur a metus. Proin a adipiscing sapien. Suspendisse vehicula porta lectus vel semper. Nullam sapien elit, lacinia eu tristique non.posuere at mi. Morbi at turpis id urna ullamcorper ullamcorper.</h3>\r\n");
      out.write("                            <h3>So many users are quite confused about where they may find the right layouts. Some time has to be taken to find the ones that are unique, as there are plenty of sites that offer layouts for MySpace. Then users will also have to remember that they will have to look at the number of layouts being updated every day by various designers.</h3>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <img src=\"images/blog-inner.png\" alt=\"\">\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <h2>Medical Center Framar</h2>\r\n");
      out.write("                            <h3>As a business owner or manager, the decision to opt for offshore software development can be difficult. As anyone who has experience knows, there are advantages and disadvantages to outsourcing software development. How then, do you balance the risks and rewards and come out on top? Here are five tips to ensure that you receive an excellent return on investment:\r\n");
      out.write("                            </h3>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <h2>Are you one of the thousands of Iphone owners who has no idea that they can get free games for their Iphone? Its pretty cool to download things from Itunes.</h2>\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <h3>With MySpace becoming more popular every day, there is the constant need to be different. There are millions of users, and there will be many who might even use the same layouts. If MySpace layouts are chosen well, then you can enhance your profile a great deal. This will help you get more contacts as well. But because of the demand, there will be the need to find unique layouts.</h3>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"inner-meta\">\r\n");
      out.write("                                <ul class=\"tags\">\r\n");
      out.write("                                    <li><a href=\"#\">Portfolio</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Donation</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Sponsor</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">People</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <div class=\"social-btns\">\r\n");
      out.write("                                    <a href=\"#\"> <i class=\"fa fa-heart\"></i> Like</a>\r\n");
      out.write("                                    <a href=\"#\" class=\"tweet-bg\"> <i class=\"fa fa-twitter\"></i> tweet</a>\r\n");
      out.write("                                    <a href=\"#\" class=\"facebook-bg\"> <i class=\"fa fa-facebook\"></i> facebook</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"comments\">\r\n");
      out.write("                                <h2>Comments</h2>\r\n");
      out.write("                                <div class=\"single-comment\">\r\n");
      out.write("                                    <div class=\"comment-img\">\r\n");
      out.write("                                        <img src=\"images/graverter.jpg\" alt=\"author\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"comment-content\">\r\n");
      out.write("                                        <h5>Vincent Abbott</h5>\r\n");
      out.write("                                        <p>All users on MySpace will know that there are millions of people out there. Every day besides so many people joining this community, there are many others who will be looking out for friends.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"comment-count\">\r\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-reply\"></i> Reply (1)</a>\r\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-heart\"></i> 15</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"single-comment reply\">\r\n");
      out.write("                                    <div class=\"comment-img\">\r\n");
      out.write("                                        <img src=\"images/graverter.jpg\" alt=\"author\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"comment-content\">\r\n");
      out.write("                                        <h5>Vincent Abbott</h5>\r\n");
      out.write("                                        <p>All users on MySpace will know that there are millions of people out there. Every day besides so many people joining this community, there are many others who will be looking out for friends.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"comment-count\">\r\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-reply\"></i> Reply (1)</a>\r\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-heart\"></i> 15</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"single-comment\">\r\n");
      out.write("                                    <div class=\"comment-img\">\r\n");
      out.write("                                        <img src=\"images/graverter.jpg\" alt=\"author\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"comment-content\">\r\n");
      out.write("                                        <h5>Vincent Abbott</h5>\r\n");
      out.write("                                        <p>All users on MySpace will know that there are millions of people out there. Every day besides so many people joining this community, there are many others who will be looking out for friends.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"comment-count\">\r\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-reply\"></i> Reply (1)</a>\r\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-heart\"></i> 15</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"single-comment\">\r\n");
      out.write("                                    <div class=\"comment-img\">\r\n");
      out.write("                                        <img src=\"images/graverter.jpg\" alt=\"author\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"comment-content comment-form\">\r\n");
      out.write("                                        <form action=\"#\">\r\n");
      out.write("                                            <textarea></textarea>\r\n");
      out.write("                                            <input type=\"submit\" value=\"Comment\">\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/.blog-item-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--/.col-md-8-->\r\n");
      out.write("\r\n");
      out.write("                <aside class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"widget search\">\r\n");
      out.write("                        <form role=\"form\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control search_box\" autocomplete=\"off\" placeholder=\"Search Here\">\r\n");
      out.write("                            <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/.search-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"widget archieve\">\r\n");
      out.write("                        <h3>Categories</h3>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-sm-12\">\r\n");
      out.write("                                <ul class=\"blog_archieve\">\r\n");
      out.write("                                    <li><a href=\"#\">December 2013 <span class=\"pull-right\">(97)</span></a></li>\r\n");
      out.write("                                    <li><a href=\"#\">November 2013 <span class=\"pull-right\">(32)</span></a></li>\r\n");
      out.write("                                    <li><a href=\"#\">October 2013 <span class=\"pull-right\">(19)</span></a></li>\r\n");
      out.write("                                    <li><a href=\"#\">September 2013 <span class=\"pull-right\">(08)</span></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/.archieve-->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"widget popular_post\">\r\n");
      out.write("                        <h3>Popular Post</h3>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <img src=\"images/post1.png\" alt=\"\">\r\n");
      out.write("                                    <p>Can you get free games for you</p>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <img src=\"images/post2.png\" alt=\"\">\r\n");
      out.write("                                    <p>Can you get free games for you</p>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <img src=\"images/post3.png\" alt=\"\">\r\n");
      out.write("                                    <p>Can you get free games for you</p>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/.archieve-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"widget blog_gallery\">\r\n");
      out.write("                        <h3>Our Gallery</h3>\r\n");
      out.write("                        <ul class=\"sidebar-gallery clearfix\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\"><img src=\"images/sidebar-g-1.png\" alt=\"\" /></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\"><img src=\"images/sidebar-g-2.png\" alt=\"\" /></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\"><img src=\"images/sidebar-g-3.png\" alt=\"\" /></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\"><img src=\"images/sidebar-g-4.png\" alt=\"\" /></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\"><img src=\"images/sidebar-g-5.png\" alt=\"\" /></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\"><img src=\"images/sidebar-g-6.png\" alt=\"\" /></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--/.blog_gallery-->\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"widget social_icon\">\r\n");
      out.write("                        <a href=\"#\" class=\"fa fa-facebook\"></a>\r\n");
      out.write("                        <a href=\"#\" class=\"fa fa-twitter\"></a>\r\n");
      out.write("                        <a href=\"#\" class=\"fa fa-linkedin\"></a>\r\n");
      out.write("                        <a href=\"#\" class=\"fa fa-pinterest\"></a>\r\n");
      out.write("                        <a href=\"#\" class=\"fa fa-github\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </aside>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--/.row-->\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!--/#blog-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section id=\"bottom\">\r\n");
      out.write("        <div class=\"container fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-2\">\r\n");
      out.write("                    <a href=\"#\" class=\"footer-logo\">\r\n");
      out.write("                        <img src=\"images/logo-black.png\" alt=\"logo\">\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-10\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                            <div class=\"widget\">\r\n");
      out.write("                                <h3>Company</h3>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">About us</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">We are hiring</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Meet the team</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Copyright</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Terms of use</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Privacy policy</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Contact us</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--/.col-md-3-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                            <div class=\"widget\">\r\n");
      out.write("                                <h3>Support</h3>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">Faq</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Blog</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Forum</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Documentation</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Refund policy</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Ticket system</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Billing system</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--/.col-md-3-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                            <div class=\"widget\">\r\n");
      out.write("                                <h3>Developers</h3>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">Web Development</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">SEO Marketing</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Theme</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Development</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Email Marketing</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Plugin Development</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Article Writing</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--/.col-md-3-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-6\">\r\n");
      out.write("                            <div class=\"widget\">\r\n");
      out.write("                                <h3>Our Partners</h3>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">Adipisicing Elit</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Eiusmod</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Tempor</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Veniam</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Exercitation</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Ullamco</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Laboris</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!--/.col-md-3-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!--/#bottom-->\r\n");
      out.write("\r\n");
      out.write("    <footer id=\"footer\" class=\"midnight-blue\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    &copy; 2013 <a target=\"_blank\" href=\"http://shapebootstrap.net/\" title=\"Free Twitter Bootstrap WordPress Themes and HTML templates\">ShapeBootstrap</a>. All Rights Reserved.\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <ul class=\"pull-right\">\r\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Faq</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!--/#footer-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.isotope.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}