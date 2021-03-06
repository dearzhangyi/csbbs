<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
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
		<h2>Contact Us</h2>
			<div class="contact-form">
				<div class="para-contact">
					<h4>在右侧键入您的事由，我们会尽快回复</h4>
					<p>如果您还没有账户,请点击此链接进入注册页面: <a href="/csbbs/regist" target="_self" title="注册">点击注册新账户</a></p><p> 如果您已经有账户 :  请点击此链接进入登录页面: <a href="/csbbs/login" target="_self" title="登录">点击登录</a></p>
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
				  			<form method="post" action="/csbbs/feedback">
							    	<input type="text" class="textbox" name="username" value=" Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Name';}">
							    	<input type="text" class="textbox" name="usermail" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}">
										<div class="clear"> </div>
								    <div>
								    	<textarea name="message" value="Message:" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = ' Message';}">Message</textarea>
								    </div>
								<div class="button send_button">
											   	 <input type="submit" value="Send">
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
