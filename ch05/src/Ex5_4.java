import java.util.Arrays;

class Ex5_4 {
	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<100 ; i++) {
			int random = (int)(Math.random()*10);
			int tmp = arr[0];
			arr[0] = arr[random];
			arr[random] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
	} // main�� ��
}