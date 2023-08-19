package com.basicproblem;

public class Smallest_number_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Largest Number");
		int num1 = 18;
		int num2 = 75;
		int num3 = 135;
		int num4 = 37;
		
		if ((num1 < num2)&&(num1 < num3)&&(num1 < num4)) {
			System.out.println(num1);
		}
		else if ((num2 < num1)&&(num2 < num3)&&(num2 < num4)){
			System.out.println(num2);
		}
		else if ((num3 < num1)&&(num3 < num2)&&(num3 < num4)){
			System.out.println(num3);
		}
		else {
			System.out.println(num4);
		}

	}

}
