package com.yi;

import java.sql.Date;
import java.time.LocalDate;

//회원 (한 명분의) 정보 저장용 자료형 클래스

public class TB_MemberDTO {

	// 이름, 전화번호, 이메일, 등록일(yyyy-MM-dd)
	// 회원 한 명의 정보 중에서 복수개의 자료(->컬렉션)가 있는지 확인 필요
	private String m_no;
	private String m_name;
	private String m_date;
	private String m_phoneNum;
	private String m_addr;
	private String m_registdate;
	
	public String getM_no() {
		return m_no;
	}
	public void setM_no(String m_no) {
		this.m_no = m_no;
	}
	
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	
	public String getM_phoneNum() {
		return m_phoneNum;
	}
	public void setM_phoneNum(String m_phoneNum) {
		this.m_phoneNum = m_phoneNum;
	}
	
	public String getM_addr() {
		return m_addr;
	}
	public void setM_addr(String m_addr) {
		this.m_addr = m_addr;
	}
	
	public String getM_registdate() {
		return m_registdate;
	}
	public void setM_registdate(String m_registdate) {
		this.m_registdate = m_registdate;
	}
	
	
}