package com.yi;

import java.text.*;
import java.util.*;

public class MainMenu {

	public static void main(String[] args) {
		// (콘솔 환경) 외부 입력 처리 -> Scanner 클래스
		Scanner sc = new Scanner(System.in);
		
		// SubMenu 클래스의 객체 생성
		// -> 반복문 밖에 코드 작성
		// -> SubMenu 클래스의 특정 메소드 호출 준비
		SubMenu sub = new SubMenu();
		
		// 메인 메뉴 액션 처리 추가 -> 무한 실행
		while (true) {
			// 메인 메뉴 출력
			System.out.println("---------------------------------------------");
			System.out.println("1. 회원 정보 입력  2. 회원 정보 전체출력  3.회원 정보 검색▶");
			System.out.print("선택(1~3, 0 quit)?");
			int menu = sc.nextInt();
			// break;
			if (menu == 0) {
				break;
			}
			switch (menu) {
				case 1:
					// 1. 회원 정보 입력 -> SubMenu 클래스의 특정 메소드 호출
					System.out.println("1번 메뉴.");
					sub.MemberInsert(sc);
					break;
				case 2:
					// 1. 회원 정보 입력 -> SubMenu 클래스의 특정 메소드 호출
					System.out.println("2번 메뉴.");
					sub.Print();
					break;
				case 3:
					// 1. 회원 정보 입력 -> SubMenu 클래스의 특정 메소드 호출
					System.out.println("3번 메뉴.");
					sub.Search(sc);
					break;
				default:
					System.out.println("잘못된 선택입니다.");
					break;
			}
		}
		sc.close();
		System.out.println("프로그램 종료.");
	}
}