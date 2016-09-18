package cn.zhangyi.csbbs.web.blog;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.Page;
import cn.zhangyi.csbbs.service.blog.BlogService;

public class BlogOutAction {
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
		Integer pc =Integer.parseInt(request.getParameter("page"));
		List<Blog> blogList = blogService.load(pc);
		request.setAttribute("blogList", blogList);
		Page page= new Page();
		page.setPc(pc);
		page.setTr(blogService.scalar());
		page.setUrl("/csbbs/blog/single");
		request.setAttribute("page",page );
		return "success";
	}
}
