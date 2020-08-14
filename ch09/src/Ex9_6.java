class Ex9_6 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		String str6 = "";
		char c = ' ';
		
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");

		System.out.println("str1 == str2 ?  " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();

		String str3 = new String("abc");
		String str4 = new String("abc");

		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");

		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		
		
		String str5 ="abcd";
		System.out.println("String str1 = \"abc\"; "+str1.hashCode());
		System.out.println("String str2 = \"abc\"; "+str2.hashCode());
		System.out.println("String str3 = \"abc\"; "+str3.hashCode());
		System.out.println("String str5 = \"abcd\"; "+str5.hashCode());
		System.out.println("String str1 = \"abc\"; "+str1.toString());
	}
}