package ch06_3;

public class problom6_3 {
	public static void main(String[] args) {
			
			Student s = new Student();
			s.name = "ȫ�浿";
			s.ban = 1;
			s.no = 1;
			s.kor = 100;
			s.eng = 60;
			s.math = 76;
			
			System.out.println("�̸�: "+ s.name);
			System.out.println("����: "+ s.getTotal());
			System.out.println("���: "+ s.getAverage());
		}
}

class Student {
	String name; // �л��̸�
	int ban; // ��
	int no; // ��ȣ
	int kor; // ��������
	int eng; // ��������
	int math; // ��������
	
		Student(){}
	
	void Student(String name,int ban,int no,int kor,int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal(){
		int sum = kor+eng+math;
		return sum;
	}
	
	int getAverage() {
		
		return (int) Math.round((getTotal()/3));
	}
	
//	public String info() {
//		return name
//				+","+ban
//				+","+no
//				+","+kor
//				+","+eng
//				+","+math
//				+","+(kor + eng + math)
//				+","+((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f);
//	}
//	
	
}