package com.basicproblem;

public class Largest_number_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Largest Number");
		int num1 = 18;
		int num2 = 75;
		int num3 = 135;
		
		if ((num1 > num2)&&(num1 > num3)) {
			System.out.println(num1);
		}
		else if ((num2 > num1)&&(num2 > num3)){
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}

	}

}
