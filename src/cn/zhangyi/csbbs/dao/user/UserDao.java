package cn.zhangyi.csbbs.dao.user;

import java.sql.SQLException;

import cn.zhangyi.csbbs.pojo.User;

public interface UserDao {
	public void save(User user) throws SQLException;
	public  boolean isStatus(String username, String userpassword) throws SQLException;
	public  User login(String username, String userpassword) throws SQLException;
	public boolean activation(String userid) throws SQLException;
}