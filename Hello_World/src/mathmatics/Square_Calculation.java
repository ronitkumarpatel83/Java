package mathmatics;

import java.util.Scanner;

public class Square_Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the variable
		double a, square;
		
		// Taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		a = sc.nextDouble();
		
		square = (a * a);
		
		//OutPut Display 
		System.out.println("---- Calculation of Square ----\n");
		System.out.println("Square of "+ a + " is : "+ square);
		sc.close();
		
	}

}
