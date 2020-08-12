package Starcraft;



abstract class Unit {
	public abstract void move_sound();

	public abstract void attack_sound();

	//public abstract void chack();
	
	public void ok_sound() {
		System.out.println("Ok!!");
	}

	final int MAX_HP;
	int hitPoint;

	Unit(int hp) {
		MAX_HP = hp; // max hp 값
	}

}