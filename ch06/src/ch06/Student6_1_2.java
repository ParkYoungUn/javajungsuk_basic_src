package ch06;

public class Student6_1_2 {
	public static void main(String[] args) {
		
		Student s = new Student("a",1,1,100,60,76);

			String str = s.info();
			System.out.println(str);
	}
}
	class Student{
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		Student(String name, int ban, int no, int kor, int eng, int math){
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		String info() {
			return name
					+","+ban
					+","+no
					+","+kor
					+","+eng
					+","+math
					+","+(kor+eng+math)
					+","+(Math.round((kor+eng+math)*10.0/3)/10.0);
		}
		
	}

	
	//(   (int) ((kor+eng+math) / 3f * 10 + 0.5f) / 10f  );