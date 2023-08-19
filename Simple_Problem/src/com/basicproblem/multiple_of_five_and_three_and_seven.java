package com.basicproblem;

public class multiple_of_five_and_three_and_seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 105;
		
		System.out.println("Multiple of 5, 3 and 7");
		if ((num%5 == 0)&&(num%3 == 0)&&(num%7 == 0)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
