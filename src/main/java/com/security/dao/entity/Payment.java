package com.security.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.security.dao.entity.base.BaseEntity;

@Entity
@Table(name="payments")
public class Payment extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(name="training_id")
	private Long trainingId;
	
	@Column(name="payment_status")
	private String paymentStatus;

	public Long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	

}
