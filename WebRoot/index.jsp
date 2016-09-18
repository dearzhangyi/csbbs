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
<!--start-slider---->
<div class="slider" id="home"> 
				<div class="wrap">
				<!---start-da-slider----->
				<div id="da-slider" class="da-slider">
				<div class="da-slide">
					<h2>CS人自己的BBS和Blog</h2>
					<p>欢迎高端玩家和萌新前来入驻，发布自己的技术博文AND看技术大牛聊天胡侃</p>
					<a href="/csbbs/regist" class="da-link">Learn more</a>
				</div>
				<div class="da-slide">
					<h2>登陆后展现更加全面</h2>
					<p>COMPANY-- YOUR SLOGAN HERE</p>
					<a href="/csbbs/login" class="da-link">Learn more</a>
				</div>

				<nav class="da-arrows">
					<span class="da-arrows-prev"></span>
					<span class="da-arrows-next"></span>
				</nav>
			</div>
			<link rel="stylesheet" type="text/css" href="css/slider.css" />
			<script type="text/javascript" src="js/modernizr.custom.28468.js"></script>
			<script type="text/javascript" src="js/jquery.cslider.js"></script>
			<script type="text/javascript">
				$(function() {
				
					$('#da-slider').cslider({
						autoplay	: true,
						bgincrement	: 450
					});
				
				});
			</script>
				<!---//End-da-slider----->
			</div>
</div>

						
						<a class="mov-top" href="#home1"> <span> </span></a>
					 <div class="clear"> </div>
				</div>
  			</div>
     </div>
     <!-- scroll_top_btn -->
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
	    <script type="text/javascript">
			$(document).ready(function() {
			
				var defaults = {
		  			containerID: 'toTop', // fading element id
					containerHoverID: 'toTopHover', // fading element hover id
					scrollSpeed: 1200,
					easingType: 'linear' 
		 		};
				
				
				$().UItoTop({ easingType: 'easeOutQuart' });
				
			});
		</script>
		<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
			});
		});
	</script>

		 <a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"></span></a>
<!--------//end-contact----------->
</body>
</html>		