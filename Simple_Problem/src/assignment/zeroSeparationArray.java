package assignment;

import java.util.Arrays;

public class zeroSeparationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,0,3,0,4,5,0,8,7}; 
		
		int[] zeros = new int[array.length];
		int[] nonZeros = new int[array.length];
		int zeroCount = 0;
        int nonZeroCount = 0;

        for (int num: array) {
            if (num == 0) {
                zeros[zeroCount] = num; 
                zeroCount++;
            } 
            else {
                nonZeros[nonZeroCount] = num;
                nonZeroCount++;
            }
        }

        zeros = Arrays.copyOf(zeros, zeroCount);
        nonZeros = Arrays.copyOf(nonZeros, nonZeroCount);
        

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Zeros array: " + Arrays.toString(zeros));
        System.out.println("Non-zeros array: " + Arrays.toString(nonZeros));
	}

}
