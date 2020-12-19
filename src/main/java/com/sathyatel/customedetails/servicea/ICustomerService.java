/**
 * 
 */
package com.sathyatel.customedetails.servicea;

import com.sathyatel.customedetails.dto.CustomerDto;
import com.sathyatel.customedetails.entity.Customer;
import com.sathyatel.customedetails.entity.Login;

/**
 * @author SOMAPANGU MAHESH
 *
 */
public interface ICustomerService {


	boolean registerCustomer(Customer customer);

	boolean loginCheck(Login login);

	CustomerDto getProfile(Long phoneNo); 
}
