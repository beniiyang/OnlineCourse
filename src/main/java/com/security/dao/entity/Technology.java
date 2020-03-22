package com.security.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.security.dao.entity.base.BaseEntity;

@Entity
@Table(name="technologies")
public class Technology extends BaseEntity{

	private static final long serialVersionUID = 1L;

	@Column(name="tech_name")
	private String techName;

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}
	

}
