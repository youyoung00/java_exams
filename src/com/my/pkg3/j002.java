package com.my.pkg3;

public class j002 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		java002(10, 20);
		java002(3, 3);
		java002(5, 20);
		
	}
	
	public static void java002(int a, int b) {
		if(a < b) {
			System.out.println(b);
		} else if (a > b) {
			System.out.println(a);	
		} else {
			System.out.println("eq");
		}
	}
	

}
