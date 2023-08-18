package assignment;

import java.util.Scanner;

public class odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Check the number is odd or even");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
		sc.close();

	}

}
