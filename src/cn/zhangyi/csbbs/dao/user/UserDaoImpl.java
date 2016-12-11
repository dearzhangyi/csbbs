package cn.zhangyi.csbbs.dao.user;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.jdbc.TxQueryRunner;
import cn.zhangyi.csbbs.pojo.Power;
import cn.zhangyi.csbbs.pojo.User;

public class UserDaoImpl implements UserDao {

	private QueryRunner qr = new TxQueryRunner();

	public void save(User user) throws SQLException {
		String sql = "insert into user (userid,username,email,userpassword) values(?,?,?,?)";
		Object[] params = { user.getUserid(), user.getUsername(),
				user.getEmail(), user.getUserpassword() };
		qr.update(sql, params);

	}

	public boolean isStatus(String username, String userpassword)
			throws SQLException {
		String sql = "select count(1) from user where username=? and userpassword=? and status=1";
		Number number = (Number) qr.query(sql, new ScalarHandler(), username,
				userpassword);
		return number.intValue() == 1;
	}

	public User login(String username, String userpassword) throws SQLException {
		String sql = "select * from user where username=? and userpassword=? and status=1";
		return qr.query(sql, new BeanHandler<User>(User.class), username,
				userpassword);
	}

	public User adminlogin(String username, String userpassword) throws SQLException {
		String sql = "select * from user,power where user.userid=power.userid and username=? and userpassword=? and power.power=1";
		return qr.query(sql, new BeanHandler<User>(User.class), username,
				userpassword);
	}
	
	public int userpower(String userid) throws SQLException {
		String sql = "select * from power where userid=? ";
		Power power=qr.query(sql, new BeanHandler<Power>(Power.class),userid);
		return power.getPower();
	}
	
	
	public boolean activation(String userid) throws SQLException {
		String sql = "select count(1) from user where userid=? and status=0";
		if(((Number) qr.query(sql, new ScalarHandler(),userid)).intValue() == 1)
			{
			String sql2 = "update user set status = 1 where userid=?";
			qr.update(sql2, userid);
			return true;
		}
		else
			return false;
	}
}
