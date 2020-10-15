package com.study;

public class MethodEx02 {
	
   static int val1=10, var2=30; // 멤버 변수
	
	public int sum(int a, int b) {// 메소드(멤버 함수)
		return a + b;
	}
	
	public static void main(String[] args) {
	
		//MethodEx02 me = new MethodEx02();
		//int res = me.sum(1000, -10);
		//System.out.println(res);
		
		System.out.println(MethodEx02.val1);
		System.out.println(MethodEx02.var2);

	}

}
