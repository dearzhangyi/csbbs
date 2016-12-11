package cn.zhangyi.csbbs.pojo;

public class Blog {
	 private String owner;
     private String userid;
     private String blogid;
	 private String content;
	 private String introduction;
	 private String image;
     private String starttime;
     private String year;
 	 private String month;
 	 private String day;
     private Integer install;
     private String topic;
     private String tag;
	public String getUserid() {
		return userid;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getImage() {
		return image;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
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
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public Integer getInstall() {
		return install;
	}
	public void setInstall(Integer install) {
		this.install = install;
	}
    
}