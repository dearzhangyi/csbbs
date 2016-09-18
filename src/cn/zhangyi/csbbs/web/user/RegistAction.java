package cn.zhangyi.csbbs.web.user;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.pojo.User;
import cn.zhangyi.csbbs.service.user.UserService;

//传统servlet
public class RegistAction {
	//类似doget/dopost
	
	public  UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	//此时先删除已经缓存的session
	public RegistAction(){
		
	}
	public String execute1(){
		
		return "success";
	}
	public String execute2(){
		//获取参数
		HttpServletRequest request = ServletActionContext.getRequest();
		Map userMap= request.getParameterMap();
		User formUser = CommonUtils.toBean(userMap, User.class);
		userService.save(formUser);
		
		return "success";
	}
	
}
