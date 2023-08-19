package Demo;

import java.util.Scanner;

public class Output_formating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
		int num=sc.nextInt();
		String s=sc.next();
		System.out.printf("%s %d\n",s,num);
		
		System.out.printf("%-15s %d\n",s,num); //-15 means after 15 character new char start
		System.out.printf("%-15s %010d\n",s,num); //before integer rest of the number are 0
		
		sc.close();

	}

}
