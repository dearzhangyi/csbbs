package cn.zhangyi.csbbs.web.contact;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.pojo.Feedback;
import cn.zhangyi.csbbs.pojo.Reply;
import cn.zhangyi.csbbs.pojo.Page;
import cn.zhangyi.csbbs.pojo.User;
import cn.zhangyi.csbbs.service.contact.ContactService;
import cn.zhangyi.csbbs.service.myItem.MyItemService;

public class ContactAction {
	public ContactService contactService ;
	
	public ContactService getContactService() {
		return contactService;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}

	public String execute1() {

		HttpServletRequest request = ServletActionContext.getRequest();
		Map feedMap= request.getParameterMap();
		Feedback formfeed = CommonUtils.toBean(feedMap, Feedback.class);
		contactService.feedback(formfeed);//保存反馈内容
		return "success";
		
	}

	public String execute2() {
		// 获取当前用户
		HttpServletRequest request = ServletActionContext.getRequest();
		User userNow = (User) request.getSession().getAttribute("userNow");
		request.setAttribute("Owner", userNow);
		return "success";
	}
}
