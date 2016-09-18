package cn.zhangyi.csbbs.service.myItem;

import java.io.IOException;

import java.util.List;
import java.util.Properties;
import java.sql.SQLException;
import javax.mail.MessagingException;
import javax.mail.Session;

import cn.itcast.commons.CommonUtils;
import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;
import cn.zhangyi.csbbs.dao.myItem.MyItemDao;
import cn.zhangyi.csbbs.pojo.Reply;

public class MyItemServiceImpl implements MyItemService {
	

	public MyItemDao myItemDao;

	public MyItemDao getMyItemDao() {
		return myItemDao;
	}

	public void setMyItemDao(MyItemDao myItemDao) {
		this.myItemDao = myItemDao;
	}

	public List<Reply> load(Integer page,String userid) {
		try {
			return myItemDao.load(page, userid);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Long scalar(String userid) {
		try {
			return myItemDao.scalar( userid);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	
}
