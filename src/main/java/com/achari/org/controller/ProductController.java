package com.achari.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.achari.org.entity.Product;
import com.achari.org.services.ProductService;


@RestController
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	@RequestMapping("/getProducts")
	public List<Product> getAllProducts()
	{
		return ps.getAllProduct();
	}
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestParam(value = "ID", required = true) int ID,@RequestParam String productName,@RequestParam String productPrice, @RequestParam String productDescription)
	{
		Product p=new Product(ID,productName,productPrice,productDescription);
		return ps.saveProduct(p);
	}

}
