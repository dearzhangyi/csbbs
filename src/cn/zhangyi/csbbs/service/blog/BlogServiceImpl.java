package cn.zhangyi.csbbs.service.blog;

import java.io.IOException;

import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;

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

public class BlogServiceImpl implements BlogService {
	public BlogServiceImpl() {
	}

	public BlogDao blogDao;

	public List<Blog> load(int page) {
		try {
			List<Blog> blogList=blogDao.load(page);
			for(Blog blog: blogList){
				String[] time;
				time=blog.getStarttime().substring(0, 10).split("-");
				blog.setYear(time[0]);
				blog.setMonth(time[1]);
				blog.setDay(time[2]);
				blog.setOwner(blogDao.byuserid(blog.getUserid()).getNickname());
				
			} 
			return blogList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
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

	public boolean newblog(Blog blog) {
		try {
			blog.setBlogid(CommonUtils.uuid());
			Date now =new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			blog.setStarttime(dateFormat.format( now ));
			
			//blog-image模式匹配  /csbbs/ueditor/upload/image/20161210/1481368668794065904.jpg
			String pattern = "(\\D*)(\\d+)(.*)";
		    // 创建 Pattern 对象
		    Pattern r = Pattern.compile(pattern);
		    // 现在创建 matcher 对象
		    Matcher m = r.matcher(blog.getContent());
		    
			return blogDao.newblog(blog);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	
}
