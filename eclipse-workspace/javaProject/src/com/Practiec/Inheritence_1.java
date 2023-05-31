package com.Practiec;

public class Inheritence_1 extends Inheritence{
	
	
	public void multi() {
		System.out.println("multi"+(a*b));
	}
	
	public void div() {
		System.out.println("div"+(a%b));
	}

	public static void main(String[] args) {
		
		Inheritence_1 raju=new  Inheritence_1();
		raju.add();
		raju.sub();
		raju.multi();
		raju.div();

	}

}
