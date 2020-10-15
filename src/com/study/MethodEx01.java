package com.study;

/*   메소드란?
 *    - 객체가 할 수 있는 동작을 정의하는 것이며
 *      메소드 종류 : instance(인스턴스 메소드), static 메소드가 있음
 *      
 *    메소드 구성
 *    
 *      [접근제한자] [반환형] [메소드명] (자료형 인자(매개변수)1, 자료형 인자2 ...) {
 *        메소드의 동작 수행문
 *        메소드의 동작 수행문
 *        메소드의 동작 수행문
 *      }
 *    [접근제한자]
 *      - 객체나 멤버에 대한 접근을 제한하는 방법을 의미함
 *        public, protected, default, private
 *        
 *    [반환형]
 *       - 메소드에서 해야할 일을 모두 끝내고  마지막으로 메소드 자신을 불러준(호출)곳으로
 *         반환하는 값의 자료형을 의미함
 *         만약, 반환값이 없다면 void 라는 예약어로 대처해야함
 *         즉 생략은 불가능하다
 *          
 *    [메소드명]
 *        - 사용자 정의 이름을 의미함
 *           
 *    [인자]
 *       - Arguments 라고도 하며 이것은 메소드를 호출할때 필요에 따라
 *         특정 값을 제공해 주기 위해 미리 선언하는 것이며 메소드를 호출할 
 *         시에 반드시 인자의 자료형과 수가 일치해야함
 *      
 *     [수행문]
 *       처리문
 */


class MethodEx {

	public int add(int a, int b) {
		int r;
		r = a + b;
		 return r;
	}
	
	public int sub(int a, int b) {
		int r;
		r = a - b;
		 return r;
	}
	
	public int mul(int a, int b) {
		int r;
		r = a * b;
		 return r;
	}
	
	public int div(int a, int b) {
		int r;
		r = a / b;
		 return r;
	}
	
}


public class MethodEx01 {

	public static void main(String[] args) {
		// 객체 또는 인스턴스 생성
		MethodEx me = new MethodEx();
		int i = 10;
		int j = 10;
		
		int k=me.add(i, j);
		int h=me.sub(i, j);
		int l=me.mul(i, j);
		int m=me.div(i, j);
		
		System.out.println("덧셈 결과 값:"+k);
		System.out.println("뺄셈 결과 값:"+h);
		System.out.println("곱셈 결과 값:"+l);
		System.out.println("나눗셈 결과 값:"+m);
		

	}

}
