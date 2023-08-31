package Demo;

//import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
	public static void main(String args[]){  
		 //Creating HashSet and adding elements  
//		LinkedHashSet<String> set=new LinkedHashSet<String>();  
//        set.add("monday");    
//		set.add("tuesday");    
//		set.add("wednesday");   
//		set.add("thursday");  
//		set.add("friday");
//		set.add("saturday");
//		set.add("sunday");
//		set.add("monday");
//		System.out.println(set);
//	    Iterator<String> i=set.iterator();  
//	    while(i.hasNext())  
//	    {  
//	    System.out.println(i.next());  
//	    }  
//	    System.out.println("check contains monday "+set.contains("monday"));
//	    System.out.println(set.hashCode());
//	    LinkedHashSet<String> set1;
//	    set1=(LinkedHashSet<String>)set.clone();
//	    set1.clear();
//	    String[] str;
//	    str=(String[])set1.toArray();
//	    System.out.println(set1.toArray());
//	    System.out.println(set1.isEmpty());
//	    System.out.println(set1.getClass());
//	    System.out.println(set1.hashCode());
		
		
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		
	}  
}
