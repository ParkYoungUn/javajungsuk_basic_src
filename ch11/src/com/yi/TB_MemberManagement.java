package com.yi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TB_MemberManagement {	
	
	public static void main(String[] args) {
		
		TB_MemberProc mm = new TB_MemberProc(); //MemberProc객체 생성
			
		while (true) {
			System.out.println();
			System.out.println("============== 회원 관리 프로그램 ==============");
			System.out.println("list. 회원목록");			
			System.out.println("insert. 회원등록 ");
			System.out.println("delete. 회원삭제");
			System.out.println("update. 회원정보 수정");
			System.out.println("exit. 종료");
			System.out.println("============== ============ ==============");
			System.out.print("메뉴를 입력하세요 : ");
		try {
				Scanner scn = new Scanner(System.in);
				String input = scn.nextLine();
				ArrayList<String> selector = new ArrayList<String>(5);
				selector.add("list");
				selector.add("insert");
				selector.add("delete");
				selector.add("update");
				selector.add("exit");
				
				if (!selector.contains(input)) {		// 배열 이외의 값이 입력되면 예외 강제 발생
					throw new InputMismatchException();
				}
					
				switch (input) {
				case "list"	  : mm.showMemberList(); break;
				case "insert" : mm.insertMember(); break;
				case "delete" : mm.deleteMember(); break;
				case "update" : mm.updateMember(); break;
				case "exit"   : 
					System.out.println("프로그램 종료.");
					System.exit(0);
				}
						
			} catch(InputMismatchException e) {
				System.out.println("잘못된 입력입니다. !!");
			}
			
//			int num=0;
//			try {
//				num = scn.nextInt();
//				if(!(num>0 && num<6)){ //1~6외의 숫자가 입력되면 예외 강제 발생
//					throw new InputMismatchException();
//				}
//			} catch (InputMismatchException e) {
//				System.out.println("입력된 값이 잘못되었습니다. [1-5] 메뉴늘 선택해주세요!");
//			}
//			
//			switch (num) {
//			case 1:
//				mm.showMemberList();//회원목록			
//				break;
//			case 2:
//				mm.insertMember(); //회원 등록
//				break;
//			case 3:
//				mm.deleteMember(); //회원 삭제				
//				break;
//			case 4:
//				mm.updateMember(); //회원 수정
//				break;
//			case 5:
//				System.out.println("프로그램을 종료합니다.");
//				System.exit(0); //프로그램 종료
//					
//			}//end switch()---------------
		}//while---------------------		
		
	}//main()--------------	
}//class MemberManagement
