package oops;

public class democlass {
	String brand;
	int speed;
	
	void displayDetails() {
		System.out.println("Car Brand : " + brand);
		System.out.println("Car speed : " + speed);
		
	}
	
	public static void main(String[] args) {
		
		democlass dm = new democlass();
		
		//setting properties
		dm.brand = "gwagan";
		dm.speed = 230;
		
		dm.displayDetails(); //methods calling 
	}

}


