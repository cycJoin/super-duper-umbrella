package com.cn.base.common.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unlogin {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private int id;
   private String requestUrl;
   private char schemal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRequestUrl() {
		return requestUrl;
	}
	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}
	public char getSchemal() {
		return schemal;
	}
	public void setSchemal(char schemal) {
		this.schemal = schemal;
	}
	
   
}
