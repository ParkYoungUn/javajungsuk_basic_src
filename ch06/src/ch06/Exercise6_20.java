package ch06;

public class Exercise6_20 {

	/*max메서드 작성*/
	static int max(int[] arr) {
		if(arr == null || arr.length==0)
			return -99999;
		int max = arr[0];
		for (int i=0 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: "+max(data));
		System.out.println("최대값: "+max(null));
		System.out.println("최대값: "+max(new int[]{}));
	}

}
