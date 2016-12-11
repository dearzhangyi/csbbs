package cn.zhangyi.csbbs.service.contact;

import java.util.List;

import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.Feedback;

public interface ContactService {
	
	public boolean feedback(Feedback feedback);
	public Feedback show(String feedbackid);

}