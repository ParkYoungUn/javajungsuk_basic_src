package Starcraft;

class DropShip extends Unit implements Repairable, Boardable {

	DropShip() {
		super(100);

	}

	public void move_sound() {
		System.out.println("");
	}

	public void attack_sound() {
		System.out.println("");

	}

	public void mode_sound() {
		System.out.println("");
	}

	public void tab(Boardable b) {
		Unit[] un = {new Marine(), new Medic(), new Scv(), new Tank(), new FiarBat()};
		for (int i = 0 ; i<un.length;i++) {
			//if (un[i] == )
			un[i].attack_sound();
			System.out.println("a");
		}
		System.out.println("ÅÂ¿üÁ´");
	}
	
	public void drop(Boardable b) {
		System.out.println("³»·ÈÁ´");
	}
}
