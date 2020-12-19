package com.sathyatel.plandetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sathyatel.plandetails.dto.PlanDto;
import com.sathyatel.plandetails.entity.Plan;
import com.sathyatel.plandetails.servicee.IPlanService;

@RestController
public class PlanDetailsController {
 
	@Autowired
	private IPlanService  planDetailsService; 
	
	
	
	@PostMapping("/saveplanDetails")
	public Plan savePAlnDetails(@RequestBody Plan plan) {
		
		return planDetailsService.savePlanDetails(plan);
	}
	
	
	
	@GetMapping(value="/getallplans",produces = "application/json")
	public List<PlanDto> getAllPlans() {
		
		return planDetailsService.getAllPlans();
	}
	
	
	@GetMapping(value = "/getOnePlan/{planId}",produces = "application/json" )
	public PlanDto getPlanId(@PathVariable String planId) {
		
		return planDetailsService.getPlanId(planId);
	}
	
	
}
