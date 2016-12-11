package cn.zhangyi.csbbs.service.contact;

import java.io.IOException;
import java.sql.SQLException;

import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.dao.contact.ContactDao;
import cn.zhangyi.csbbs.pojo.Feedback;



public class ContactServiceImpl implements ContactService {
	
	public ContactServiceImpl() {
	}

	public ContactDao contactDao;
	

	public ContactDao getContactDao() {
		return contactDao;
	}


	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}


	public Feedback show(String feedbackid) {
		try {
			return contactDao.show(feedbackid);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public boolean feedback(Feedback feedback) {
		try {
			feedback.setFeedbackid(CommonUtils.uuid());
			contactDao.feedback(feedback);
			return true;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
