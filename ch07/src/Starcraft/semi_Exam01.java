package Starcraft;

interface Repairable {}
interface Boardable {}
interface Healable {}
interface countUp {}

public class semi_Exam01 {

	public static void main(String[] args) {

		Marine m = new Marine();
		Tank t = new Tank();
		Scv s = new Scv();
		Medic md = new Medic();
		DropShip ds = new DropShip();
		FiarBat fb = new FiarBat();

		ds.hitPoint = 90; // ������ ������ HP
		t.hitPoint = 140;
		m.hitPoint = 30;
		fb.hitPoint = 34;

		md.heal(m); // �޵����� ������ ġ�����ش�.
		ds.tab(m); // ��ӽ����� ������ �¿��.
		ds.drop(m);
		s.repair(t);
		s.repair(ds); // scv �� drop ship�� �¿��.
		s.repair(s);
		md.heal(fb);

		m.move_sound();
		m.ok_sound();
		t.move_sound();
		fb.attack_sound();

		t.mode_sound();
		t.ok_sound();
		t.countUp();
	}
}