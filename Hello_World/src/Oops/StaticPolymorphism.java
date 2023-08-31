package Oops;


class Adder{
	int add(int a, int b) {
		return a + b;
	}
	
	double add(double a, double b) {
		return a + b;
	}
}


public class StaticPolymorphism { // compile time polymorphism

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder obj = new Adder();
		int total = obj.add(3, 9);
		double total2 = obj.add(4.0, 8.0);
		System.out.println("Int value : "+total +" \ndouble value : "+total2);
	}

}
