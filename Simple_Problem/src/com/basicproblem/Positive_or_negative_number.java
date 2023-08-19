package com.basicproblem;

import java.util.Scanner;

public class Positive_or_negative_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================================");
		System.out.println("Positive or negative number ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Positive");
		}
		else if (num < 0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		sc.close();

	}

}
