package ch06;

public class Exercise6_17 {

	int[] Shuffle (int[] arr) {
		
		for (int i = 0; i<arr.length;i++) {
			int j = (int)(Math.random()*arr.length);
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}//a
		
		return arr;
	}
	
		
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original)); 
		
		Exercise6_17 s = new Exercise6_17(); 
		int[] result = s.Shuffle(original);
		
		System.out.println(java.util.Arrays.toString(result));
		

	}

}
