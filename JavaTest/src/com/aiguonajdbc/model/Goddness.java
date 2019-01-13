package com.aiguonajdbc.model;

import java.util.Date;

public class Goddness {
	
	private Integer id;
	private String uesr_name;
	private Integer sex;
	private Integer age;
	private Date birthdat;
	private String email;
	private String mobile;
	private String create_user;
	private String update_user;
	private Date create_date;
	private Date updata_data;
	private Integer isdel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUesr_name() {
		return uesr_name;
	}

	public void setUesr_name(String uesr_name) {
		this.uesr_name = uesr_name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthdat() {
		return birthdat;
	}

	public void setBirthdat(Date birthdat) {
		this.birthdat = birthdat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdata_data() {
		return updata_data;
	}

	public void setUpdata_data(Date updata_data) {
		this.updata_data = updata_data;
	}

	public Integer getIsdel() {
		return isdel;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}
}
