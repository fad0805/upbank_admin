package com.upbank.admin.loan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upbank.admin.loan.vo.LoanProductVO;

public interface LoanRepository extends JpaRepository<LoanProductVO, Integer> {

}
