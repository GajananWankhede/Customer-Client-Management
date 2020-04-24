package com.achari.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.achari.org.entity.Customer;
import com.achari.org.entity.Loan;
import com.achari.org.services.CustomerService;
import com.achari.org.services.LoanService;

@RestController
@CrossOrigin("*")
public class LoanController {
	@Autowired
	private LoanService ls;
	
	@RequestMapping("/getLoan")
	public List<Loan> getLoan()
	{
		return ls.getAllLoan();
    }
	@PostMapping("/saveLoan")
	@ResponseBody
	public Loan saveLoan(@RequestBody Loan l)
	{
		return ls.saveLoan(l);
	}
	@PostMapping("/calculateLoanAmount")
	public double calculateLoanAmount(@RequestBody Loan l)
	{
		return ls.getTotalLoan(l);
	}
}