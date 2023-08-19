package com.basicproblem;

import java.util.Scanner;

public class Absolute_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Absolute Value ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer number :  ");
		int num = sc.nextInt();
		
		int absnum = num;
		if (num < 0) {
			absnum = -num;
		}
		System.out.println(num+" : Absolute value is : "+absnum);
		sc.close();

	}

}
