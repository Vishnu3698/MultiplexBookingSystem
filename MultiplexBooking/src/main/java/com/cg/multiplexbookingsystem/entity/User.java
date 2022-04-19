package com.cg.multiplexbookingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="User123")
public class User {
	@Id
	@Column(name="UserId")
	private long userId;
	private String userName;
	private String userType;
	private String email;
	private long mobileno;
	public User() {
		super();
	}
	public User(long userId, String userName, String userType, String email, long mobileno) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.email = email;
		this.mobileno = mobileno;
	}
	public User(long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", email=" + email
				+ ", mobileno=" + mobileno + "]";
	}
	
	
	

}
