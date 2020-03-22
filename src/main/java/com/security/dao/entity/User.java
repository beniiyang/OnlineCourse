package com.security.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.security.dao.entity.base.BaseEntity;

@Entity
@Table(name="users")
public class User extends BaseEntity{

	private static final long serialVersionUID = 1L;

	@Column(name="user_name")
	private String useName;

	@Column(name="password")
    private String password;

	@Column(name="user_role")
    private String userRole;

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    
}