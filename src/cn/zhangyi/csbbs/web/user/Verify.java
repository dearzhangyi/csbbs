package cn.zhangyi.csbbs.web.user;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.itcast.commons.CommonUtils;
import cn.zhangyi.csbbs.pojo.User;
import cn.zhangyi.csbbs.service.user.UserService;

//传统servlet
public class Verify {
	public Verify(){
		
	}
	public String execute() throws IOException{
		// ajax验证码是否正确校验
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse res = ServletActionContext.getResponse();
			/*
			 * 1. 获取输入框中的验证码
			 */
			String verifyCode = req.getParameter("verifyCode");
			/*
			 * 2. 获取图片上真实的校验码
			 */
			String vcode = (String) req.getSession().getAttribute("vCode");
			/*
			 * 3. 进行忽略大小写比较，得到结果
			 */
			boolean b = verifyCode.equalsIgnoreCase(vcode);
			/*
			 * 4. 发送给客户端
			 */
			res.getWriter().print(b);
			return null;
		}
	
}
