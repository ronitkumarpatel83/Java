package com.basicproblem;

import java.util.Scanner;

public class Game_of_multiplication_and_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===================================");
		System.out.println("Game of multiplication and addition");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if ((num1%2 == 0) && (num2%2 == 0)) {
			int mul = num1 * num2;
			System.out.println(mul);
		}
		else {
			int add = num1 + num2;
			System.out.println(add);
		}
		sc.close();

	}

}
