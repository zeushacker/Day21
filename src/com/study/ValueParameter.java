package com.study;

/*   ���� ���� ȣ��(Call by value)
 *   
 *    - �޼ҵ带 ȣ���� �� �⺻ �ڷ����� ���� ���ڷ� �����ϴ� �����
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
