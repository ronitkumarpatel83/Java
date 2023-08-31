package Oops;

/**
 * This example demonstrates method overriding
 */
//Parent class
class Vehicle {
	void run() {
		System.out.println("Vehicle is runnig");
	}	
}
// Child class
class Truck extends Vehicle {
	@Override
	void run() {
		System.out.println("Truck is running");
	}
}

public class PolymorphismOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Vehicle();
		obj.run();
		Vehicle obj2 = new Truck();
		obj2.run();
	}

}
