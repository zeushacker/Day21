package com.study;

/*   �޼ҵ��?
 *    - ��ü�� �� �� �ִ� ������ �����ϴ� ���̸�
 *      �޼ҵ� ���� : instance(�ν��Ͻ� �޼ҵ�), static �޼ҵ尡 ����
 *      
 *    �޼ҵ� ����
 *    
 *      [����������] [��ȯ��] [�޼ҵ��] (�ڷ��� ����(�Ű�����)1, �ڷ��� ����2 ...) {
 *        �޼ҵ��� ���� ���๮
 *        �޼ҵ��� ���� ���๮
 *        �޼ҵ��� ���� ���๮
 *      }
 *    [����������]
 *      - ��ü�� ����� ���� ������ �����ϴ� ����� �ǹ���
 *        public, protected, default, private
 *        
 *    [��ȯ��]
 *       - �޼ҵ忡�� �ؾ��� ���� ��� ������  ���������� �޼ҵ� �ڽ��� �ҷ���(ȣ��)������
 *         ��ȯ�ϴ� ���� �ڷ����� �ǹ���
 *         ����, ��ȯ���� ���ٸ� void ��� ������ ��ó�ؾ���
 *         �� ������ �Ұ����ϴ�
 *          
 *    [�޼ҵ��]
 *        - ����� ���� �̸��� �ǹ���
 *           
 *    [����]
 *       - Arguments ��� �ϸ� �̰��� �޼ҵ带 ȣ���Ҷ� �ʿ信 ����
 *         Ư�� ���� ������ �ֱ� ���� �̸� �����ϴ� ���̸� �޼ҵ带 ȣ���� 
 *         �ÿ� �ݵ�� ������ �ڷ����� ���� ��ġ�ؾ���
 *      
 *     [���๮]
 *       ó����
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
		// ��ü �Ǵ� �ν��Ͻ� ����
		MethodEx me = new MethodEx();
		int i = 10;
		int j = 10;
		
		int k=me.add(i, j);
		int h=me.sub(i, j);
		int l=me.mul(i, j);
		int m=me.div(i, j);
		
		System.out.println("���� ��� ��:"+k);
		System.out.println("���� ��� ��:"+h);
		System.out.println("���� ��� ��:"+l);
		System.out.println("������ ��� ��:"+m);
		

	}

}
