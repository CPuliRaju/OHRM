package com.Scanner;

import java.util.Scanner;

public class ExampleScanner {

	public static void main(String[] args) {
	
		
		int a;
		System.out.println("enter any number");
		Scanner b=new Scanner(System.in);
		a=b.nextInt();
		if(a%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
			
		}
		
		

	}

}
