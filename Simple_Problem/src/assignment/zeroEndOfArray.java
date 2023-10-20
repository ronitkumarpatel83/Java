package assignment;

import java.util.Arrays;

public class zeroEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a ajava program to move the zeros to the end of the array.
		int[] array = {1,2,3,0,9,0,7,4,0};

		System.out.println("Original array : " + Arrays.toString(array));

        int length = array.length;
        int left = 0; // Pointer for non-zero elements

        // Iterate through the array
        for (int i = 0; i < length; i++) {
            if (array[i] != 0) {
                // Swap non-zero element with the left pointer
            	System.out.println("i : "+i); //0,1
                int temp = array[left];
                System.out.println("temp : "+temp); //1, 2,
                array[left] = array[i];
                System.out.println("array : "+array[left]); //1, 2
                array[i] = temp;
                System.out.println("array[i] : "+array[i]); //1, 2
                System.out.println("left : "+left); // 0
                left++; // Move the left pointer to the next position
            }
        }

        System.out.println("Modified array : " + Arrays.toString(array));

	}

}
