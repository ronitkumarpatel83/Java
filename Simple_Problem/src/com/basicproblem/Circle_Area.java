package com.basicproblem;

import java.util.Scanner;

public class Circle_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area, pi;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of area : ");
		double r = sc.nextDouble();
		pi = 3.142;
		area = pi*r*r;
		
		System.out.println("Area of circle is : "+ area);
		
		sc.close();

	}

}
