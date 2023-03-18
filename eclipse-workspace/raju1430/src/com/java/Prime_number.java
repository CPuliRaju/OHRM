package com.java;

public class Prime_number {

	public static void main(String[] args) {

		for (int a=1;a<=200; a++) {
			int count=0;

			for (int b=1;b<=a; b++) {

				if(a%b==0) {
					count=count+1; 
				}

			}
			if (count==2) {
				System.out.println("the given number is prime number"+a);
			}
		}



	}

}
