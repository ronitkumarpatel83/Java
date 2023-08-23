package loopPractice;

import java.util.Scanner;

public class first_to_n_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to printing value from 1 to : ");
		int num = sc.nextInt();
		int i = 1;
		while (i <= num) {
			System.out.println(i);
			i++;
		}
		sc.close();
		
		for (int k=1;k<=num;k++) {
			System.out.println(k);
		}
		

	}

}
