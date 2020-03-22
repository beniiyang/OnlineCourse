package com.security.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.security.dao.entity.base.BaseEntity;

@Entity
@Table(name="trainings")
public class Training extends BaseEntity{

	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private Long userId;
	
	@Column(name="mentor_user_id")
	private Long mentorUserId;
	
	@Column(name="tech_id")
	private Long techId;
	
	@Column(name="training_status")
	private String trainingStatus;

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

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	public Long getMentorUserId() {
		return mentorUserId;
	}

	public void setMentorUserId(Long mentorUserId) {
		this.mentorUserId = mentorUserId;
	}
	
	
}
