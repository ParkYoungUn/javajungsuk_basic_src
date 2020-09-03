package ch15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	FileStream fs = new FileStream(); //MemberProc객체 생성
		
	while (true) {
		System.out.println();
		System.out.println("============== 폴더 관리 프로그램 ==============");
		System.out.println("mkdir. 디렉토리생성");			
		System.out.println("rmdir. 회원등록 ");
		System.out.println("delete. 회원삭제");
		System.out.println("update. 회원정보 수정");
		System.out.println("exit. 종료");
		System.out.println("============== ============ ==============");
		System.out.print("메뉴를 입력하세요 : ");
	try {
			Scanner scn = new Scanner(System.in);
			String input = scn.nextLine();
			ArrayList<String> selector = new ArrayList<String>(5);
			selector.add("mkidr");
			selector.add("insert");
			selector.add("delete");
			selector.add("update");
			selector.add("exit");
			
			if (!selector.contains(input)) {		// 배열 이외의 값이 입력되면 예외 강제 발생
				throw new InputMismatchException();
			}
				
			switch (input) {
			case "mkdir"	  : fs.File_Mkdir(); break;
			case "rmdir" : fs.File_dirDelete(null);;; break;
			case "exit"   : 
				System.out.println("프로그램 종료.");
				System.exit(0);
			}
					
		} catch(InputMismatchException e) {
			System.out.println("잘못된 입력입니다. !!");
		}
	}	//while
}	//main()	
}
