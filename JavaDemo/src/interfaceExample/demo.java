package interfaceExample;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your b.tech percentage");
        float percentage=sc.nextFloat();
       
        if(percentage>=60)
        {
        	System.out.println("Please enter your age");
            byte age=sc.nextByte();
            if(age<50)
            {
            	System.out.println("Please enter your enxperiewnce in years");
                byte experience=sc.nextByte();
                if(experience>4)
                {
                	System.out.println("You are eligible for this job role. You can walkin for an interview");
                }
                else
                {
                	System.out.println("You are not eligible for this job role since your experience is less than 4 years");
                }
            }
            else
            {
            	System.out.println("You are not eligible for this job role since your age is more than 50");
            } 
        }
        else
        {
        	System.out.println("You are not eligible for this job role since your percentage is less than 60");
        }
        
	
	}

}
