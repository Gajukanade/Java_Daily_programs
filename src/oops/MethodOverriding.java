package oops;

public class MethodOverriding {

	public static void main(String[] args) {
		
		Vehicle mycar = new car(); // upcasting 
		mycar.start();

	}

}

class Vehicle{
	void start() {
		System.out.println("Vehicle starting....");
	}
}

class car extends Vehicle{
	void start() {
		System.out.println("car is starting with a key");
	}
}