package com.basicproblem;

import java.util.Scanner;

public class Swap_2_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Swap two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Before swapping");
		System.out.println(num1+" "+num2);
		
		int tot = num1;
		num1 = num2;
		num2 = tot;
		System.out.println("After swapping");
		System.out.println(num1+" "+num2);
		
		sc.close();

	}

}
