package cn.zhangyi.csbbs.web.myAccount;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.zhangyi.csbbs.pojo.Page;
import cn.zhangyi.csbbs.pojo.Reply;
import cn.zhangyi.csbbs.pojo.User;
import cn.zhangyi.csbbs.service.myAccount.MyAccountService;
import cn.zhangyi.csbbs.service.myItem.MyItemService;

public class MyAccountAction {
	public MyAccountService myAccountService;

	public MyAccountService getMyAccountService() {
		return myAccountService;
	}
	public void setMyAccountService(MyAccountService myAccountService) {
		this.myAccountService = myAccountService;
	}
	//dis data
	public String execute1() {
		// 获取当前用户
		HttpServletRequest request = ServletActionContext.getRequest();
		User userNow = (User) request.getSession().getAttribute("userNow");
		request.setAttribute("Owner", userNow);
		return "success";
	}
	//inner
	public String execute2() {
		return "success";
	}
}
