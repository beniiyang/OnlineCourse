package com.security.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.security.dao.entity.base.BaseEntity;

@Entity
@Table(name="mentorSkills")
public class MentorSkill extends BaseEntity{

	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private Long userId;
	
	@Column(name="tech_id")
	private Long techId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getTechId() {
		return techId;
	}

	public void setTechId(Long techId) {
		this.techId = techId;
	}
	
	
	
}
