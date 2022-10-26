package com.upbank.admin.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upbank.admin.loan.dao.LoanRepository;
import com.upbank.admin.loan.vo.LoanProductVO;

@Service
public class LoanServiceImpl implements LoanService {
	@Autowired
	private LoanRepository dao;
	
	@Override
	public List<LoanProductVO> listAll() {
		return dao.findAll();
	}

	@Override
	public LoanProductVO get(int loan_num) {
		return dao.findById(loan_num).get();
	}
	
}
