package Demo;

import java.util.Scanner;

public class Circumference_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, pi, circumference, area;
		
		pi = 3.14159265359;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		r = sc.nextDouble();
		circumference = (2 * pi * r);
		area = (pi * r * r);
		
		System.out.println("-----------  OUTPUT  ------------\n");
		System.out.println("Circumference is : "+ circumference);
		System.out.println("Area of circle is : "+ area);
		sc.close();
		
	}

}
