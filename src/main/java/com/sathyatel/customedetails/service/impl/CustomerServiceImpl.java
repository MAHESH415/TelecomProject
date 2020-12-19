/**
 * 
 */
package com.sathyatel.customedetails.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathyatel.customedetails.dto.CustomerDto;
import com.sathyatel.customedetails.entity.Customer;
import com.sathyatel.customedetails.entity.Login;
import com.sathyatel.customedetails.repository.CustomerRepository;
import com.sathyatel.customedetails.servicea.ICustomerService;

/**
 * @author SOMAPANGU MAHESH
 *
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

	
	
	@Autowired
	private CustomerRepository customerRepository; 
	
	
	
	
	@Override
	public boolean registerCustomer(Customer customer) {

	boolean flag=customerRepository.existsById(customer.getPhoneNo());
		if(flag==true) {
			return false;
		}else {
			customerRepository.save(customer);
			return true;
		}
}

	
	
	
	
	@Override
	public boolean loginCheck(Login login) {

		int count=customerRepository.customerCount(login.getPhoneNo(), login.getPassword());
		 if(count==1) {
			 return true;
		 }else {
			 return false;
		 }
		 }

	
	
	
	
	@Override
	public CustomerDto getProfile(Long phoneNo) {

		Optional<Customer>  optional=customerRepository.findById(phoneNo);
		
		Customer  customerDetails=optional.get();
		
		
		CustomerDto customerDto=new CustomerDto();  
		
		BeanUtils.copyProperties(customerDetails, customerDto);
		
		
		return customerDto;
	}
}
