package Starcraft;

class Tank extends Unit implements Repairable, Boardable, countUp {
	Tank() {
		super(150);
	}

	public void move_sound() {
		System.out.println("yes sir");
	}

	public void attack_sound() {
		System.out.println("kwang");
	}

	public void mode_sound() {
		System.out.println("wung");
	}
	public void countUp() {
		
		for (int i=0 ; i<5 ; i++) {
			System.out.println(".. "+i);
			try {
			    Thread.sleep(500);
			} catch(InterruptedException e){
			    e.printStackTrace();
			}
		}
	}
}