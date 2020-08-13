class Ex8_1 {
	public static void main(String args[]) {
			int[] arr = new int[3];
			try { // arr의 범위를 넘는 값을 고의적으로 입력받고 예외를 발생시킨다.
				for (int i=0 ; i<arr.length+1 ; i++) {
					arr[i] = i+1;
					System.out.println(arr[i]);
				}
			} catch(ArrayIndexOutOfBoundsException e) {
				
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println();
			System.out.println(1);			
			try {
				System.out.println(2);
				System.out.println(3);
			} catch (Exception e)    {
				System.out.println(4);  // 실행되지 않는다.
			} // try-catch의 끝
			System.out.println(5);
	}
}