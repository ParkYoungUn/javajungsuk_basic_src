class Ex7_12 {
	public class InstanceInner {
		int iv = 100;
//		static int cv = 100;            // 에러! static 변수를 선언할 수 없다.
		final static int CONST = 100; // final static은 상수이므로 허용
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 200; // static클래스만 static 멤버를 정의할 수 있다.
	}

	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;             // 에러! static변수를 선언할 수 없다. 
			final static int CONST = 300; // final static은 항수이므로 허용.
		}
		
	}

	Object myMethod2() {
		class LocalInner2 {
			int iv = 300;
//			static int cv = 300;             // 에러! static변수를 선언할 수 없다. 
			final static int CONST = 300; // final static은 항수이므로 허용.
		}
		
		Object li2 = new LocalInner2();
		return li2;
	}
	
	
	
	public static void main(String args[]) {
		
		Ex7_12 ex7 = new Ex7_12();
		//Object e = new myMethod2();
		
		ex7.myMethod2();
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}