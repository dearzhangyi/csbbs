package cn.zhangyi.csbbs.dao.myItem;

import java.sql.SQLException;
import java.util.List;

import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.Reply;
import cn.zhangyi.csbbs.pojo.User;

public interface MyItemDao {

	public List<Reply> load(Integer page,String userid) throws SQLException;

	public Long scalar(String userid) throws SQLException;

	public User byuserid(String byuserid) throws SQLException;


	
}