package assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check if a given number is prime or not ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int n = 0;
		for (int i = 2;i<=num;i++) {
			if (num % i == 0) {
//				System.out.println(i);
				n++;
			}
		}
//		System.out.println(n);
		if (n<2) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num +" is not a prime number");
		}
		sc.close();

	}

}
