package cn.zhangyi.csbbs.service.contact;

import java.util.List;

import cn.zhangyi.csbbs.pojo.Blog;

public interface ContactService {
	
	public List<Blog> load(int page);

	public Blog show(String parameter);

	public Long scalar();
}