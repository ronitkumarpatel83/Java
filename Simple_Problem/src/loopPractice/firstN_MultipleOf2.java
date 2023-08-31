package loopPractice;

public class firstN_MultipleOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int num2 = 7;
		int num3 = 5;
		
		for (int i=1;i<=num;i++) {
			System.out.print(i*2+" ");
		}
		System.out.println();
		for (int i=1;i<=num2;i++) {
			System.out.print(i*3+" ");
		}
		System.out.println();
		for (int i=1;i<=num3;i++) {
			System.out.print(i*5+" ");
		}
		System.out.println("=============================");
		
		int number = 15;
		
		for (int i=1;i<=number;i++) {
			if ((i % 2 == 0)||(i % 3 ==0)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int number2 = 15;
		
		for (int i=1;i<=number2;i++) {
			if ((i % 2 == 0)||(i % 5 ==0)||(i%7==0)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int number3 = 15;
		
		for (int i=1;i<=number3;i++) {
			if ((i % 3 == 0)||(i % 5 ==0)||(i%7==0)) {
				System.out.print(i+" ");
			}
		}
	}

}
