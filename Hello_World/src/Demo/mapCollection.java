package Demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class mapCollection {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		hm.put(1, 11);
		hm.put(2, 12);
		hm.put(3, 13);
		hm.put(3, 87);
		hm.put(null, null);
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.get(3));
		
		
		System.out.println("==============================================");
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(1,"anu");
		lhm.put(4,null);
		lhm.put(5,"Chaitu");
		lhm.put(3,"Chaitu");
		lhm.put(2, "bhavana");
		lhm.put(null, null);
		System.out.println(lhm);
		lhm.remove(1);
		System.out.println("After removing key 1="+lhm);
		System.out.println(lhm.entrySet());
		
		
		System.out.println("==============================================");
		TreeMap<Integer,String> tm=new TreeMap<>();
		
		tm.put(102,"development");
		
		tm.put(103,"operations");
		tm.put(101,"hr");
		System.out.println(tm);
		System.out.println("First entry="+tm.firstEntry());
		System.out.println("first key="+tm.firstKey());
		System.out.println("Last entry="+tm.lastEntry());
		System.out.println("Last key="+tm.lastKey());
		System.out.println("After poll first entry");
		tm.pollFirstEntry();
		System.out.println(tm);
		tm.pollLastEntry();
		System.out.println("After poll last entry="+tm);
		tm.put(104, "Testing");
		//duplicate in value field
		tm.put(105, "Testing");
		tm.put(106, "operations");
		//duplicate in key field
		tm.put(103,"development");
		//add null in key field
	//	tm.put(null,null);
		System.out.println(tm.entrySet());
		System.out.println("headmap until 106"+tm.headMap(106));
		System.out.println("tail map from 105"+tm.tailMap(105));
	}

}
