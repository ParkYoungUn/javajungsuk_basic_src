class Ex6_2 {
	public static void main(String args[]) {
		
		Tv t1 = new Tv();  // Tv t1; t1 = new Tv();�� �� �������� ����
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7;    // channel ���� 7���� �Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");

		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		Tv T[] = new Tv[3];
		T[0] = new Tv();
		T[1] = new Tv();
		T[2] = new Tv();
		
		T[0].channel = 5;
		
		System.out.println("T�� channel���� " + T[0].channel + "�Դϴ�.");
		System.out.println("T�� channel���� " + T[1].channel + "�Դϴ�.");
		System.out.println("T�� channel���� " + T[2].channel + "�Դϴ�.");
		
		System.out.println(T);
	}
}