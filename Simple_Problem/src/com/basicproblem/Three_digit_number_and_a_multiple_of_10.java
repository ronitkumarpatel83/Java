package com.basicproblem;

public class Three_digit_number_and_a_multiple_of_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 145;
		System.out.println("Three digit number and a multiple of 10 ");
		
		if (((num <= 999)&&(num >= 100)) && (num % 10 == 0)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
