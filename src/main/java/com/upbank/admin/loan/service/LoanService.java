package com.upbank.admin.loan.service;

import java.util.List;

import com.upbank.admin.loan.vo.LoanProductVO;

public interface LoanService {
	public List<LoanProductVO> listAll();	// list
	public LoanProductVO get(int loan_num);	// 1건 select
}
