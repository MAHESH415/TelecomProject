package com.sathyatel.plandetails.dto;


public class CallDetailsDto {

   private Long callId;
	
	private Long calledBy;
	
	private Long calledTo;
	
	private Long calledOn;
	
	private Double duration;
	
	private Long getCalledId;

	public CallDetailsDto() {
		super();
	}

	@Override
	public String toString() {
		return "CallDetailsDto [callId=" + callId + ", calledBy=" + calledBy + ", calledTo=" + calledTo + ", calledOn="
				+ calledOn + ", duration=" + duration + ", getCalledId=" + getCalledId + "]";
	}

	public Long getCallId() {
		return callId;
	}

	public void setCallId(Long callId) {
		this.callId = callId;
	}

	public Long getCalledBy() {
		return calledBy;
	}

	public void setCalledBy(Long calledBy) {
		this.calledBy = calledBy;
	}

	public Long getCalledTo() {
		return calledTo;
	}

	public void setCalledTo(Long calledTo) {
		this.calledTo = calledTo;
	}

	public Long getCalledOn() {
		return calledOn;
	}

	public void setCalledOn(Long calledOn) {
		this.calledOn = calledOn;
	}

	public Double  getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public Long getGetCalledId() {
		return getCalledId;
	}

	public void setGetCalledId(Long getCalledId) {
		this.getCalledId = getCalledId;
	}
	
}
