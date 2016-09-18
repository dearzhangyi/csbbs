package cn.zhangyi.csbbs.web.user;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;


import org.apache.struts2.ServletActionContext;

import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.pojo.User;
import cn.zhangyi.csbbs.service.user.UserService;


public class LoginAction {
	//类似doget and dopost
	public  UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
		public String execute1(){
			return "success";
		}
		public String execute2(){
			//获取参数
			HttpServletRequest request = ServletActionContext.getRequest();
			//数据库查询用户，并检验当前用户是否激活
			User userNow = (User) userService.login(request.getParameter("username"),request.getParameter("userpassword"));
			if(userNow==null)
				{request.setAttribute("form",CommonUtils.toBean(request.getParameterMap(), User.class));
				return "error";//通知用户该账户用户名与密码不匹配或者尚未激活
				}
			else
				//将此user对象存入session，已保存登陆状态
				request.getSession().setAttribute("userNow",userNow);
			return "success";
		}
}
