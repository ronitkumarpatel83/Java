package com.basicproblem;

import java.util.Scanner;

public class Grading_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Grading System");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks to get grade : ");
		int marks = sc.nextInt();
		
		if ((marks < 0)||(marks >100)) {
			System.out.println("Marks : "+marks+" Invalid");
		}
		else if (marks > 90) {
			System.out.println("Marks : "+marks+" Grade : A+");
		}
		else if (marks > 80) {
			System.out.println("Marks : "+marks+" Grade : A");
		}
		else if (marks > 70) {
			System.out.println("Marks : "+marks+" Grade : B+");
		}
		else if (marks > 60) {
			System.out.println("Marks : "+marks+" Grade : B");
		}
		else if (marks > 50) {
			System.out.println("Marks : "+marks+" Grade : C+");
		}
		else if (marks > 40) {
			System.out.println("Marks : "+marks+" Grade : C");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();

	}

}
