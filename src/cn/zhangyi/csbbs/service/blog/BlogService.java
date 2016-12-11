package cn.zhangyi.csbbs.service.blog;

import java.util.List;

import cn.zhangyi.csbbs.pojo.Blog;

public interface BlogService {
	
	public List<Blog> load(int page);

	public Blog show(String parameter);

	public Long scalar();

	public boolean newblog(Blog blog);
}