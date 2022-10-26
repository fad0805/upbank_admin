package com.upbank.admin.loan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upbank.admin.loan.vo.DepositVO;

@Repository
public interface DepositRepository extends JpaRepository<DepositVO, Integer> {

	
}