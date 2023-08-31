package Demo;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating HashSet and adding elements  
	   Set<String> set=new HashSet<>();  
       set.add("One");    
       set.add("Two");    
       set.add("Three");   
       set.add("Four");  
       set.add("Five");  
       set.add("Two");
	   Set<String> set1= new HashSet<String>();
       set1.addAll(set);
       System.out.println(set.equals(set));
       System.out.println(set+" \n"+set1);
         
	 
	}

}
