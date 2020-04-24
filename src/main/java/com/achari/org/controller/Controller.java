package com.achari.org.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achari.org.entity.Product;


@RestController
@CrossOrigin("*")
public class Controller {


	@RequestMapping("/helloworld")
	public String greet()
	{
		return "Greetings";
	}
//	@RequestMapping("/getProducts")
//	public List<Product> get()
//	{
//		
////		Product p= new Product();
//		
//		List<Product> listProduct = new ArrayList<Product>();
//		listProduct.add(new Product("Pen","10","Wring Ball Pen"));
//		listProduct.add(new Product("NoteBook","50","Rough NoteBook"));
//		listProduct.add(new Product("Bag","150","School Bag"));
//		
////		HashMap<String,String> m = new HashMap<String,String>();
////		m.put("productName","Pen");
////		m.put("productPrice","100");
////		m.put("productDescription","writing");
////		return  m;;
//		return listProduct;
//	}
	@RequestMapping("/Howareyou")
	public String Howru()
	{
		return "I am fine";
	}
	@RequestMapping("/sum")
	public int sum()
	{
		return 10;
	}
	
	
}
