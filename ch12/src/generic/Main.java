package generic;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		TestGeneric<String> stringType = new TestGeneric<>();
		TestGeneric<Integer> integerType = new TestGeneric<>();
		
		stringType.sample = "hello";
		integerType.sample = 1;
		
		stringType.showYourType();
		integerType.showYourType();

		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello~");
		list.add("World!!");
		
		for (int i=0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		TestGeneric2<String, Integer> generic2 = new TestGeneric2<String, Integer>();
		generic2.sample = "TestGeneric";
		generic2.sample2 = 2;
		
		generic2.showYourType2();
		
		
	}

}
