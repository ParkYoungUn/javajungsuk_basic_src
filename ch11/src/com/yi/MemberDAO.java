package com.yi;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	private List<Member> members;	//멤버 객체를 넣는 List
	
	public MemberDAO() {
		this.members = new ArrayList<Member>();
		this.init();
	}
	private void init() {
		// Member 객체 생성 -> 컬렉션 저장
		// -> 출력 액션 작성시 경우의 수를 모두 가능할 수 있도록 최대한 다양한 자료 준비

		Member m1 = new Member();
		m1.setM_no("0001");
		m1.setM_name("박영운");
		m1.setM_date("961208");
		m1.setM_phoneNum("010-6777-6491");
		m1.setM_addr("경북 경주시");
		
		this.members.add(m1);
	}
	
	// 전체 자료 반환 메소드
	// 리턴자료형은 자료 저장소 자료형과 일치
	// 매개변수는 외부에서 전달되는 자료(검색 조건 등)를 받을 때 사용
	public List<Member> memberList() {
		List<Member> result = null;

		// 전체 자료 반환 액션 추가
		// ->저장소 종류에 따라 다른 액션 필요
		result = this.members;

		// 메소드의 리턴자료형이 void가 아니라면 return 구문 필수
		return result;
	}
	
	// 회원 정보 저장 메소드
	public void memberAdd(Member m) throws Exception {

		// 전달받은 Member 객체를 저장소에 저장하는 액션 구현
		// ->중복된 회원인 경우(이름 and 전화번호 and 이메일)인 경우 예외 처리 -> throw, throws
		if (this.memberCheck(m)) {
			this.members.add(m);

		} else {
			throw new Exception("이미 존재하는 회원입니다. 이름 전화번호 이메일 일치");
		}

	}
	
	// 중복 회원 검사 private 메소드
	private boolean memberCheck(Member m) {
		boolean result = true; // 초기값은 true 지정

		// 기존 회원들의 정보와 전달받은 Member 객체의 정보를 비교하는 과정 추가
		for (Member member : this.members) {
			 if (	
					member.getM_no().equals(m.getM_no()) && 
					member.getM_name().equals(m.getM_name()) &&
					member.getM_date().equals(m.getM_date()) &&
					member.getM_phoneNum().equals(m.getM_phoneNum()) && 
					member.getM_addr().equals(m.getM_addr())
				) {
				result = false;
			}
		}
		return result;
	}
	
	// 검색 결과 자료 반환 메소드
	// 리턴자료형은 자료 저장소 자료형과 일치
	// 매개변수는 외부에서 전달되는 자료(검색 조건 등)를 받을 때 사용
	public List<Member> memberList(String key, String value) throws Exception {
		List<Member> result = new ArrayList<Member>();

		// 문제)
		// 검색 결과 반환 액션 추가
		// ->저장소 종류에 따라 다른 액션 필요
		// ->key(검색 기준), value(검색 대상)를 분석해서 검색 진행
		// ->부분 검색 진행 가능하도록 액션 구현 -> equals() X -> contains() O

			for (Member m : this.members) {
				// 이름 기준 검색
				boolean test= key.equals("m_no");
				
				if (key.equals("m_no") && m.getM_no().equals(value)) {
					result.add(m);
					// 번호 기준
				}
				else if (key.equals("M_name") && m.getM_name().equals(value)) {
					result.add(m);
					// 이름 기준
				} else if (key.equals("M_date") && m.getM_date().contains(value)) {
					result.add(m);
					// 생년월일 기준
				} else if (key.equals("M_phone") && m.getM_phoneNum().contains(value)) {
					result.add(m);
					// 전화번호 기준
				} else if (key.equals("M_addr") && m.getM_addr().contains(value)) {
					result.add(m);
				}
			}
			//예외 처리 추가
			//->검색 결과가 없는 경우
			if(result.isEmpty())
				throw new Exception("검색결과가 없습니다.");
			// 메소드의 리턴자료형이 void가 아니라면 return 구문 필수
			return result;
	}
}


