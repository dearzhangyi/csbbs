package cn.zhangyi.csbbs.web.myItem;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.zhangyi.csbbs.pojo.Reply;
import cn.zhangyi.csbbs.pojo.Page;
import cn.zhangyi.csbbs.pojo.User;
import cn.zhangyi.csbbs.service.myItem.MyItemService;

public class MyItemAction {
	public MyItemService myItemService;

	public MyItemService getMyItemService() {
		return myItemService;
	}

	public void setMyItemService(MyItemService myItemService) {
		this.myItemService = myItemService;
	}

	//single
	public String execute1() {
		// 获取参数
		HttpServletRequest request = ServletActionContext.getRequest();
		String userid=(String)((User) request.getSession().getAttribute("userNow")).getUserid();
		Integer pc =Integer.parseInt(request.getParameter("page"));
		
		Page page= new Page();
		page.setPc(pc);
		page.setTr(myItemService.scalar(userid));
		page.setUrl("/csbbs/myItem/single");
		request.setAttribute("page",page );
		List<Reply> replyList = myItemService.load(pc,userid);
		request.setAttribute("replyList", replyList);
		
		return "success";
	}
	//inner
	public String execute2() {
		return "success";
	}
}
