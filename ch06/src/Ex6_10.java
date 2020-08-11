class Ex6_10 {
	public static void main(String args[]) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:"    + mm.add(3,3));
		System.out.println("mm.add(3L, 3) 결과: "  + mm.add(3L,3));
		System.out.println("mm.add(3, 3L) 결과: "  + mm.add(3,3L));
		System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L,3L));

		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
		
		MyMath3 my1 = new MyMath3();
		MyMath3 my2 = new MyMath3(3);
		MyMath3 my3 = new MyMath3(3L);
		
		System.out.println(my1.b);
   }
}

class MyMath3 {
	int a, b;
	
	MyMath3(){
		a = 10;
		b = 20;
		System.out.println(""+a+b);
	};
	
	MyMath3(int c){
		a = c;
		b = 20;
		int result = a+b;
		System.out.println("MyMath3(int) "+result);
	};
	MyMath3(long c){
		a = 10;
		b = (int)c;
		System.out.printf("MyMath3(long) %d\n",a+b);
	};
	
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}

	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}

	int add(int[] a) {		// 배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0 ; i < a.length ; i++) 
			result += a[i];
		
		return result;
	}
}