package com.sathyatel.customedetails.dto;

public class PlanDto {
	private String planId;

	private String planName;

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

	public PlanDto() {
		super();
	}
}
