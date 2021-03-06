package cn.zhangyi.csbbs.pojo;


public  class User {


    // Fields    

     private String userid;
     private String userpassword;
     public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	 private String nickname;
	 private String username;
     private String email;
     private Integer rank;
     private String professional;
     private String industry;
     private String birthday;
     private String brief;
     private String address;
     private boolean status;


    // Constructors

    public boolean isStatus() {
		return status;
	}

	public String getNickname() {
		return nickname;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	/** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String userid, String username, String email, Integer rank) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.rank = rank;
    }
    
    /** full constructor */
    public User(String userid, String username, String email, Integer rank, String brief) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.rank = rank;
        this.brief = brief;
    }

   
    // Property accessors

    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRank() {
        return this.rank;
    }
    
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getBrief() {
        return this.brief;
    }
    
    public void setBrief(String brief) {
        this.brief = brief;
    }
   


}