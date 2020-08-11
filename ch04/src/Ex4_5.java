import java.util.Scanner;

class Ex4_5 {
	public static void main(String[] args) { 
		int  score = 0;
		char grade = ' ', opt = '0';

		System.out.print("점수를 입력해주세요.>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ������ score�� ����

		System.out.printf("당신의 점수는 %d 입니다.\n", score);

		if (score >= 90) {           // score�� 90�� ���� ���ų� ũ�� A����(grade)
			grade = 'A';
			if (score >= 98) {        // 90�� �̻� �߿����� 98�� �̻��� A+
				opt = '+';	
			} else if (score < 94) {  // 90�� �̻� 94�� �̸��� A-
				opt = '-';
			}
		} else if (score >= 80){     // score�� 80�� ���� ���ų� ũ�� B����(grade)
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84)	{
				opt = '-';
			}
		} else {                     // �������� C����(grade)
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c %c 입니다.%n", grade, opt);
	}
}