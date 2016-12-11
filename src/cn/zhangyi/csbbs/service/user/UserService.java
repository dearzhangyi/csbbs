package cn.zhangyi.csbbs.service.user;

import cn.zhangyi.csbbs.pojo.User;

public interface UserService {
	public void save(User user);
	public User login(String username,String userpassword);
	public boolean isStatus(String username,String userpassword);
	public boolean activation(String userid);
	public User adminlogin(String username, String userpassword);
	public int userpower(String userid);
}