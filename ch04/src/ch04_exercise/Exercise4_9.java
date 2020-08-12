package ch04_exercise;

public class Exercise4_9 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		for (int i=0 ; i<5 ; i++) {
			sum +=(num%10);
			num/=10;
		}
		
		System.out.println("sum = " + sum);

	}

}
