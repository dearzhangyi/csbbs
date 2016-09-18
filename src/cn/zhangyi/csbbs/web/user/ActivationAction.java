package cn.zhangyi.csbbs.web.user;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.pojo.User;
import cn.zhangyi.csbbs.service.user.UserService;

//传统servlet
public class ActivationAction {
	//类似doget/dopost
	
	public  UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	//此时先删除已经缓存的session
	public ActivationAction(){
		
	}
	public String execute(){
		//获取参数
		HttpServletRequest request = ServletActionContext.getRequest();
		String userid= request.getParameter("Userid");
		if(userService.activation(userid)){
			//激活成功
			request.setAttribute("code", "success");
			request.setAttribute("msg", "恭喜，您的账户已经成功激活成功，请马上登录!");
			request.setAttribute("title", "账户已经成功激活");}
		else{
			//此账户激活链接已使用过或者您的链接非法
			request.setAttribute("msg", "此账户激活链接已使用过或者您的链接非法!");
			request.setAttribute("code", "error");
			request.setAttribute("title", "您的链接有误");}
		return "message";
	}
	
}
