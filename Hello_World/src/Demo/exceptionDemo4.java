package Demo;

public class exceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i= {2,4,6,7,8};
		String s=null;
		try
		{
		System.out.println(i[6]);//array index out of bound
//		System.out.println(s.length());//finding the length of null string
		System.out.println(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch (NullPointerException e1) {
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println(e2);
		}
		finally {
			System.out.println();
		}
	}

}
