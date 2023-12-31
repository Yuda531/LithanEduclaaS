package com.lithan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "role_id")
	private String roleId;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	
	@Column(name = "created_at")
	private String createdAt;
	
	public Users() {}
	
	
	

	public Users(Long userId, String roleId, String email, String password, String createdAt) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.email = email;
		this.password = password;
		this.createdAt = createdAt;
	}






	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
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

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	
	

	
}
