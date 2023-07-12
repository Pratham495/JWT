package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USER_TB")
public class User {
	
	@Id
	private int id;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private String emailid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public User(int id, String username, String password, String emailid) {
		super();
		this.id = id;
		this.userName = username;
		this.password = password;
		this.emailid = emailid;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
