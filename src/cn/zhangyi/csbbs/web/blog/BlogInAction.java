package cn.zhangyi.csbbs.web.blog;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.service.blog.BlogService;

public class BlogInAction {
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
		Blog blog = blogService.show(request.getParameter("blogid"));
		request.setAttribute("blog", blog);
		return "success";
	}
}
