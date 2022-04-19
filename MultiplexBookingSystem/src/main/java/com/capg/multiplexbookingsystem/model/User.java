package com.capg.multiplexbookingsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId", nullable = false)
	private Long userId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "mobileNo", nullable = false)
	private long mobileNo;
	
	@Column(name = "usertype", nullable = false)
	private String userType;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String name, String email,String password, long mobileNo, String userType) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password= password;
		this.mobileNo = mobileNo;
		this.userType = userType;
	}

	public User(String name, String email,String password, long mobileNo, String userType) {
		super();
		this.name = name;
		this.email = email;
		this.password= password;
		this.mobileNo = mobileNo;
		this.userType = userType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", mobileNo=" + mobileNo + ", userType=" + userType + "]";
	}

//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo
//				+ ", userType=" + userType + "]";
//	}
	
	
	
}
