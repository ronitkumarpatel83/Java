package Demo;

public class throwsException {
	public static void main(String[] args) {
		int age = 24;
		
		if (age > 18) {
			throw new ArithmeticException("Invalid");
		}
		else {
			System.out.println("Valid age ");
		}
	}

}
