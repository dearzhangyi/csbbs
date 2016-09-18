package cn.zhangyi.csbbs.pojo;

import java.util.Date;


public  class Blog {
     private String userid;
     private String blogid;
	 private String content;
     private Date starttime;
     private Integer install;
     private String topic;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getBlogid() {
		return blogid;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public void setBlogid(String blogid) {
		this.blogid = blogid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Integer getInstall() {
		return install;
	}
	public void setInstall(Integer install) {
		this.install = install;
	}
    
}