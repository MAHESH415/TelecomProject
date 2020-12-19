package com.sathyatel.customedetails.dto;

import java.util.List;

public class CustomerDto {
	private Long phoneNo;
	private String name;
	private String password;
	private String planId;
	private PlanDto palnDto;
	private List<Long> friendsContactnumbers;

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public PlanDto getPalnDto() {
		return palnDto;
	}

	public void setPalnDto(PlanDto palnDto) {
		this.palnDto = palnDto;
	}

	public List<Long> getFriendsContactnumbers() {
		return friendsContactnumbers;
	}

	public void setFriendsContactnumbers(List<Long> friendsContactnumbers) {
		this.friendsContactnumbers = friendsContactnumbers;
	}

	@Override
	public String toString() {
		return "CustomerDto [phoneNo=" + phoneNo + ", name=" + name + ", password=" + password + ", planId=" + planId
				+ ", palnDto=" + palnDto + ", friendsContactnumbers=" + friendsContactnumbers + "]";
	}

}
