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
			List<Reply> replyList= myItemDao.load(page, userid);
			 for(Reply reply: replyList){
					String[] time;
					time=reply.getReplytime().substring(0, 10).split("-");
					reply.setYear(time[0]);
					reply.setMonth(time[1]);
					reply.setDay(time[2]);
					reply.setUsername(myItemDao.byuserid(reply.getUserid()).getNickname());
					reply.setByusername(myItemDao.byuserid(reply.getByuserid()).getNickname());
					if(reply.getReplycontent().length()>150)
						reply.setReplycontent(reply.getReplycontent().substring(0,150)); 
				} 
			 return replyList;
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
