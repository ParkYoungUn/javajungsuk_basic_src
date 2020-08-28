package rambda;

public class MyRambda {

	interface MyInterface {
	    void test();
	}
	interface MyType{
		void hello();
	}
	interface MyType2{
		void hello(String message);
	}
	interface YourType {
		void talk(String msg);
	}
	
	public static void main(String[] args) {

		MyInterface my1 = new MyInterface() { //new 키워드로 객체 직접 대입
			
				@Override
				public void test() { // 메소드까지 클래스에 기재하는 것처럼 선언 -> 비용심화
					System.out.println("테스트 입니다.");
				}
			};
			my1.test();
			
		MyType my2 = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("안녕하세요.");
			}
		};
		my2.hello();
		
		MyType my3 = () -> {
			System.out.println("박영운 입니다.");
		};
		my3.hello();
		
		MyType2 my4 = (String message) -> {
			System.out.println("hello");
			System.out.println("I'm "+message);
			System.out.println("감사합니다.");
		};
		my4.hello("박영운");
		
		(int num) -> {System.out.println()};
		YourType you = (String name) -> { System.out.printf("내이름은 %s입니다.",name); }
		you.talk("홍길동");
		
	}

}
