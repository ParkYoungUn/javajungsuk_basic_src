class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	
		MyMath MyM = new MyMath();
		long result6 = MyM.add(1L, 9L);
		int result7 = MyM.add(7, 4);
		long result8 = MyM.Math(2, 5);
		
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		MyM.test();
	}
 }

 class MyMath {
	 long add(long a, long b) {
			long result = a + b;
			return result;
		//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
		}
	int add(int a, int b) {
		int result = a+b;
		return result;
	}
	long subtract(long a, long b) {
		long result = a-b;
		return result; 
		}
	long multiply(long a, long b) {
		long result = a*b;
		return result; 
		}
	double divide(double a, double b) {
		return a / b;
	}
	
	long Math (long a, long b) {
		long k = add(a,b);
		long result = k-b ;
		return result ;
	}
	void test() {
		System.out.println("void");
	}
 }
