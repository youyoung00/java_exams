package com.my.pkg3;

public class j006 {

	public static void main(String[] args) {
		
		exam(1, "km");
		exam(54, "km");
		exam(2, "cm");
		exam(12, "m");
		
		// Class 인스턴스를 생성하여 이름있는 매개변수를 만들어 사용.
		Test ts = new Test();
		exam(ts);
	}
	
	public static void exam(int n, String s) {
		int result = 0;
		
		if(s == "km") {
			result += (n * 1000000);
		} else if (s == "m") {
			result += (n * 1000);
		} else if (s == "cm") {
		    result += (n * 10);
		} System.out.printf("%o\n", result);
	    return;
	}
	
	// Dart - 옵셔널파라미터 대신, 오버로드(같은 이름 함수)로 생성하여 사용
	// 매개변수를 다르게 하여, 사용하지 않아도 되는 옵셔널파라미터로 사용.
	// 오버로드 사용법. 이름이 똑같은 함수를 매개변수만 다르게 해서 사용가능
	// int x 가 사용되지 않는 옵셔널파라미터가 되었다. 
	public static void exam(int n, String s, int x) { 
		int result = 0;
		
		if(s == "km") {
			result += (n * 1000000);
		} else if (s == "m") {
			result += (n * 1000);
	    } else if (s == "cm") {
		    result += (n * 10);
		} System.out.printf("%o\n", result);
	    return;
	}
	

	private static class Test{
		String s = "km";
		int n = 1;
	}
		
	// Dart - 네임드파리미터 대신, 클래스인스턴스를 매개변수로 받아 사용.(모델링)
	public static void exam(Test test) { 
		int result = 0;
		
		if(test.s == "km") {
			result += (test.n * 1000000);
		} else if (test.s == "m") {
			result += (test.n * 1000);
		} else if (test.s == "cm") {
			result += (test.n * 10);
		} System.out.printf("%o\n", result);
	    return;
	}
}


