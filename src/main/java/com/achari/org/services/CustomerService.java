package com.achari.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achari.org.dao.CustomerRepository;
import com.achari.org.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repo;
	public List<Customer> getAllCustomer() {
		
		List<Customer> list = repo.findAll();
		return list;
	}
//public List<Customer> getCustomer(id) {
//		
//		List<Customer> list = repo.findById(id);
//		return list;
//	}
	
	public Customer saveCustomer(Customer c)
	{
		repo.save(c);
		return c;
	}

	public void deleteById(int id)   
		{  
		repo.deleteById(id);
		}

	public void updateCustomer(Customer customer, int id)   
	{  
	  repo.save(customer);
	}

	public Customer getCustomerById(int id) {
		return repo.findById(id).get();
	}  
	
}

