package com.study;

/*  ������ ȣ�� (Call by reference)
 *      - �޼ҵ� ȣ��� �����Ϸ��� ���ڸ� ����(��ü) �ڷ����� ����� ��츦 �ǹ���
 *        �⺻ �ڷ����� �ƴ� �Ϲ� ��ü(�ν��Ͻ�) �Ǵ� �迭���� �̿� ����
 */

public class RefereneParameter {

	public void increase(int[] n ) {
		for(int i =0; i<n.length; i++)
			n[i]++;
			
	}
	public static void main(String[] args) {
		int[] ref1 = {100,800,1000};
		
		RefereneParameter rp = new RefereneParameter();
		rp.increase(ref1);
		
		for(int i =0; i<ref1.length; i++) {
			System.out.println("ref1["+i+"]:"+ref1[i]);
		}
	}

}
