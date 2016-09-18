package cn.zhangyi.csbbs.service.myItem;

import java.util.List;

import cn.zhangyi.csbbs.pojo.Blog;
import cn.zhangyi.csbbs.pojo.Reply;

public interface MyItemService {

	List<Reply> load(Integer page,String userid);

	Long scalar(String userid);
	
	
}