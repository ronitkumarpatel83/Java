package Demo;

public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = null;
//			System.out.println(str.length());
			System.out.println(str);
			System.out.println("Exception Handling");
		}
		catch (NullPointerException e){
			System.out.println(e);
		}
		
		System.out.println("\nSkipped above code due to an exception");
	}

}
