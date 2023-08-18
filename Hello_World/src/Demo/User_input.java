package Demo;
import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id;
		int salary;
		int exp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Id : ");
		id = sc.nextInt();
		System.out.println("Enter the salary : ");
		salary = sc.nextInt();
		System.out.println("Enter the experience : ");
		exp = sc.nextInt();
		
		System.out.println("");
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("Employee Details");
		System.out.println("-----------------------------\n");
		
		System.out.println("Employee Id : " + id);
		System.out.println("Employee Salary : " + salary);
		System.out.println("Employee Experience : " + exp);
		sc.close();

	}

}
