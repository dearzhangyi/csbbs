package cn.zhangyi.csbbs.dao.contact;

import java.sql.SQLException;
import java.util.List;

import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.User;

public interface ContactDao {

	public List<Blog> load(int page) throws SQLException;

	public Blog show(String blogid) throws SQLException;

	public Long scalar() throws SQLException;
	
}