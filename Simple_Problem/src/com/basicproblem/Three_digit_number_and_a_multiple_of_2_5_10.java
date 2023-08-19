package com.basicproblem;

public class Three_digit_number_and_a_multiple_of_2_5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 140;
		System.out.println("Three digit number and a multiple of 2,5 and 10 ");
		
		if (((num <= 999)&&(num >= 100)) && ((num % 10 == 0)&&( num%5 == 0)&&(num % 2 == 0))) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
