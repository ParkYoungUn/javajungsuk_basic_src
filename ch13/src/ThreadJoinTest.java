
public class ThreadJoinTest {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "start");
		Runnable r = new MyRunnable();
		Thread thread = new Thread(r);
		thread.start();

		System.out.println(Thread.currentThread().getName() + "end");
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("쓰레드1단계");
		thread2();
	}
	
	public void thread2() {
		System.out.println("쓰레드2단계");
		thread3();
	}

	public void thread3() {
		System.out.println("쓰레드3단계");
	}
}