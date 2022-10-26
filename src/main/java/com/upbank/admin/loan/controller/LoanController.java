package com.upbank.admin.loan.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.upbank.admin.loan.service.BoardServiceImpl;
import com.upbank.admin.loan.service.DepositServiceImpl;
import com.upbank.admin.loan.service.LoanServiceImpl;
import com.upbank.admin.loan.vo.BoardVO;
import com.upbank.admin.loan.vo.DepositVO;
import com.upbank.admin.loan.vo.LoanProductVO;

@RestController
@RequestMapping(value="/api")
@CrossOrigin("http://localhost:8040/")
public class LoanController {
	@Autowired
	private LoanServiceImpl service;
	
	@Autowired
	private DepositServiceImpl service2;
	
	@Autowired
	private BoardServiceImpl serviceB;
	
	@GetMapping(value="/loan_product")
	public List<LoanProductVO> fetchMember() {
		return service.listAll();
	}
	
	@RequestMapping(value = "/product_detail", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getDetail(@RequestParam String loan_num, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		String resultMsg = "";
		String result = "";
		LoanProductVO resultVo = null;
		
		try {
			if(loan_num != null) {
				resultVo = service.get(Integer.parseInt(loan_num));
				resultMsg = "상품 상세 조회에 성공했습니다.";
				result = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();

			resultMsg = "상품 상세 조회에 실패했습니다.";
			result = "fail";
			resultVo = null;
		}

		map.put("result", result);
		map.put("detail", resultVo);
		map.put("resultMsg", resultMsg);
		System.out.println("response data: " + map);
		
		return map;
	}
	
	// 예금
	@GetMapping(value="/deposit_product")
	public List<DepositVO> DepositList() {
		return service2.listAll();
	}	
	
	// 고객센터
	//http://localhost:8040/api/noticeList
	@GetMapping(value="/noticeList")
	public List<BoardVO> noticeList() {
		return serviceB.listAll();
	}
	
	@RequestMapping(value = "/noticeDetail", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getNoticeDetail(@RequestParam String n_no, Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		String resultMsg = "";
		String result = "";
		BoardVO resultVo = null;
		
		try {
			if(n_no != null) {
				resultVo = serviceB.get(Integer.parseInt(n_no));
				resultMsg = "상품 상세 조회에 성공했습니다.";
				result = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();

			resultMsg = "상품 상세 조회에 실패했습니다.";
			result = "fail";
			resultVo = null;
		}

		map.put("result", result);
		map.put("detail", resultVo);
		map.put("resultMsg", resultMsg);
		System.out.println("response data: " + map);
		
		return map;
	}
	

}
