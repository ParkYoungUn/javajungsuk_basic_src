package cloneEx;

class B implements Cloneable { // 보안때문에 clone 필요
	int i;
	int[] arr;

	B(int i) {
		this.i = i;
	}

	B(int i, int[] arr) {
		this(i);
		this.arr = arr;
	}

	B copy() throws CloneNotSupportedException {
		B copyObj = (B) this.clone();
		// arr.clone();
		int[] copyArr = (int[])arr.clone();
		copyObj.arr = copyArr;
		return copyObj;
	}
}

public class CloneTest2 {
	public static void main(String[] args) {
		B b1, b2 = null;
		b1 = new B(10, new int[] { 10, 20, 30 });
		try {
			b2 = b1.copy();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		b1.i = 99; // 원본의 값이 바뀌어도
		b1.arr[0] = 99;
		System.out.println("b1.arr[0]= " + b1.arr[0]); // 99
		System.out.println("b2.arr[0]= " + b2.arr[0]); // 10 다른번지의 복제된 다른 객체를 참조하기때문에 원본의 값은 변하지 않음
	}
}