import java.util.*;

class Ex11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		Person p1 = new Person("David",10);
		Person p2 = new Person("David",10);
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		int hashCode = p1.hashCode();
		int hashCode2 = p2.hashCode();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(set);
	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name +":"+ age;
	}
}