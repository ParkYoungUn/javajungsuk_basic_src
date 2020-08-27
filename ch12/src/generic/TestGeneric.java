package generic;

public class TestGeneric<T> {
	
	public T sample;
	
	public void showYourType() {
		if (sample instanceof Integer) {
			System.out.println("Is Integer type !!");
		} else if (sample instanceof String) {
			System.out.println("Is String type !!");
		}
	}
}

class TestGeneric2<T,K> {
	public T sample;
	public K sample2;
	
	public void showYourType2() {
		
		if (sample instanceof String) {
			System.out.println("Is String type !!");
		} else if (sample2 instanceof Integer) {
			System.out.println("Is Integer type !!");
		}
	}
}



