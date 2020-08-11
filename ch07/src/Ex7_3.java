class Ex7_3 {
	public static void main(String args[]) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 { int x=10; }

class Child2 extends Parent2 {
	//int x = 100;
	void method() {
		int x=20;
		//this.x = 30;
		super.x = 15;
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}