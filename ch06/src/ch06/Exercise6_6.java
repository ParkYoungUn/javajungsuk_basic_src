package ch06;

public class Exercise6_6 {
	public static void main(String[] args) {
		
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));
		
	}
}

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		
		return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		//return Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
		
	}
	
}