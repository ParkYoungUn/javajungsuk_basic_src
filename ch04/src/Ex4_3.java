import java.util.Scanner; // ScannerŬ������ ����ϱ� ���� �߰�

class Ex4_3 {
	public static void main(String[] args) {  
		System.out.print("숫자 하나를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� input�� ����
		if(input==0) {
			System.out.println("입력하신 숫자는 0 입니다.");	
		} else { // input!=0�� ���
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		
		System.out.print("문자를 입력하세요.>");
		String str = scanner.next();
		if(str.equals("abc")) {
			System.out.println("입력하신 문자는 abc 입니다.");	
		} else { // input!=0�� ���
			System.out.println("입력하신 문자는 abc가 아닙니다.");
		}
		
		System.out.print("실수 하나를 입력하세요.>");
		double dobl = scanner.nextDouble();
		if(dobl == 10.1) {
			System.out.println("입력하신 숫자는 10.1 입니다.");	
		} else { // input!=0�� ���
			System.out.println("입력하신 문자는 10.1 이 아닙니다.");
		}
		
		System.out.print("2. 문자를 입력하세요.>");
		String str1 = scanner.nextLine();
		str1 = scanner.nextLine();
		if(str1.equals("가 나 다")) {
			System.out.println("입력하신 문자는 가 나 다 입니다.");	
		} else { // input!=0�� ���
			System.out.println("입력하신 문자는 가 나 다 가 아닙니다.");
		}
	} // main�� ��
}