/**
 * 
 */
package com.sathyatel.plandetails.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathyatel.plandetails.dto.PlanDto;
import com.sathyatel.plandetails.entity.Plan;
import com.sathyatel.plandetails.repository.PlanDetailsRepository;
import com.sathyatel.plandetails.servicee.IPlanService;

/**
 * @author SOMAPANGU MAHESH
 *
 */
@Service
public class PlanDetailsServiceImpl implements IPlanService {

	
	@Autowired
	private PlanDetailsRepository  planDetailsRepository;

	
	

	@Override
	public Plan savePlanDetails(Plan plan) {
		
		return planDetailsRepository.save(plan);
	} 

	
	
	
	
	@Override
	public List<PlanDto> getAllPlans() {
		
	List<Plan> planDetailsList=planDetailsRepository.findBy();
	
	List<PlanDto>  planDetailsdtolist=new ArrayList<PlanDto>();
	
	for(Plan  planDetails:planDetailsList) {
		
		PlanDto planDetailsDto=new PlanDto();
		
		BeanUtils.copyProperties(planDetails, planDetailsDto);
		
		planDetailsdtolist.add(planDetailsDto);
		
	}
	return planDetailsdtolist;
	}

	
	
	
	
	
	
	@Override
	public PlanDto getPlanId(String planId) {
		
	Plan planDetails =planDetailsRepository.findByPlanId(planId);
		           
	PlanDto planDetailsDto=new PlanDto();
		
	BeanUtils.copyProperties(planDetails, planDetailsDto);
		
		return planDetailsDto;
	}

	
	
	
	
	
	/*
	 * @Override public List<CallDetailsDto> getCallDetailsByPhoneNumber(Long
	 * calledBy) { return null; }
	 */

}