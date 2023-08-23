package loopPractice;

import java.util.Scanner;

public class n_to_first_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to printing value from n to 1 ");
//		int num = sc.nextInt();
		int num =10;
		int i = 1;
		while (i <= num) {
			System.out.println(num);
			num--;
		}
		System.out.println("========== For loop ============");
		int num2 = 20;
		for (int k = 1;k <= num2;num2--) {
			System.out.println(num2);
		}
		sc.close();

	}

}
