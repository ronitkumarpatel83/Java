package Oops;

import java.util.Scanner;

public class Practice {
	// Global variable
	public int a,b,c;
	
	//Method
	public void add() {
		// Taking user input
		System.out.println("Enter the value of number 1 and number 2 : ");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		// Addition
		c = a + b;
		
		// Display output
		System.out.println("The addition of "+ a +" and "+ b +" is : "+ c);
		
		sc.close();
	}
	// Method
	public void sub() {
		// Taking user input
		System.out.println("Enter the value of number 1 and number 2 : ");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		// Subtraction
		c = a - b;
		
		// Display output
		System.out.println("The substraction of "+ a +" and "+ b +" is : "+ c);
		sc.close();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice a = new Practice();
		a.add();
		a.sub();

	}

}
