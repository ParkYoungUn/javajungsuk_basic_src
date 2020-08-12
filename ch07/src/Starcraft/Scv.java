package Starcraft;

class Scv extends Unit implements Repairable, Boardable, Healable {
	Scv() {
		super(60);
	}

	public void move_sound() {
		System.out.println("wing");
	}

	public void attack_sound() {
		System.out.println("zizic");
	}

	public void repair(Repairable r) {

		Unit u = (Unit) r;
		while (u.hitPoint != u.MAX_HP) {
			u.hitPoint++;
			System.out.println("수리중..:>" + u.hitPoint);
		}
		System.out.println("수리완료");
	}
}