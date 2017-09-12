package com.cn.base.common.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;


public class User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accountNo;
	private String userName;
	private String age;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	

}
