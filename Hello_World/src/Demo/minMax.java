package Demo;

public class minMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,7,3,9,1};
		int max = array[0];
		int min = array[0];
		
		for(int i=1;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
			if(min>array[i]) {
				min = array[i];
			}
			
		}
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}

}
