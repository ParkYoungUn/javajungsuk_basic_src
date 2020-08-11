import java.util.Scanner;

class Ex6_1 { 
	public static void main(String args[]) { 
		Tv t;                 // Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����       
		t = new Tv();         // Tv�ν��Ͻ��� �����Ѵ�. 
		t.channel = 7;        // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�. 
		t.channelDown();      // Tv�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�.
		t.power();
		System.out.println(t.power);
		System.out.println("현재 채널은?" + t.channel + " 입니다.");
		
		Remocun r = new Remocun();
		System.out.println("리모컨"+r.onOff);
		r.onOffset();
		r.chanuelChose();
	} 
}

class Tv { 
	// Tv�� �Ӽ�(�������)   
	String color;           // ���� 
	boolean power;         	// ��������(on/off) 
	int channel;           	// ä�� 

	// Tv�� ���(�޼���) 
	void power()   { power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼���  
	void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
	void channelDown() { --channel; }   // TV�� ä���� ���ߴ� ����� �ϴ� �޼���  
}

class Remocun {
	boolean onOff;
	int channel;
	int volume;
	int chanuelChose;
	
	void onOffset() { onOff = !onOff; }
	void channelUP() { channel++; }
	void channelDown() { channel--;}
	void volumeUp() {volume++;}
	void volumeDown() {volume--;}
	void chanuelChose() {
		if ( onOff == true ) {
			System.out.println("채널을 선택해주세요");
			Scanner scan = new Scanner(System.in);
			int inch = scan.nextInt();
			System.out.println("선택하신 채널은 "+inch+" 입니다.");
		} else { System.out.println("티비 꺼져있음"); }
	}
}