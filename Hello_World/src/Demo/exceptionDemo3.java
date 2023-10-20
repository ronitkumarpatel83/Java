package Demo;

public class exceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,5};//index values are 0,1,2,3
		try
		{
		for(int i=0;i<=a.length;i++)//trying to access a[4]
		{
			System.out.println(a[i]);
		}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("inside the finally block");
		}
	}

}
