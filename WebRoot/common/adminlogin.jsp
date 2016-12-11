<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>CS人自己的BBS</title>
<link rel="icon" href="favicon.ico" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="css/magnific-popup.css">
<script src="js/jquery.min.js"></script>
</head>
<body>
<!-- start header -->
<div class="header_bg">
<div class="wrap">
	<div id="content">
      <header id="topnav">
        <nav>
        		 <ul>
					<li><a  href="/csbbs">Home</a></li>
					<li><a  href="/csbbs/bbs/single?page=1">BBS</a></li>
					<li><a  href="/csbbs/myItem/single?page=1">My Item</a></li>
					<li><a  href="/csbbs/blog/single?page=1">Blog</a></li>
					<li><a  href="/csbbs/contact">Contact Us</a></li>
					<div class="clear"> </div>
				</ul>
        </nav>
         <div class="logo"><a href="index.jsp"><img src="images/logo.jpg"></a></div>
        <a href="#" id="navbtn">Nav Menu</a>
        <div class="clear"> </div>
      </header><!-- @end #topnav -->
      <script type="text/javascript"  src="js/menu.js"></script>
    </div>
</div>
</div>
   <div class="contact" id="contact">
	<div class="wrap">
		<h2>BBS管理员登录</h2>
			<div class="contact-form">
				<div class="para-contact">
					<h4>如果您还没有管理员权限：</h4>
					<p>请向您的负责人索取</p>
				
				 	<div class="social_2 social_3">	
			           <ul>	
						    <li class="facebook"><a href="#"><span> </span></a></li>
						    <li class="twitter"><a href="#"><span> </span></a></li>	 	
							<li class="google"><a href="#"><span> </span></a></li>
					  </ul>
		 		  </div>
		 		  <div class="get-intouch-left-address">
						<p>新华西道46号</p>
						<p>华北理工大学. 唐山市.</p>
						<p>E-mail: ncstzhangyi@gmail.com</p>
						<p>More Information: <a href="http://www.dearzhangyi.com.cn/" target="_blank" title="了解更多">点击了解我们</a></p>
					</div>
					<div class="clear"> </div>	
				</div>
						<div class="form">
				  			<form method="post" action="/csbbs/adminlogin">
							    	<input type="text" class="textbox" name="adminname" value ="<c:if test="${form.adminname eq null}">用户名</c:if>${form.adminname}" onFocus="if (this.value == '用户名') {this.value = '';}" onBlur="if (this.value == '') {this.value = '用户名';}">
							    	<input type="text" class="textbox" name="adminpassword" value = "<c:if test="${form.adminpassword eq null}">密码</c:if>${form.adminpassword}" onFocus="if (this.value == '密码') {this.value = '';}" onBlur="if (this.value == '') {this.value = '密码';}">
										<div class="clear"> </div>
								<div class="button send_button">
											   	 <input type="submit" value="登录">
								</div>
								<div class="clear"> </div>
							</form>
						</div>
						<a class="mov-top" href="#home1"> <span> </span></a>
					 <div class="clear"> </div>
				</div>
  			</div>
     </div>
  </body>
</html>
