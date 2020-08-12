package Starcraft;

class FiarBat extends Unit implements Healable {
	
	FiarBat() {
		super(45);
	}
	
	public void move_sound() {
		System.out.println("파이어벳 이동중!");
	}
	
	public void attack_sound() {
		System.out.println("불불불");
	}

}
