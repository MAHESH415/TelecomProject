/**
 * 
 */
package com.sathyatel.customedetails.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sathyatel.customedetails.entity.Customer;

/**
 * @author SOMAPANGU MAHESH
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	@Query(value = "select count(*) from customer where phone_no=? and password=?", nativeQuery = true)
	Integer customerCount(Long phoneNo, String password);
}
