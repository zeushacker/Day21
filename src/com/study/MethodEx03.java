package com.study;

public class MethodEx03 {
          
	int var;
	
	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}


	public static void main(String[] args) {
		MethodEx03 me = new MethodEx03();
		me.setVar(1000);
		System.out.println("var :"+me.getVar());
		
	}

}
