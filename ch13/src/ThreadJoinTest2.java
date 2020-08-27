public class ThreadJoinTest2 {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "start");
		Runnable r = new MyRunnable2();
		Thread thread = new Thread(r);
		thread.start();
		try {
			thread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName() + "end");
	}

}

class MyRunnable2 implements Runnable{

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