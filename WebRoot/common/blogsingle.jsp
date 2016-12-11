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
					<li><a  href="/csbbs/blog/single?page=1">Blog</a></li>
					<li><a  href="/csbbs/myItem/single?page=1">My Item</a></li>
					<li><a  href="/csbbs/myAccount">My Account</a></li>
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
<!--------start-blog----------->
<div class="blog">
	<div class="banner">
		<h2>Blog</h2>
	</div>
	<div class="main">
		  	<div class="wrap">
			 	<div class="single-top">
				 <div class="wrapper_single">
			<c:forEach var="blogSingle" items="${blogList}" >  
					  <div class="wrapper_top">
						<div class="grid_1 alpha">
							<div class="date">
									<span>${blogSingle.day}</span>${blogSingle.month}月${blogSingle.year}
							</div>
						</div>
					 	<div class="content span_2_of_single">
						   		<h5 class="blog_title"><a href="bloginner.html">${blogSingle.topic}</a></h5>
								<div class="content">
									<div class="span-1-of-1">
										<a href="bloginner.html"><img class="m_img"  src="images/sb4.jpg" alt=""/></a>
									</div>
									<div class="span-1-of-2">
						 				<p>${blogSingle.content}</p>
						 				<a href="bloginner.html" class="arrow_btn">Read More</a>
						 			</div>
						 			<div class="clear"> </div>
								</div>	
								<div class="links">
									<h3 class="comments">By<a href="bloginner.html">${blogSingle.owner}</a></h3>
									<h3 class="comments"><a href="#">126次回复</a></h3>
									<h3 class="tags">标签（Tags）: <a href="#">Design</a>,<a href="#">Creative</a>,<a href="#">wordpress theme</a></h3>
									<div class="clear"> </div>
								</div>
						</div>
						<div class="clear"> </div>
					</div>
				</c:forEach>   
					
		</div>
		<div class="rsidebar span_1_of_3">
				<div class="search_box">
					<form>
					   <input type="text" value="Search" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
				    </form>
			 	</div>
               
               <div class="email_box">
					<form action="">
					  	 <div class="button">
						   	 <span><input type="submit" value="检索"></span>
						   	 <span><a href="/csbbs/common/newBlog.jsp">写博客</a></span>
						</div>
				    </form>
			 	</div>
			 	<div class="Categories">
			 		<h4>Categories</h4>
				 	<ul class="sidebar">
			           	<div class="hover"><li><a href="#">Lorem Ipsum is simply dummy</a></li></div>
			            <div class="hover"><li><a href="#">Lorem Ipsum is simply dummy</a></li></div>
			            <div class="hover"><li><a href="#">Lorem Ipsum is simply dummy</a></li></div>
			            <div class="hover"><li><a href="#">Lorem Ipsum is simply dummy</a></li></div>
			            <div class="hover"> <li><a href="#">Lorem Ipsum is simply dummy</a></li></div>
			            <div class="hover"><li><a href="#">Lorem Ipsum is simply dummy</a></li></div>
			          </ul>
		        </div>
		        <div class="popularpost">
		        	<h4>Popular Post</h4>
		        	<div class="image">
		        		<a href="#"><img src="images/sb5.jpg"/></a>
		        	</div>
		        	<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
		        	<div class="link_1">
		        		<p><a href="#">Sep 26,2013 </a></p>
		        		<a href="#" class="arrow_btn right">Read More</a>
		        		<div class="clear"> </div>
		        	</div>
		        </div>
		        <div class="recentpost">
			 		<h4>Recent Post</h4>
				 	<ul class="sidebar_1">
			           	<li><a href="#">Lorem Ipsum is simply dummy</a></li>
			            <li><a href="#">Lorem Ipsum is simply dummy</a></li>
			           	<li><a href="#">Lorem Ipsum is simply dummy</a></li>
			            <li><a href="#">Lorem Ipsum is simply dummy</a></li>
			            <li><a href="#">Lorem Ipsum is simply dummy</a></li>
			            <li><a href="#">Lorem Ipsum is simply dummy</a></li>
			          </ul>
		        </div>
		        <div class="tags">
		        	<h4>Tags</h4>
		        	<ul>
		        		<li><a href="#">design</a></li>
		        		<li><a href="#">development</a></li>
		        		<li><a href="#">multipurpose</a></li>
		        		<li><a href="#">creative</a></li>
		        		<li><a href="#">seo</a></li>
		        		<li><a href="#">adverticement</a></li>
		        		<li><a href="#">life</a></li>
		        		<div class="clear"> </div>
		        	</ul>
		        </div>
		</div>
		
		<div class="clear"> </div>
	</div>	
	<div class="pages">
							<ul>
								<li class="preview"><a href="${page.url}?page=<c:if test="${page.pc > 1}">${page.pc-1}</c:if><c:if test="${page.pc == 1}">${page.pc}</c:if>"><span></span></a></li>
							
<%--我们需要计算页码列表的开始和结束位置，即两个变量begin和end
计算它们需要通过当前页码！
1. 总页数不足6页--> begin=1, end=最大页
2. 通过公式设置begin和end，begin=当前页-1，end=当前页+3
3. 如果begin<1，那么让begin=1，end=6
4. 如果end>tp, 让begin=tp-5, end=tp
 --%>
 <c:choose>
 	<c:when test="${page.tp <= 6 }">
 		<c:set var="begin" value="1"/>
 		<c:set var="end" value="${page.tp }"/>
 	</c:when>
 	<c:otherwise>
 		<c:set var="begin" value="${page.pc-2 }"/>
 		<c:set var="end" value="${page.pc + 3}"/>
 		<c:if test="${begin < 1 }">
 		  <c:set var="begin" value="1"/>
 		  <c:set var="end" value="6"/>
 		</c:if>
 		<c:if test="${end > page.tp }">
 		  <c:set var="begin" value="${page.tp-5 }"/>
 		  <c:set var="end" value="${page.tp }"/>
 		</c:if> 		
 	</c:otherwise>
 </c:choose>
 
 
 <c:forEach begin="${begin }" end="${end }" var="i">
   <c:choose>
   	  <c:when test="${i eq page.pc }">
   	   <li > <a style="color:blue" href="${page.url}?page=${i}">${i }</a></li>
   	  </c:when>
   	  <c:otherwise>
   	   <li> <a href="${page.url}?page=${i}" >${i }</a></li>
   	  </c:otherwise>
   </c:choose>
 </c:forEach>
								<li class="next"><a href="${page.url}?page=<c:if test="${page.pc == page.tp}">${page.tp}</c:if><c:if test="${page.pc < page.tp}">${page.pc+1}</c:if>"><span> </span></a></li>
								<div class="clear"> </div>
							</ul>
						</div>
<!----//End-content---->
	</div>
</div>	
</div>	
<!--------//end-blog----------->
<div class="footer">
		<div class="wrap">
			<div class="social_2 social_3">	
	           <ul>	
				    <li class="facebook"><a href="#"><span> </span></a></li>
				    <li class="twitter"><a href="#"><span> </span></a></li>	 	
					<li class="google"><a href="#"><span> </span></a></li>
			  </ul>
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
		 <a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"></span></a>
		 	 <div class="copy">
			       <p>&copy; 2014 Template by <a href="http://w3layouts.com" target="_blank">w3layouts</a></p>
		        </div> 
</div>
	</body>
</html>