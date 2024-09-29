package com.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class User {
	@Id
	private String userId;
	private String userName;
	private String email;
	private String password;
	private LocalDate dob;
	private int loginStatus;
	
	public int getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String email, String password, LocalDate dob) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.dob = dob;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", password=" + password + ", dob=" + dob
				+ ", loginStatus=" + loginStatus + "]";
	}
}
