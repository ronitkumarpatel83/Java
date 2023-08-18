package assignment;

import java.util.Scanner;

public class greatest_three_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(" Check three numbers to check which one is greater");
		System.out.println("Enter Three Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=b && a>=c)  {
			System.out.println(a+" is the greatest Number");  
		} 
		else if (b>=a && b>=c) { 
			System.out.println(b+" is the greatest Number");  
		}
		else { 
			System.out.println(c+" is the greatest number");  
		}
		sc.close();
	}

}
