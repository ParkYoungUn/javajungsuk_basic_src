import java.util.Scanner;

class Ex4_6 {
	public static void main(String[] args) { 
		System.out.print("몇월이냐.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();  // ȭ���� ���� �Է¹��� ���ڸ� month�� ����

		switch(month) {
			case 3: 
			case 4: 
			case 5:
				System.out.println("봄.");
				break;
			case 6: case 7: case 8:
				System.out.println("여름.");
				break;
			case 9: case 10: case 11:
				System.out.println("가을.");
				break;
			case 12:	case 1: case 2:
				System.out.println("겨울.");
			default:
				break;
		}
	} // main�� ��
}