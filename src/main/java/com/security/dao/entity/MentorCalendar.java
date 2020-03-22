package com.security.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.security.dao.entity.base.BaseEntity;

@Entity
@Table(name="mentorCalendar")
public class MentorCalendar extends BaseEntity{

	private static final long serialVersionUID = 1L;

	@Column(name="user_id")
	private Long userId;
	
	@Column(name="star_time")
	private Date startTime;
	
	@Column(name="end_time")
	private Date endTime;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	
	
	
}
