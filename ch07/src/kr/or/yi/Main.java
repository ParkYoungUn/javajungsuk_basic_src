package kr.or.yi;
import com.yi.Tv;

public class Main {

	public static void main(String args[]) { 
		Tv T = new Tv();
		T.channel = 10;
		T.channelUp();
		System.out.println("채널정보: "+T.channel);
	}
}