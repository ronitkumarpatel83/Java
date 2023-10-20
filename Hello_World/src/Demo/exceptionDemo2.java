package Demo;

public class exceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, res;
		i=2;
		j=0;
		try
		{
		res=(i/j);
		System.out.println("Result="+res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			//System.out.println(ae.getMessage());
			//ae.printStackTrace();
		}
		System.out.println("After try catch block...");
	}

}
