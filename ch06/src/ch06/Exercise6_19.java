package ch06;

public class Exercise6_19 {	
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH: "+t.channel+ ", VOL: " +t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH: "+t.channel+ ", VOL: " +t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH: "+t.channel+ ", VOL: " +t.volume);

	}

}

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		if (MAX_VOLUME > volume) {
			volume++;
		}
	}
	
	void volumeDown() {
		if (MIN_VOLUME < volume) {
			volume--;
		}
	}
	
	void channelUp() {
		if (MAX_CHANNEL == channel) {
			channel = 1;
		} else if (MIN_CHANNEL <= channel) {
			channel++;
		}
	}
	
	void channelDown() {
		if (MIN_CHANNEL == channel) {
			channel = 100;
		} else if (MAX_CHANNEL >= channel) {
			channel--;
		}
	}
	
}