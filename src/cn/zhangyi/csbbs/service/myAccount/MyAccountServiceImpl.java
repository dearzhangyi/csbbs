package cn.zhangyi.csbbs.service.myAccount;

import java.io.IOException;

import java.util.List;
import java.util.Properties;
import java.sql.SQLException;
import javax.mail.MessagingException;
import javax.mail.Session;

import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.dao.myAccount.MyAccountDao;

public class MyAccountServiceImpl implements MyAccountService {
	

	public MyAccountDao MyAccountDao;

	public MyAccountDao getMyAccountDao() {
		return MyAccountDao;
	}

	public void setMyAccountDao(MyAccountDao myAccountDao) {
		MyAccountDao = myAccountDao;
	}

	

	
	
}
