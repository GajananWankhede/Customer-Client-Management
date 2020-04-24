package com.achari.org.entity;

import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Product {

	public Product() {}
	public Product(Integer ID, String productName, String productPrice, String productDescription) {
		super();
		this.ID = ID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID",unique=true, nullable = false)
	Integer ID;

	@Column(name="PRODUCT_NAME")
	String productName;
	@Column(name="RPODUCT_PRICE")
	String productPrice;
	@Column(name="PRODUCT_DESCRIPTION")
	String productDescription;
	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}




}
