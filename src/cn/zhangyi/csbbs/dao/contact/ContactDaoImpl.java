package cn.zhangyi.csbbs.dao.contact;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.jdbc.TxQueryRunner;
import cn.zhangyi.csbbs.dao.user.UserDao;
import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.Feedback;
import cn.zhangyi.csbbs.pojo.User;

public class ContactDaoImpl implements ContactDao {

	private QueryRunner qr = new TxQueryRunner();

	public void feedback(Feedback feedback) throws SQLException {
		String sql = "insert into feedback (feedbackid,username,usermail,message) values(?,?,?,?)";
		Object[] params = { feedback.getFeedbackid(),feedback.getUsername(),feedback.getUsermail(),feedback.getMessage() };
		qr.update(sql, params);	
	}

	public Feedback show(String feedbackid) throws SQLException {
		String sql = "select * from feedback where feedbackid=?";
		Feedback feedback = qr.query(sql, new BeanHandler(Feedback.class),feedbackid);
		return feedback;
	}
	
	
}
