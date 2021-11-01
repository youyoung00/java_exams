package com.my.pkg3;

import java.util.List;

public class j004 {

	public static void main(String[] args) {
		//[출력포멧]
		//Hello s_1, s_2, ... , s_n.
		//
		//[입력]
		//Java
		//Gino
		//
		//
		//[출력]
		//Hello Java, Gino.
		  exam004(List.of("Java", "Gino"));
//		  exam([
//		    "Alice",
//		    "Bob",
//		    "Carol",
//		    "Dave",
//		    "Ellen",
//		  ]);
		  
		 // 어레이 : 고정된 개수의 요소를 가지는 배열 -> length
		 // 리스트 : 고정되지 않는 요소를 가지는 배열 -> 고정 되지 않기 때문에 찾아야 함
	}
	public static void exam004(List<String> names) {
		  String s = "hello";
		  
		  for (int i = 0; i < names.size(); i++) {
		    s = s + names.get(i);
		    if (i == names.size() - 1) {
		      s = s + ",";
		    } else {s = s + ", ";}
		  }
		  System.out.println(s);
		}
	
//	public void exam004out(String[] names) {
//		  String s = "hello ";
//		  s += names.join(", ") + ".";
//		  System.out.println(s);
//		}
}
