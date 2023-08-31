package patternProgramming;

public class patternFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int n =1;n<=i-1;n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
