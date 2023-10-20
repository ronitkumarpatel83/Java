package assignment;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,28,17,25,1,6,3,0};
		
		int size = array.length;
	    
	    for (int i = 0; i < size - 1; i++) {
	    
	    	for (int j = 0; j < size - i - 1; j++) {
	    		if (array[j] > array[j + 1]) {
	    			int temp = array[j];
	    			array[j] = array[j + 1];
	    			array[j + 1] = temp;
	    		}
	    	}
	    }
	    System.out.println(Arrays.toString(array));
	}	    
}
