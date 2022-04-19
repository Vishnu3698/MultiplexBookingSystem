package com.capgemini.productmanagementapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller")


public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	  private String name;
	  private int password;
	  private String emailid;
	  private String location;
	public Seller() {
		super();
	}
	public Seller(Long id, String name, int password, String emailid, String location) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.emailid = emailid;
		this.location = location;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", password=" + password + ", emailid=" + emailid + ", location="
				+ location + "]";
	}
	  
	  
}
