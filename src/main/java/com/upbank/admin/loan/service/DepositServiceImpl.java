package com.upbank.admin.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upbank.admin.loan.dao.DepositRepository;
import com.upbank.admin.loan.dao.LoanRepository;
import com.upbank.admin.loan.vo.DepositVO;
import com.upbank.admin.loan.vo.LoanProductVO;

@Service
public class DepositServiceImpl implements DepositService {
	@Autowired
	private DepositRepository dao;
	
	@Override
	public List<DepositVO> listAll() {
		return dao.findAll();
	}
}
