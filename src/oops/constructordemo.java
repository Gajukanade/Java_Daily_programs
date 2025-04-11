package oops;

public class constructordemo {

	public static void main(String[] args) {
		
		bike bk = new bike();
		
		bk.displayDetails();

	}

}

class bike{
	String model;
	int price;

	//default constructor
	bike(){
		model = "default model";
		price = 5700;
	
	}
	void displayDetails() {
		System.out.println("Bike model :" + model);
		System.out.println("Bike price :" + price);
	}
	
}
