class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;    // car = (Car)fe;���� ����ȯ�� ������
//		car.water();
		fe2 = (FireEngine)car; // �ڼ�Ÿ�� �� ����Ÿ��. ����ȯ ���� �Ұ�
		fe2.water();
		//fe.setColor("red");
		fe.getColor();
	}
}

class Car {
	String color;
	int door;

	String getColor() {
		System.out.println(color);
		return color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void drive() { 	// �����ϴ� ���
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// ���ߴ� ���	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// �ҹ���
	void water() {	// ���� �Ѹ��� ���
		super.setColor("red");
		System.out.println("water!!!");
	}
}