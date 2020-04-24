package com.achari.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achari.org.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	
}