class Ex5_2 {
	public static void main(String[] args) {
		int sum = 0;
		float avg = 0;
		int[] arr = new int[] {50,50,50,50,50};
		
		for(int i = 0 ; i<arr.length ; i++) {
			sum+=arr[i];
		}
		avg = sum/arr.length;
		
		System.out.println("Че: "+sum);
		System.out.println("ЦђБе: "+avg);
	}
}