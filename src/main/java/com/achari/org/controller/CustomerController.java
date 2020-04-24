package com.achari.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.achari.org.entity.Customer;
import com.achari.org.services.CustomerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerController {
		
		@Autowired
		private CustomerService ps;
		
		@RequestMapping("/getCustomers")
		public List<Customer> getAllCustomer()
		{
			//int i = 10/0;
			return ps.getAllCustomer();
		}
		@GetMapping("/customer/{id}")  
		private Customer getCustomer(@PathVariable("id") int id)   
		{  
		return ps.getCustomerById(id);  
		}  
//		@PostMapping("/saveCustomer")
//		public Customer saveCustomer(@RequestParam String customerId,@RequestParam String customerName,@RequestParam String customerAddress,@RequestParam String customerEmail,@RequestParam String customerMobileNumber,@RequestParam String customerBirthDate,@RequestParam String customerGender)
//		{
//			Customer c=new Customer(customerId,customerName,customerAddress,customerEmail,customerMobileNumber,customerBirthDate,customerGender);
//			return ps.saveCustomer(c);
//    	}
		@PostMapping("/saveCustomer")
		@ResponseBody
		public Customer saveCustomer(@RequestBody Customer c)
		{
			//Customer c=new Customer(customerId,customerName,customerAddress,customerEmail,customerMobileNumber,customerBirthDate,customerGender);
			return ps.saveCustomer(c);
		}
			
		@DeleteMapping("/customer/{id}") 
		private void deleteCustomer(@PathVariable("id") int id)   
		{  
		     ps.deleteById(id);  
		} 
		@PutMapping("/")  
		private Customer update(@RequestBody Customer customer)   
		{  
			ps.updateCustomer(customer, 0);  
		    return customer;  
		}  
	
	}
