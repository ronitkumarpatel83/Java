package Demo;

import java.util.Scanner;
// Display the student details
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the variable
		String name;
		int m1,m2,m3;
		double total,percentage;
		
		// Taking input from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		name = sc.nextLine();
		System.out.println("Enter marks of Math : ");
		m1 = sc.nextInt();
		System.out.println("Enter marks of Physics : ");
		m2 = sc.nextInt();
		System.out.println("Enter marks of Chemistry : ");
		m3 = sc.nextInt();
		
		// Total marks of student 
		total = (m1 + m2 + m3);
		percentage = (total/300) * 100;
		
		//Display the results
		System.out.println("------------- RESULTS ----------------\n");
		System.out.println("Name         : "+name+"\n");		
		System.out.println("Maths        : "+m1);
		System.out.println("Physics      : "+m2);
		System.out.println("Chemistry    : "+m3);
		System.out.println("Total        : "+total);
		System.out.println("Percentage   : "+percentage+"%");
		sc.close();
	}

}
