package com.upbank.admin.loan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upbank.admin.loan.vo.BoardVO;

public interface BoardRepository extends JpaRepository<BoardVO, Integer> {

}
