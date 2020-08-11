package com.yi;

public class Tv { 
	
	public static void main(String[] args) {
		Card1 c = new Card1("HEART",10);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);

	}
	
	// Tv�� �Ӽ�(�������)   
	String color;           // ���� 
	boolean power;         	// ��������(on/off) 
	public int channel;           	// ä�� 

	// Tv�� ���(�޼���) 
	void power()   { power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼���  
	public void channelUp()   {  ++channel; }  // TV�� ä���� ���̴� ����� �ϴ� �޼��� 
	void channelDown() { --channel; }   // TV�� ä���� ���ߴ� ����� �ϴ� �޼���  
	
}