package Demo;

public class loopingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ente a value : ");
		int num = 0;
		
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		System.out.println("=============================");
		int num2 = 1;
		
		while(num2<=10) {
			
			int mul = num2 * 2;
			System.out.println(mul);
			num2++;
		}
		System.out.println("=============Do while================");
		
		int num3 = 1;
		
		do {
			int mul2 = num3 * 3;
			System.out.println("Multiplication of 3"+" * "+ num3+ " : " +mul2);
			num3++;
		} while(num3 <= 10);
		
		System.out.println("====================================\n");
		System.out.println("Display the odd numbers from 1 to 10");
		int num4 = 1;
		
		do {
			if (num4 % 2 != 0) {
				System.out.println(num4);
			}
			num4++;
		}while(num4 <= 10);
		
		System.out.println("=============For loop================");
		int num5;
		for(num5=2;num5<=20;num5 = num5+2) {
			System.out.println(num5);
		}
		System.out.println("=============loop================");
		int innerloop = 1, outerloop = 1;
		while (outerloop <= 5) {
			innerloop = 1;
			while (innerloop <= 5) {
				System.out.print("*");
				innerloop++;
			}
			System.out.println("\n");
			outerloop++;
		}
		
		System.out.println("=============loop================");
		int mul_2;
		for (mul_2 = 1;mul_2 <= 10;mul_2++) {
			System.out.println("2 * "+mul_2+" = "+mul_2*2);
		}
		
		
		System.out.println("=============================");
		int i,n,r;
		for(n=2;n<=3;n++) {
			System.out.println("Multiplication of "+n);
			for(i=1;i<=10;i++) {
//				System.out.println( n+" * "+i+" = "+i*n);
				r = i * n;
				System.out.println(n+" * "+i+" = "+ r);
			}
		}

	}

}
