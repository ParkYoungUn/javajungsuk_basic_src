package Starcraft;

class FiarBat extends Unit implements Healable {
	
	FiarBat() {
		super(45);
	}
	
	public void move_sound() {
		System.out.println("���̾ �����δ�.!");
	}
	
	public void attack_sound() {
		System.out.println("�ҺҺҺ�");
	}

}
