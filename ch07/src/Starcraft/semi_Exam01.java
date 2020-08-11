package Starcraft;

interface Repairable {}
interface Boardable {}
interface Healable {}

public class semi_Exam01 {

	public static void main(String[] args) {

		Marine m = new Marine();
		Tank t = new Tank();
		Scv s = new Scv();
		Medic md = new Medic();
		DropShip ds = new DropShip();
		FiarBat fb = new FiarBat();

		ds.hitPoint = 90; // 데미지 상태의 HP
		t.hitPoint = 140;
		m.hitPoint = 30;
		fb.hitPoint = 34;

		md.heal(m); // 메딕으로 마린을 치료해준다.
		ds.tab(m); // 드롭쉽으로 마린을 태운다.
		ds.drop(m);
		s.repair(t);
		s.repair(ds); // scv 로 drop ship을 태운다.
		s.repair(s);
		md.heal(fb);

		m.move_sound();
		m.ok_sound();
		t.move_sound();
		fb.attack_sound();

		t.mode_sound();
		t.ok_sound();
		
	}
}