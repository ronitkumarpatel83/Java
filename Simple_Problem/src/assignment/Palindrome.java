package assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For String palindrome
//		String str = "MADA";
//		String rev = "";
//		
//		for (int i=str.length()-1;i>=0;i--) {
//			rev += str.charAt(i);
//		}
//		System.out.println(rev);
		
		// for integer
		
		int num = 12321,rem,value=0;
//		int m = num;
		
		while (num>0) {
			rem = num%10;
//			System.out.println(num);
			value = (value*10)+rem;
			System.out.println(value);
			num = num/10;
		}
		System.out.println(value);
		
	}

}
