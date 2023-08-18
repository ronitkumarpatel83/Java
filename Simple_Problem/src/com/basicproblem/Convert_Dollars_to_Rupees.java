package com.basicproblem;

import java.util.Scanner;

public class Convert_Dollars_to_Rupees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rupees;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rupees : ");
		rupees = sc.nextInt();
		
		double dollar = rupees * 61.06;
		
		System.out.println("Dollars : "+ dollar);
		sc.close();
		

	}

}
