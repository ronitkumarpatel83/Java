package Demo;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int b;
//		int a[] = new int[5];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//		b = a.length;
//		
//		System.out.println("Length of the array : "+b);
//		for (int i=0;i<b;i++) {
//			System.out.println(a[i]);
//		}
//		
//		System.out.println("Multi Dimensional array ");
//		int k,j;
//		int[][] student = {
//				{60,70,60,78},
//				{85,87,78,80},
//				{87,78,67,89}};
//		for(k=0;k<3;k++) {
//			for(j=0;j<4;j++) {
//				System.out.println("Students "+k+" "+j+" = "+student[k][j]);
//			}
//		}
		
//		System.out.println("Foreach loop for array\n");
//		
//		char[] vowel = {'a','e','i','o','u'};
//		System.out.println("Output of for loop ============== ");
//		for (int i = 0;i<vowel.length;i++) {
//			System.out.println("For loop = "+vowel[i]);
//		}
//		
//		System.out.println("Output of for each loop ============== ");
//		for (char c : vowel) {
//			System.out.println("For each = "+c);
//		}
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Python");
		arr.add("Java");
		arr.add("C#");
		System.out.println(arr);
		
		List<String> list = new ArrayList<>();
		list.add("Kaju");
		list.add("Katli");
		list.remove(0);
		list.contains("Kaju");
//		list.set(0, "Jadu");
		list.add(0, "BADAM");
		System.out.println(list);
				
		
		

	}

}
