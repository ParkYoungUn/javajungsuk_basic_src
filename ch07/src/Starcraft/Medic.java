package Starcraft;

class Medic extends Unit implements Boardable, Healable {
	
	Medic() {
		super(40); // 메딕의 max hp 값
	}

	public void move_sound() {
		System.out.println("메딕간다.");

	}

	public void attack_sound() {
		System.out.println("메딕공격한다.");

	}

	public void heal(Healable r) // Healable 을 implements한 유닛들 아무거나 받을수있다. 
	{
		Unit u = (Unit)r; // Unit 로 참조변수 선언했기때문에 r 을 unit 형으로 형변환해준다.
		while (u.hitPoint != u.MAX_HP) // max hp 가 될때까지
		{
			u.hitPoint++; // hitpoint를 증가시킨다.
			System.out.println("치료중..:>" + u.hitPoint);
		}
		System.out.println("치료완료");
		
		if ( r instanceof Marine) {
			Marine m = (Marine)r;
			m.attack_sound();
		}
	}

}