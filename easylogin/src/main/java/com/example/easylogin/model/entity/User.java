package com.example.easylogin.model.entity;

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
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="user_name")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="full_name")
	private String fullName;
	
	
	public long getID() {
		return id;
	}
	public void setID(long id) {
		this.id = id;
	}
	public String getUserName() {
		return username;
	}
	public void setuserName(String username)
	{
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
