package cn.zhangyi.csbbs.service.contact;

import java.io.IOException;

import java.util.List;
import java.util.Properties;

import java.sql.SQLException;
import java.text.MessageFormat;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.commons.CommonUtils;
import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;
import cn.zhangyi.csbbs.dao.blog.BlogDao;
import cn.zhangyi.csbbs.dao.user.UserDao;
import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.User;
import cn.zhangyi.csbbs.service.user.UserService;

public class ContactServiceImpl implements MyItemService {
	public ContactServiceImpl() {
	}

	public BlogDao blogDao;

	public List<Blog> load(int page) {
		try {
			return blogDao.load(page);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public BlogDao getBlogDao() {
		return blogDao;
	}

	public void setBlogDao(BlogDao blogDao) {
		this.blogDao = blogDao;
	}
	
	public Long scalar()  {
		try {
			return blogDao.scalar();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Blog show(String blogid) {
		try {
			return blogDao.show(blogid);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	
}
