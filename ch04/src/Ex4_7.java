class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;

		// ��ȣ{} ���� ������ 5�� �ݺ��Ѵ�.
		for (int i = 1; i <= 5; i++) {
			num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
		}
	}
}