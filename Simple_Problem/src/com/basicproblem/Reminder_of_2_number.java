package com.basicproblem;

import java.util.Scanner;

public class Reminder_of_2_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reminder of 2 number ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			int rem = num1 % num2;
			System.out.println(rem);
		}
		else {
			System.out.println(-1);
		}
		sc.close();
	}

}
