package com.sathyatel.plandetails.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sathyatel.plandetails.entity.Plan;

public interface PlanDetailsRepository extends CrudRepository<Plan , String > {

     List<Plan> findBy();
	
	 Plan findByPlanId(String planId);
	
}
