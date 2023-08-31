package assignment;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100; // Value up to which Fibonacci series should be generated

        System.out.println("Fibonacci series up to " + n + ":");
        int fib1 = 0;
        int fib2 = 1;
        while (fib1 <= n) {
            System.out.print(fib1 + " ");
            int nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }
	}

}
