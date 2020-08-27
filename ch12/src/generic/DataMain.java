package generic;


class Parent { }

class Child extends Parent { }

class Data1<T extends Parent> { }

public class DataMain {

	public static void main(String[] args) {
		Data data = new Data("Hello world");
		Data<String> data2 = new Data("Hello world");

		Data.<String>ShowData("Hello world");
		Data.ShowData(1);
		Data.ShowData(1.1);
	
		Data1<Parent> dataP = new Data1<>();
		Data1<Child> dataC = new Data1<>();
		
	}

}
