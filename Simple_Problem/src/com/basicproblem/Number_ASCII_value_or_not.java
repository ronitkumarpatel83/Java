package com.basicproblem;

import java.util.Scanner;

public class Number_ASCII_value_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===========================================");
		System.out.println("Number ASCII value or not ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if ((num>=0)&&(num<=127)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();

	}

}
