package com.upbank.admin.loan.vo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity(name="notice_tbl")
public class BoardVO {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int n_No;				//글번호
	
	private String n_title; //글제목
    private String n_content; 		//글내용
    private int n_readcnt; 	//글 조회수
    private Date n_regdate; //글작성일
    private String id; 	//글작성자
    private String n_show; //글삭제
	public int getN_No() {
		return n_No;
	}
	public void setN_No(int n_No) {
		this.n_No = n_No;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public int getN_readcnt() {
		return n_readcnt;
	}
	public void setN_readcnt(int n_readcnt) {
		this.n_readcnt = n_readcnt;
	}
	public Date getN_regdate() {
		return n_regdate;
	}
	public void setN_regdate(Date n_regdate) {
		this.n_regdate = n_regdate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getN_show() {
		return n_show;
	}
	public void setN_show(String n_show) {
		this.n_show = n_show;
	}
	
   
	
}
