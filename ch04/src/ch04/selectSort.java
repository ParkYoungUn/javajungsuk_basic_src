package ch04;

public class selectSort {

	public static void main(String[] args) {
		int arr[] = {66,10,1,99,5};
		int min;
		int temp;
		
		for (int c=0; c < arr.length ; c++) {
			System.out.printf(" %d",arr[c]);
		}
		for (int d=0; d<2;d++) {
		System.out.println("");
		}
		// 선택정렬
		for(int i=0 ; i < arr.length-1 ; i++) {
			min = i;
			for (int j=i+1; j < arr.length ;j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		
			for (int k=0; k <arr.length ; k++) {
				System.out.printf(" %d",arr[k]);
			}
			System.out.println("");
		}
	}
}
