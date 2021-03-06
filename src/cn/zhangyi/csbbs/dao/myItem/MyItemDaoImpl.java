package cn.zhangyi.csbbs.dao.myItem;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.jdbc.TxQueryRunner;
import cn.zhangyi.csbbs.dao.user.UserDao;
import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.Reply;
import cn.zhangyi.csbbs.pojo.User;

public class MyItemDaoImpl implements MyItemDao {

	private QueryRunner qr = new TxQueryRunner();

	public List<Reply> load(Integer page,String userid) throws SQLException {
			String sql = " select * from reply where userid =? or byuserid =? order by replytime desc limit ?,?";
			List<Reply> replyList= qr.query(sql, new BeanListHandler<Reply>(Reply.class),userid,userid,(page-1)*5,5);
			return replyList;	
		}
	public User byuserid(String userid) throws SQLException {
		String sql = "select * from user where userid=?";
		return qr.query(sql, new BeanHandler<User>(User.class), userid);
	}

	public Long scalar(String userid) throws SQLException {
		String sql = "select count(*) from reply where userid =? or byuserid =?";
		Number number = (Number)qr.query(sql, new ScalarHandler(),userid,userid);
		return  number.longValue();
	}

	
	}
