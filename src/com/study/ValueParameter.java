package com.study;

/*   값에 의한 호출(Call by value)
 *   
 *    - 메소드를 호출할 때 기본 자료형의 값을 인자로 전달하는 방식임
 */
public class ValueParameter {

	public int increase(int r) {
		++r;
		return r;
	}
	
	public static void main(String[] args) {
		int var1 = 100;
		ValueParameter vp = new ValueParameter();
		
		int var2 = vp.increase(100);
          System.out.println(var2);
		
	}

}
