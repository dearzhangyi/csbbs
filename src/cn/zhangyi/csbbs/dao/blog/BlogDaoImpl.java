package cn.zhangyi.csbbs.dao.blog;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.jdbc.TxQueryRunner;
import cn.zhangyi.csbbs.dao.user.UserDao;
import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.User;

public class BlogDaoImpl implements BlogDao {

	private QueryRunner qr = new TxQueryRunner();

	public List<Blog> load(int page) throws SQLException {
		String sql = "select * from blog order by starttime  limit ?,?";
		List<Blog> blogList= qr.query(sql, new BeanListHandler<Blog>(Blog.class),(page-1)*5,5);
		return blogList;	
	}

	public Blog show(String blogid) throws SQLException {
		String sql = "select * from blog where blogid=?";
		Blog blog = qr.query(sql, new BeanHandler(Blog.class),blogid);
		return blog;
	}
	
	public Long scalar() throws SQLException {
		String sql = "select count(*) from blog";
		Number number = (Number)qr.query(sql, new ScalarHandler());
		return  number.longValue();
	}
	
	public User byuserid (String userid) throws SQLException {
		String sql = "select * from user where userid=?";
		return qr.query(sql, new BeanHandler<User>(User.class), userid);
	}

	public boolean newblog(Blog blog) throws SQLException {
		String sql = "insert into blog (blogid,userid,starttime,content,topic,tag,introduction) values(?,?,?,?,?,?,?)";
		Object[] params = { blog.getBlogid(),blog.getUserid(), blog.getStarttime(),
				blog.getContent(),blog.getTopic(),blog.getTag(),blog.getIntroduction() };
		if(0<qr.update(sql, params))
			return true;
		else
			return false;
	}
}
