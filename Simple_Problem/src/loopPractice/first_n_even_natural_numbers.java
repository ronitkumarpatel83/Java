package loopPractice;

public class first_n_even_natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First N even natural numbers : ");
		int num = 5;
		
		for (int i = 1;i <= num; i++) {
			System.out.println(i * 2);
		}
		
		System.out.println("============= while loop=============");
		
		int num2 = 5;
		int i = 1;
		while (i <= num2) {
			System.out.println(i * 2);
			i++;
		}
		

	}

}
