/**
 * 
 */
package com.sathyatel.customedetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sathyatel.customedetails.dto.CustomerDto;
import com.sathyatel.customedetails.dto.PlanDto;
import com.sathyatel.customedetails.entity.Customer;
import com.sathyatel.customedetails.entity.Login;
import com.sathyatel.customedetails.servicea.ICustomerService;

/**
 * @author SOMAPANGU MAHESH
 *
 */
@RestController
public class CustomerController {



	private static String plan_url="http://localhost:5588/plandetails/getOnePlan/{planId}";

	private static String friend_url="http://localhost:5577/frienddetails/getbyphoneno/{phoneNo}";



	@Autowired
	private ICustomerService customerService;

	@Autowired
	private RestTemplate restTemplate;






	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer customer) {

		boolean flag=customerService.registerCustomer(customer);

		if(flag==true) {
			return "customer is registred";
		}else {
			return "customer already exist";
		}

	}




	@PostMapping("/login")
	public boolean verifyLogin(@RequestBody Login login) {

		return customerService.loginCheck(login);
	}





	@GetMapping("/profile/{phoneNo}")
	public CustomerDto viewProfile(@PathVariable Long phoneNo) {

		CustomerDto customerDto=customerService.getProfile(phoneNo);


		//call plan details microservice 

		PlanDto planDto=restTemplate.getForObject(plan_url, PlanDto.class,customerDto.getPlanId());
		customerDto.setPalnDto(planDto);
		// call friend micro service   
		@SuppressWarnings("unchecked")
		List<Long>  friendNumbers= restTemplate.getForObject(friend_url, List.class,customerDto.getPhoneNo());	
		customerDto.setFriendsContactnumbers(friendNumbers);
		return customerDto; 		
	}		
}
