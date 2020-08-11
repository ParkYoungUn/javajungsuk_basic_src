package ch06;

public class Exercise6_18 {

	static boolean isNumber(String str) {
		
		for (int i = 0 ; i < str.length() ; i++ ) {
			char ch = str.charAt(i);
			if (!(ch >='0' && ch<='9')) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		
		System.out.println(str + "는 숫자입니까? "+isNumber(str));
		
		str = "123o";
		System.out.println(str + " 는 숫자입니까? "+isNumber(str));

	}

}
