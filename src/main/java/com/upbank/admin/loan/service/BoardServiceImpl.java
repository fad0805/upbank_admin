package com.upbank.admin.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.upbank.admin.loan.dao.BoardRepository;
import com.upbank.admin.loan.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardRepository dao;
	
	@Override
	public List<BoardVO> listAll() {
		return dao.findAll();
	}

	@Override
	public BoardVO get(int n_No) {
		return dao.findById(n_No).get();
	}
	
}
