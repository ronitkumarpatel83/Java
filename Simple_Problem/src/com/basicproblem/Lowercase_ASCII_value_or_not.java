package com.basicproblem;

import java.util.Scanner;

public class Lowercase_ASCII_value_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===========================================");
		System.out.println("Lowercase ASCII value or not ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if ((num>=97)&&(num<=122)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();

	}

}
