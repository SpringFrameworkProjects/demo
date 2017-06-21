package com.example.demo;

public class personDetails {
	private String userName;
	private String surName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	@Override
	public String toString() {
		return "personDetails [userName=" + userName + ", surName=" + surName + "]";
	}
	
}
