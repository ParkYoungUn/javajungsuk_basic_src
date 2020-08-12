package ch04_exercise;

public class Exercise4_5 {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
			int j = 0;
			while (j <= i) {
				j++;
				System.out.print("*");
				
			}
			i++;
			System.out.println("");
		}
		
		// for 문을 while문으로 바꾸기.
		/* for (int i=0 ; i <= 10 ; i++) {
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		} */

	}

}
