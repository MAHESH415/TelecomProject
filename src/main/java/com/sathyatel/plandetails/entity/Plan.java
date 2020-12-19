package com.sathyatel.plandetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plan {
	
      @Id
      @GeneratedValue(strategy = GenerationType.SEQUENCE)
	  private  String planId;
	  
	  private  String planName;
	  
	  private Integer validity;

	  
	  @Override
	public String toString() {
		return "PlanDetails [planId=" + planId + ", planName=" + planName + ", validity=" + validity + "]";
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

	public Plan() {
		super();
	}
}
