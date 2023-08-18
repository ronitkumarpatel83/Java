package Demo;

import java.util.Scanner;

public class Control_Flow_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check the single digit number;
		Scanner sc = new Scanner(System.in);
		System.out.println("======== If Statement ==========");
		System.out.println("\nCheck the single digit number\n");
		System.out.println("Enter the value to check single digit number : ");
		int a = sc.nextInt();
		if ((a>=(-9))&&(a<=9)) {
			System.out.println("This is a single digit number : "+a);
		}
		
		System.out.println("======== If-else Statement ==========\n");
		
		if ((a>=(-9))&&(a<=9)) {
			System.out.println("This is a single digit number : "+a);
		}
		else {
			System.out.println("This is not a single digit number : "+a);
		}
		
		System.out.println("======== If-else-if Statement ==========\n");
		System.out.println("Enter the marks between 0 to 100 : ");
		int marks=sc.nextInt();  
	      
	    if ((marks>=0)&&(marks<50)){  
	        System.out.println("fail");  
	    }  
	    else if(marks>=50 && marks<60){  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=60 && marks<70){  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80){  
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90){  
	        System.out.println("A grade");  
	    }else if(marks>=90 && marks<100){  
	        System.out.println("A+ grade");  
	    }else{  
	        System.out.println("Invalid!");  
	    } 
		
		
		System.out.println("======== Nested If-else Statement ==========\n");
		System.out.println("Check you are eligible or not for blood donate");
		System.out.println("Enter the age : ");
		int age= sc.nextInt(); 
		System.out.println("Enter the weigth : ");
	    int weight=sc.nextInt();    
	    //applying condition on age and weight  
	    if(age>=18){    
	        if(weight>50){  
	            System.out.println("You are eligible to donate blood");  
	        }
	        else {
	        	System.out.println("You are not eligible to donate because your weigth is low");
	        }
	    }
	    else {
	        System.out.println("You are not eligible to donate because your age is below 18");
	    } 
	    sc.close();
		
	}

}
