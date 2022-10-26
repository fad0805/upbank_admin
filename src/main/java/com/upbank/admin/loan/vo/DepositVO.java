package com.upbank.admin.loan.vo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity(name="deposit_product")
public class DepositVO {
	@Id
	private String y_name;	 // pk값
	
	
	private String ACCOUNT_TYPE;
    private double rate;          //금리(해지일에따라 금리변경) y_state상태에따른 이율계산 
    private String y_type;		 //예금종류 복리/단리  default 단리, 복리는 특별상품
    private int y_max_date;      //최대예금기간 최대 3년 1095일
    private int y_min_date;		 //최소예금기간 최소 1개월 30일
    private int y_min_price;     //최소예치금액 최소 10,000원
    private int y_max_price;     //최대예치금액 최대 50,000,000원
    private String y_summary;	 //상품한줄요약
    private String y_explanation;//예금설명
    private String y_notice;	 //유의사항
    private String y_fileimg; 	//파일업로드
    
    
	
	public String getY_name() {
		return y_name;
	}
	public void setY_name(String y_name) {
		this.y_name = y_name;
	}
	public String getACCOUNT_TYPE() {
		return ACCOUNT_TYPE;
	}
	public void setACCOUNT_TYPE(String aCCOUNT_TYPE) {
		ACCOUNT_TYPE = aCCOUNT_TYPE;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getY_type() {
		return y_type;
	}
	public void setY_type(String y_type) {
		this.y_type = y_type;
	}
	public int getY_max_date() {
		return y_max_date;
	}
	public void setY_max_date(int y_max_date) {
		this.y_max_date = y_max_date;
	}
	public int getY_min_date() {
		return y_min_date;
	}
	public void setY_min_date(int y_min_date) {
		this.y_min_date = y_min_date;
	}
	public int getY_min_price() {
		return y_min_price;
	}
	public void setY_min_price(int y_min_price) {
		this.y_min_price = y_min_price;
	}
	public int getY_max_price() {
		return y_max_price;
	}
	public void setY_max_price(int y_max_price) {
		this.y_max_price = y_max_price;
	}
	public String getY_summary() {
		return y_summary;
	}
	public void setY_summary(String y_summary) {
		this.y_summary = y_summary;
	}
	public String getY_explanation() {
		return y_explanation;
	}
	public void setY_explanation(String y_explanation) {
		this.y_explanation = y_explanation;
	}
	public String getY_notice() {
		return y_notice;
	}
	public void setY_notice(String y_notice) {
		this.y_notice = y_notice;
	}
	public String getY_fileimg() {
		return y_fileimg;
	}
	public void setY_fileimg(String y_fileimg) {
		this.y_fileimg = y_fileimg;
	}
	@Override
	public String toString() {
		return "DepositVO [ACCOUNT_TYPE=" + ACCOUNT_TYPE + ", y_name=" + y_name + ", rate=" + rate + ", y_type="
				+ y_type + ", y_max_date=" + y_max_date + ", y_min_date=" + y_min_date + ", y_min_price=" + y_min_price
				+ ", y_max_price=" + y_max_price + ", y_summary=" + y_summary + ", y_explanation=" + y_explanation
				+ ", y_notice=" + y_notice + ", y_fileimg=" + y_fileimg + ", getY_max_date()=" + getY_max_date()
				+ ", getY_min_date()=" + getY_min_date() + ", getY_min_price()=" + getY_min_price()
				+ ", getY_max_price()=" + getY_max_price() + ", getY_summary()=" + getY_summary()
				+ ", getY_explanation()=" + getY_explanation() + ", getY_notice()=" + getY_notice()
				+ ", getY_fileimg()=" + getY_fileimg() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

    

}
