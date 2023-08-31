package assignment;

public class swapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		System.out.println("Before swap : "+ a +" : "+ b);
		a = a + b; //10 + 5 = 15
		b = a - b; //15 - 5 = 10
		a = a - b; //15 - 10 =5
		System.out.println("After swap : "+ a +" : "+ b);
		
		
	}

}
