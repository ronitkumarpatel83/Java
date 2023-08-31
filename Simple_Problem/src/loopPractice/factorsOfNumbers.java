package loopPractice;

public class factorsOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		int count = 0;
		
		for (int i=1;i<=num;i++) {
			if (num % i == 0) {
				count++;
				System.out.print(i+" ");
			}
			
			
		}
		System.out.println();
		System.out.println("Count of factors : "+count);
		
	}

}
