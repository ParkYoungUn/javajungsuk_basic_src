package com.yi;

import java.util.List;
import java.util.Scanner;

public class SubMenu {
	// MemberDAO 클래스의 객체는
	// 모든 메소드에서 필요로 하는 객체이므로
	// private 필드로 등록
	private MemberDAO dao;
	
	// 필드의 자료형이 클래스이고, 객체 생성을 필요로 하는 경우
	// 생성자에서 처리
	public SubMenu() {
		this.dao = new MemberDAO();
	}
	
	// 1. 회원 정보 입력
	public void MemberInsert(Scanner sc) {
		// 기능 상세 설명

				// 1. 외부 입력 -> 이름, 전화번호, 이메일
				// 2. 임시 Member 객체 생성 -> 자료 저장 -> setter
				// 3. 자료 저장시 등록일(시스템의 오늘 날짜) 추가
				// 4. Member 객체를 저장소에 저장하기 위해서 MemberDAO 클래스의 특정 메소드 호출
				// 주의) '시스템의 오늘 날짜' 같은 저장소 자료와 관련이 없는 일부 기능 구현은 Util.java에 static 메소드로
				// 등록해서 사용.

		
				System.out.println("번호는? ");
				String m_no = sc.next();
				System.out.println("이름은? ");
				String m_name = sc.next();
				System.out.println("생년월일?");
				String m_date = sc.next();
				System.out.println("전화번호는?");
				String m_phonenum = sc.next();
				System.out.println("주소는?");
				String m_addr = sc.next();
				
				try {
					Member m = new Member();
					m.setM_no(m_no);
					m.setM_name(m_name);
					m.setM_date(m_date);
					m.setM_phoneNum(m_phonenum);
					m.setM_addr(m_addr);
					//m.setRegDate(regDate); // yyyy-M //yyyy-MM-dd
					dao.memberAdd(m); // 예외 발생 가능
					System.out.println("회원 1명이 추가되었습니다.");

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
	
	// 2. 회원 정보 (전체)출력
	public void Print() {
		// Test 클래스에서 테스트한 결과를 확인하고,
		// 소스 코드 작성
		List<Member> members = dao.memberList();
		this.memberPrint(members);
	}
	
	private void memberPrint(List<Member> members) {

		// 건수 출력
		System.out.printf("총: %s건%n", members.size());
		// 명단 출력
		System.out.println("--------------------------");
		for (Member m : members) {
			System.out.printf("%s %s %s %s %s%n", 
					m.getM_no(),
					m.getM_name(),
					m.getM_date(),
					m.getM_phoneNum(), 
					m.getM_addr());
		}
		System.out.println("--------------------------");
		System.out.println();

	}
	
	// 3. 회원 정보 검색
	public void Search(Scanner sc) {
			// 서브 메뉴 구성 -> 무한 실행

		while (true) {

			// 메인 메뉴 출력
			System.out.println("--------------------------------");
			System.out.println("3. 회원 정보 검색");
			System.out.println("--------------------------------");
			System.out.println("1. 번호 기준 2. 이름 기준  3. 생년월일  4.전화번호  5.주소");
			System.out.print("선택(1~5, 0 quit)?");
			int menu = sc.nextInt();

				// break;
				if (menu == 0) {
					break;
				}

				// 메뉴별 액션 메소드 호출 -> switch 구문 사용
				switch (menu) {
					case 1:
						// 1. 번호 기준 -> 자기 자신 클래스의 특정 private 메소드 호출
						this.SearchNo(sc);
						break;
					case 2:
						// 1. 이름 기준 -> 자기 자신 클래스의 특정 private 메소드 호출
						this.SearchName(sc);
						break;
					case 3:
						// 1. 생년월일 기준 -> 자기 자신 클래스의 특정 private 메소드 호출
						this.SearchDate(sc);
						break;
					case 4:
						// 2. 전화번호 기준 -> 자기 자신 클래스의 특정 private 메소드 호출
						this.SearchPhoneNum(sc);
						break;
					case 5:
						// 3. 주소 기준 -> 자기 자신 클래스의 특정 private 메소드 호출
						this.SearchAddr(sc);
						break;
					default:
						System.out.println("잘못된 선택입니다.");
						break;
				}
			}
		}
		
		private void SearchNo(Scanner sc) {
			// 검색할 이름을 외부 입력 받고, 검색 요청 및 검색 결과를 출력하는 액션 추가
			// -> 동명이인 검색기능
			// ->key는 name, value는 외부 입력된 자료
			System.out.println("검색할 번호? ");
			String m_no = sc.next();

			try {
				this.memberPrint(dao.memberList("m_no", m_no));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		
		private void SearchName(Scanner sc) {
			// 검색할 이름을 외부 입력 받고, 검색 요청 및 검색 결과를 출력하는 액션 추가
			// -> 동명이인 검색기능
			// ->key는 name, value는 외부 입력된 자료
			System.out.println("검색할 이름? ");
			String m_name = sc.next();

			try {
				this.memberPrint(dao.memberList("M_name", m_name));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		
		private void SearchDate(Scanner sc) {
			// 검색할 이름을 외부 입력 받고, 검색 요청 및 검색 결과를 출력하는 액션 추가
			// -> 동명이인 검색기능
			// ->key는 name, value는 외부 입력된 자료
			System.out.println("검색할 생년월일은? ");
			String m_date = sc.next();

			try {
				this.memberPrint(dao.memberList("M_date", m_date));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		
		private void SearchPhoneNum(Scanner sc) {
			// 검색할 전화번호를 외부 입력 받고, 검색 요청 및 검색 결과를 출력하는 액션 추가
			// ->부분 문자열 검색 기능
			// ->key는 phone, value는 외부 입력된 자료
			System.out.println("검색할 전화번호? ");
			String m_phone = sc.next();
			try {
				this.memberPrint(dao.memberList("M_phone", m_phone));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		
		private void SearchAddr(Scanner sc) {
			// 검색할 전화번호를 외부 입력 받고, 검색 요청 및 검색 결과를 출력하는 액션 추가
			// ->부분 문자열 검색 기능
			// ->key는 phone, value는 외부 입력된 자료
			System.out.println("검색할 주소는? ");
			String m_addr = sc.next();
			try {
				this.memberPrint(dao.memberList("M_addr", m_addr));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

				
	
}
