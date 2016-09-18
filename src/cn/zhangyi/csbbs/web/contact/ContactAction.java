package cn.zhangyi.csbbs.web.contact;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.zhangyi.csbbs.pojo.Reply;
import cn.zhangyi.csbbs.pojo.Page;
import cn.zhangyi.csbbs.service.myItem.MyItemService;

public class ContactAction {
	public MyItemService myItemService ;
	

	public String execute1() {
		return "success";
	}

	public String execute2() {
		// 获取参数
		HttpServletRequest request = ServletActionContext.getRequest();
		
		Integer pc =Integer.parseInt(request.getParameter("page"));
		List<Reply> replyList = myItemService.load(pc,userid);
		request.setAttribute("replyList", replyList);
		Page page= new Page();
		page.setPc(pc);
		page.setTr(myItemService.scalar(userid));
		page.setUrl("/csbbs/reply/single");
		request.setAttribute("page",page );
		return "success";
	}
}
