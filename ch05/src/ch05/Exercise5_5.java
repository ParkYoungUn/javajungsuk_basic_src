package ch05;

public class Exercise5_5 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//�迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for (int i = 0 ; i <ballArr.length ; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			tmp = ballArr[0];
			ballArr[0] = ballArr[i];
			ballArr[i] = tmp;
		}
		
		//�迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		ball3[]
		
		for (int i=0 ; i<ballArr.length;i++) {
			System.out.print(ball3[i]);
		}
	}
}
