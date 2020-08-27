package generic;

public class Data<T> {
	public T data;
	
	public Data(T data) {
		this.data = data;
	}
	
	public static <T> T ShowData(T data) {
		if(data instanceof String)
			System.out.println("String");
		else if (data instanceof Integer)
			System.out.println("Integer");
		else if (data instanceof Double)
			System.out.println("Double");
		
		return data;
	}
}
