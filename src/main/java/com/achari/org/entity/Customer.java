package com.achari.org.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
 
	public Customer() {}
	public Customer(Integer id,String customerId,String customerName, String customerAddress, String customerEmail, String customerMobileNumber,String customerBirthDate,String customerGender) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerMobileNumber = customerMobileNumber;
		this.customerBirthDate = customerBirthDate;
		this.customerGender = customerGender;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name="CUSTOMER_ID")
	String customerId;
    @Column(name="CUSTOMER_NAME")
	String customerName;
	@Column(name="CUSTOMER_ADDRESS")
	String customerAddress;
	@Column(name="CUSTOMER_EMAIL")
    String customerEmail;
	@Column(name="MOBILE_NUMBER")
	String customerMobileNumber;
	@Column(name="CUSTOMER_BIRTH")
	String customerBirthDate;
	@Column(name="CUSTOMER_GENDER")
	String customerGender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerId() {
		return customerId;
		

	}
	public void setCustomer_ID(String customer_ID) {
		this.customerId = customer_ID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}
	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}
	public String getCustomerBirthDate() {
		return customerBirthDate;
	}
	public void setCustomerBirthDate(String customerBirthDate) {
		this.customerBirthDate = customerBirthDate;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	
}
