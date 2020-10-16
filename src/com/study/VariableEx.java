package com.study;

public class VariableEx {

	public void argTest(String ...n) {
		// Varargs(Variable Arguements)
		/*  �޼ҵ� ���� �� ���ϵ� ������ �ڷ�����  '...' ��� ����ϹǷ�
		 *  �̸� ���� �޼ҵ带 �����ϴµ� �ʿ��� ������ ���� �����ϰ� ������ �� ����
		 *    (���������� �迭ȭ �۾��� �ڵ������� ����)
		  */
		for(int i = 0; i< n.length; i++) 
			System.out.println("n["+i+"]:"+n[i]);
		System.out.println("----------------------------");
		
	}
	
	
	public static void main(String[] args) {

		VariableEx ve = new VariableEx();
		
		ve.argTest("Java", "Database");
		ve.argTest("100", "200","300", "400");
		

	}

}
