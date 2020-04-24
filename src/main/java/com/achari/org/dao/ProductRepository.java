package com.achari.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.achari.org.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	
}
