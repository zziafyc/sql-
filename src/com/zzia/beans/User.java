package com.zzia.beans;

public class User {
	private int id;
	private String telephone;
	private String password;
	private String realName;
	private String nickName;
	private String sex;
	private int age;
	private int type;
	private String  image_url;
	private String qr_code_url ;
	public User() {
		super();
	}
	public User(int id, String telephone, String password, String realName,
			String nickName, String sex, int age, int type,
			String image_url, String qr_code_url) {
		super();
		this.id = id;
		this.telephone = telephone;
		this.password = password;
		this.realName = realName;
		this.nickName = nickName;
		this.sex = sex;
		this.age = age;
		this.type = type;
		this.image_url = image_url;
		this.qr_code_url = qr_code_url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String gettelephone() {
		return telephone;
	}
	public void settelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getQr_code_url() {
		return qr_code_url;
	}
	public void setQr_code_url(String qr_code_url) {
		this.qr_code_url = qr_code_url;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", telephone=" + telephone + ", password="
				+ password + ", realName=" + realName + ", nickName="
				+ nickName + ", sex=" + sex + ", age=" + age + ", type=" + type
				+ ", image_url=" + image_url + ", qr_code_url=" + qr_code_url
				+ "]";
	}
	
	

}
