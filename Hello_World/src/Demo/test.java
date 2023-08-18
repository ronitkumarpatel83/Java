package Demo;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mydouble = 1234.9876544;
		
		int myInt = (int) mydouble;
		System.out.println(mydouble);
		System.out.println(myInt);
		
		int myInteger = 9;
	    double myDoub = myInteger;

	    System.out.println(myInteger); 
	    System.out.println(myDoub); 
	    System.out.println("====================================");
	    
	    String num1 = "2";
	    String num2 = "3";
	    
	    String sum = num1 + num2;
	    System.out.println(sum);
	    
	    int z = 9;
	    z /= 2;
	    
	    System.out.println("/ : "+z);
	    int a = 9;
	    a %= 2;
	    
	    System.out.println("%= : "+a);
	    a++;
	    System.out.println("++ : "+a);
	    a--;
	    System.out.println("-- : "+a);
	    a += 6;
	    System.out.println("+= : "+a);
	    a *= 3;
	    System.out.println("*= : "+a);
	    a %= 2;
	    System.out.println("%= : "+a);
	    
	    System.out.println("==============================");
	    int math = 50;
	    int chemistry = 55;
	    int physics = 45;
	    int total, average;
	    
	    total = math + chemistry + physics;
	    average = total/3;
	    System.out.println(" Average of marks : "+average);
		
	    System.out.println("=============== BITWISE OPERATORS ===============");
	    int x = 5;
	    int y = 7;
	    // bitwise AND
	    // 0101 & 0111 = 0101 = 5
	    System.out.println("x & y : "+( x & y));
	    
	    // bitwise or
	    // 0101 | 0111 = 0111 = 7
	    System.out.println("x | y : "+( x | y));
	    
	    x &= y;
	    System.out.println("x= : "+ x);
	    System.out.println("\n=============== ARITHMETIC OPERATORS ===============\n");
	    System.out.println("(+,-,/,*,++,--)");
	    int b = 5;
	    
	    b++;
	    System.out.println("Post Increament of b : "+b);
	    ++b;
	    System.out.println("Pre Increament of b : "+b);
	    b--;
	    System.out.println("Post Decreament of b : "+b);
	    --b;
	    System.out.println("Pre Decreament of b : "+b);
	    
	    
	}

}
