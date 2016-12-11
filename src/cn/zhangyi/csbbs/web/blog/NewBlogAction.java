package cn.zhangyi.csbbs.web.blog;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.User;
import cn.zhangyi.csbbs.service.blog.BlogService;

public class NewBlogAction {
	public BlogService blogService;

	public BlogService getBlogService() {
		return blogService;
	}

	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}

	public String execute1() {
		return "success";
	}

	public String execute2() {
		// 获取参数
		HttpServletRequest request = ServletActionContext.getRequest();
		Map blogMap= request.getParameterMap();
		Blog blog = CommonUtils.toBean(blogMap, Blog.class);
		
		//获取userid
		String userid=(String)((User) request.getSession().getAttribute("userNow")).getUserid();
		blog.setUserid(userid);
		//截取简介字符串
		String introduction= request.getParameter("introduction");
		if(introduction.length()>361)
		      blog.setIntroduction(introduction.substring(0,360)); 
		
		boolean status= blogService.newblog(blog);
		
		return "success";
	}
}
