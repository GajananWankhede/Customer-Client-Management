package com.achari.org.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.achari.org.entity.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer>{

}
