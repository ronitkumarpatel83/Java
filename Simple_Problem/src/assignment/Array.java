package assignment;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finding the minimum and maximum in array of elements
		
		int array[] = {10,12,33,4,15,76,37,38,119};
		int min = array[0];  
        int max = array[0];  
        
        for (int i = 1; i < array.length; i++) {
        	
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];  
            }
        }
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
	}

}
