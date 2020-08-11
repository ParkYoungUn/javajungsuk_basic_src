class Ex6_2 {
	public static void main(String args[]) {
		
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;    // channel 값을 7으로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");

		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		Tv T[] = new Tv[3];
		T[0] = new Tv();
		T[1] = new Tv();
		T[2] = new Tv();
		
		T[0].channel = 5;
		
		System.out.println("T의 channel값은 " + T[0].channel + "입니다.");
		System.out.println("T의 channel값은 " + T[1].channel + "입니다.");
		System.out.println("T의 channel값은 " + T[2].channel + "입니다.");
		
		System.out.println(T);
	}
}