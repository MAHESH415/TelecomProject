package com.sathyatel.plandetails.servicee;

import java.util.List;

import com.sathyatel.plandetails.dto.PlanDto;
import com.sathyatel.plandetails.entity.Plan;

public interface IPlanService {

	public Plan savePlanDetails(Plan plan);
	
	public List<PlanDto>  getAllPlans();
	
	public PlanDto getPlanId(String planId); 
	
	//public List<CallDetailsDto> getCallDetailsByPhoneNumber(Long calledBy);
	
	
	
}
