package ch06;

public class Marine {
	
	public static void main(String[] args) {
		Marine1 m = new Marine1();
		
		System.out.println(m.x);
		System.out.println(m.y);
		System.out.println(m.weapon);
		System.out.println(m.armor);
		m.weaponUp();
		m.weaponUp();
		m.weapon = 0;
		System.out.println(m.weapon);

	}

}

class Marine1{
	int x=0,y=0;
	int hp=60;
	static int weapon = 7;
	static int armor =0;
	
	static void weaponUp() {
		weapon++;
	}
	void armorUp() {
		armor++;
	}
	void move(int x,int y) {
		this.x = x;
		this.y = y;
	}
}