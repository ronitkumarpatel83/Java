package Demo;

import java.util.Stack;
import java.util.Vector;

public class StackExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<>();
		
		st.push("A");
		st.push("B");
		st.push("C");
		System.out.println("Push : "+st);
		
		System.out.println("Last item : "+st.lastElement());
		System.out.println("Last item : "+st.firstElement());
		st.pop();
		System.out.println("Pop : "+st);
		System.out.println("Peek : "+st.peek());
		
		Vector<Float> vc = new Vector<>();
		vc.add(2.3F);
		vc.add(4.3F);
		vc.add(6.3F);
		System.out.println("Vector : "+vc);
	}

}
