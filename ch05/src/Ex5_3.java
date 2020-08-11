class Ex5_3 { 
	public static void main(String[] args) { 
		int[] arr = new int[] {};
		int[] score = {100,90,80,70,60,50,40,30,20,10};
		int max = score[0];
		int min = score[0];
		
		for (int i=0 ; i<score.length ; i++) {
			if (score[i] > max) {
				max = score[i];
			} else {
				min = score[i];
			}
		}
		
		System.out.println("최대값은: "+max);
		System.out.println("최솟값은: "+min);
		
	} // end of main 
} // end of class