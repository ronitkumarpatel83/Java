package assignment;

import java.util.Scanner;

public class RecursionFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, f;
        f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        n=sc.nextInt();
           
        f=fact(n);//n is called the actual argument
        System.out.println("Factorial is : " +f);
        sc.close();
	}
    static int fact(int n1)//n1 is the formal argiment
    {
	  if (n1 == 0)    
		    return 1;    
		  else    
		    return(n1 * fact(n1-1));    
    }
	

}
