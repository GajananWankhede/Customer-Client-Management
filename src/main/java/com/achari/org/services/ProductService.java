package com.achari.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achari.org.dao.ProductRepository;
import com.achari.org.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public List<Product> getAllProduct()
	{
		
		Product p = new Product(10,"Pen","10","Wring Ball Pen");
		repo.save(p);
		return repo.findAll();
	}
	public Product saveProduct(Product p)
	{
		repo.save(p);
		return p;
	}

}
