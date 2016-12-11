package cn.zhangyi.csbbs.dao.blog;

import java.sql.SQLException;
import java.util.List;

import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.User;

public interface BlogDao {

	public List<Blog> load(int page) throws SQLException;

	public Blog show(String blogid) throws SQLException;

	public Long scalar() throws SQLException;
	
	public User byuserid(String byuserid) throws SQLException;

	public boolean newblog(Blog blog) throws SQLException;
	
}