package com.example.cache.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cache.Model.Customer;

@RestController
public class CustomerController {
	
	@RequestMapping("/customerinfo")  
	@Cacheable(value="customerInfo")  
	public List customerInformation()  
	{  
	System.out.println("customer information from cache");  
	//adding customer detail in the List  
	    List list=Arrays.asList(new Customer(5126890,"Vinoth","Current A/c", 450000.00),  
	                              new Customer(7620015,"Saravanan","Saving A/c", 210089.00)  
	                             );  
	return list;  
	}  
	
	
//	@GetMapping(value = "/cutomer/Id")
//	public String getById(Customer customer) {
//		return customer.getAccounttype();
//	}

}
