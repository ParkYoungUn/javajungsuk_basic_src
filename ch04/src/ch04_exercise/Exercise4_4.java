package ch04_exercise;

public class Exercise4_4 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		int t = 1;
		
		for (int i = 1 ; true ; i++, t=(-t)) {
			num = i*t;
			sum += num;
			
			if(sum == 100) {
				break;
			}
		}
		
		System.out.println("num= "+num);
		System.out.println("sum= "+sum);
		
	}

}
