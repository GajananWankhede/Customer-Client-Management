package com.achari.org.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achari.org.dao.LoanRepository;
import com.achari.org.entity.Loan;

@Service
public class LoanService {
    @Autowired
	LoanRepository repo;
	
	public List<Loan> getAllLoan()
	{
		
		return repo.findAll();
		
	}
	
	public Loan saveLoan(Loan l) {
		repo.save(l);
		return l;
	}

	public double getTotalLoan(Loan l)
	{
		
		double CI = l.getLoanAmount() * (Math.pow((1 + l.getInterestRate() / 100),l.getLoanTenure()));
    	return CI;
	}
}
