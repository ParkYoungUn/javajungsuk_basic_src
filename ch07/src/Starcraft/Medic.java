package Starcraft;

class Medic extends Unit implements Boardable, Healable {
	
	Medic() {
		super(40); // �޵��� max hp ��
	}

	public void move_sound() {
		System.out.println("메딕간다.");

	}

	public void attack_sound() {
		System.out.println("메딕공격한다.");

	}

	public void heal(Healable r) // Healable �� implements�� ���ֵ� �ƹ��ų� �������ִ�. 
	{
		Unit u = (Unit)r; // Unit �� �������� �����߱⶧���� r �� unit ������ ����ȯ���ش�.
		while (u.hitPoint != u.MAX_HP) // max hp �� �ɶ�����
		{
			u.hitPoint++; // hitpoint�� ������Ų��.
			System.out.println("치료즁..:>" + u.hitPoint);
		}
		System.out.println("치료완료");
		
		if ( r instanceof Marine) {
			Marine m = (Marine)r;
			m.attack_sound();
		}
	}

}