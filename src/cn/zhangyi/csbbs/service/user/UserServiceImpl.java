package cn.zhangyi.csbbs.service.user;

import java.io.IOException;

import java.util.Properties;

import java.text.MessageFormat;

import javax.mail.MessagingException;
import javax.mail.Session;

import cn.itcast.commons.CommonUtils;
import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;
import cn.zhangyi.csbbs.dao.user.UserDao;
import cn.zhangyi.csbbs.pojo.User;

public class UserServiceImpl implements UserService {
	public UserServiceImpl() {
	}

	public UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	// 检验当前用户是否激活
	public boolean isStatus(String username, String userpassword) {
		try {
			return userDao.isStatus(username, userpassword);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public User login(String username, String userpassword) {
		try {
			User user=userDao.login(username, userpassword);
			return user;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public User adminlogin(String username, String userpassword) {
		try {
			User admin=userDao.adminlogin(username, userpassword);
			return admin;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public int userpower(String userid){
		try {
			int power=userDao.userpower(userid);
			return power;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void save(User user) {
		
		/*
		 * 1. 数据的补齐
		 */
		user.setUserid(CommonUtils.uuid());
		user.setStatus(false);
		/*
		 * 2. 向数据库插入
		 */
		try {
			userDao.save(user);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		/*
		 * 3. 发邮件
		 */
		/*
		 * 把配置文件内容加载到prop中
		 */
		//不用担心email的真实性，如果发送不成功会被系统退信而不是抛出异常
		Properties prop = new Properties();
		try {
			prop.load(this.getClass().getClassLoader()
					.getResourceAsStream("email_template.properties"));
		} catch (IOException e1) {
			throw new RuntimeException(e1);
		}
		/*
		 * 登录邮件服务器，得到session
		 */
		String host = prop.getProperty("host");// 服务器主机名
		String name = prop.getProperty("username");// 登录名
		String pass = prop.getProperty("password");// 登录密码
		Session session = MailUtils.createSession(host, name, pass);

		/*
		 * 创建Mail对象
		 */
		String from = prop.getProperty("from");
		String to = user.getEmail();
		String subject = prop.getProperty("subject");
		// MessageForm.format方法会把第一个参数中的{0},使用第二个参数来替换。
		// 例如MessageFormat.format("你好{0}, 你{1}!", "张三", "去死吧"); 返回“你好张三，你去死吧！”
		String content = MessageFormat.format(prop.getProperty("content"),
				user.getUserid());
		Mail mail = new Mail(from, to, subject, content);
		/*
		 * 发送邮件
		 */
		try {
			MailUtils.send(session, mail);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean activation(String userid) {
		try {
			return	userDao.activation(userid);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
