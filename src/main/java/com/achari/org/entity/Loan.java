package com.achari.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loan {

    public Loan() {}
	public Loan(String bankName,int loanAmount, double interestRate,  double loanTenure) {
		super();
		this.bankName = bankName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanTenure = loanTenure;
	}
	
	@Id
	@Column(name="BANK_NAME")
	String bankName;
	@Column(name="LOAN_AMOUNT")
	Integer loanAmount;
	@Column(name="INTEREST_RATE")
	double interestRate;
	@Column(name="LOAN_TENURE")
	double loanTenure;
	
	

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(double loanTenure) {
		this.loanTenure = loanTenure;
	}

   
}
