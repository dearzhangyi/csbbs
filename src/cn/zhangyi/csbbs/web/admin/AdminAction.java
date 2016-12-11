package cn.zhangyi.csbbs.web.admin;

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
import cn.zhangyi.csbbs.service.user.UserService;

public class AdminAction {
public  UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
		public String execute1(){
			HttpServletRequest request = ServletActionContext.getRequest();
			User admin = (User)request.getSession().getAttribute("userNow");
			if(admin==null)
			{
			return "success";//此时的success表示普通用户验证失败
			}
			if(1==userService.userpower(admin.getUserid()))
			{
			return "failure";//验证成功
			}
			return "success";
			
		}
		public String execute2(){
			//获取参数
			HttpServletRequest request = ServletActionContext.getRequest();
			//数据库查询用户，并检验当前用户是否激活
			User admin = (User) userService.adminlogin(request.getParameter("adminname"),request.getParameter("adminpassword"));
			if(admin==null)
				{request.setAttribute("form",CommonUtils.toBean(request.getParameterMap(), User.class));
				return "failure";//通知用户该账户用户名与密码不匹配或者尚未激活
				}
			else
				//将此user对象存入session，已保存登陆状态
				request.getSession().setAttribute("userNow",admin);
			return "success";
		}
}
