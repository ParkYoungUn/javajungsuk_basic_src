package ch04_exercise;

public class Exercise4_7 {

	public static void main(String[] args) {
		String str = "abc";
		int sum = 0;
		int sum2 = 0;
		
		for (int i = 0; i<str.length();i++) {
			sum += Character.getNumericValue(str.charAt(i));
			sum2 += str.charAt(i)-'0' ;
			
		}
		System.out.println("sum = "+sum);
		System.out.println(sum2);
	} //98+97 -'0'

}
