package Starcraft;

class Tank extends Unit implements Repairable, Boardable {
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
}