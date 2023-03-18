package com.java;

import java.util.Scanner;

public class Forlooop {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(in);
		System.out.println("Enter one value");
		int x=in.nextInt();
		int y=in.nextInt();
		
		System.out.println("given first value is :"+x);
		System.out.println("given second value is :"+y);
		
		if(x<y) {
			System.out.println(x);
		}

	}

}
