package assignment;

import java.util.Scanner;

public class SumOfADigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a java program to find the sum of digits of a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");
		int num = sc.nextInt();
		int value = 0,rem;
		
//		while(num>0) {
//			
//			rem = num%10;			
//			value = value + rem;
//			num = num/10;
//			
//		}
		while (num>0) {
			rem = num%10;
			value = (value*10)+rem;
			num = num/10;
		}
		
		System.out.println(value);
		sc.close();
	}

}
