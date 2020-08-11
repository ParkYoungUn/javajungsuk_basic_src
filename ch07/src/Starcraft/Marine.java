package Starcraft;

class Marine extends Unit implements Boardable, Healable {
	Marine() {
		super(40); // 마린의 max hp 값
	}

	public void move_sound() {
		System.out.println("gogogo");
	}

	public void attack_sound() {
		System.out.println("fire");
	}
	
	int speed=1;
	public void stimpack() {
		speed+=5;
		System.out.println(speed);
	}
}