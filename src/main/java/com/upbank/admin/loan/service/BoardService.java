package com.upbank.admin.loan.service;

import java.util.List;

import com.upbank.admin.loan.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> listAll();	// list
	public BoardVO get(int n_No);	// 1건 select
	
}
