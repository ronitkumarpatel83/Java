package assignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a java program to find the given number is Armstrong number.
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(isArmstrong(num)) {
			System.out.println(num+" is a armstrong number");
		}
		else {
			System.out.println(num+" is not a armstrong number");
		}
		sc.close();
	}
	
	static boolean isArmstrong(int num) {
		
		int exact_num = num;
		int value = 0;
		
		while (num>0) {
			int rem = num%10;
			value = (rem*rem*rem)+value;
			
			num = num/10;
//			System.out.println(num);
		}
//		System.out.println(value);
		return value == exact_num;
	}
}
