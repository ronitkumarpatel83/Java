package com.basicproblem;

import java.util.Scanner;

public class Uppercase_ASCII_value_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===========================================");
		System.out.println("Uppercase ASCII value or not ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if ((num>=65)&&(num<=90)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
		
	}

}
