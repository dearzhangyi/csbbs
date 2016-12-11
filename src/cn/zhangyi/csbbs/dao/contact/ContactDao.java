package cn.zhangyi.csbbs.dao.contact;

import java.sql.SQLException;
import java.util.List;

import cn.zhangyi.csbbs.pojo.Feedback;

public interface ContactDao {

	public void feedback(Feedback feedback) throws SQLException;

	public Feedback show(String blogid) throws SQLException;

	
}