package oops;

public class Abstraction {

	public static void main(String[] args) {
		shape s1 = new Circle();
		s1.draw(); //calls abstract method implementation
	}
}

abstract class shape {
	abstract void draw();  //abstract method
}

class Circle extends shape{
	void draw() {
		System.out.println("Drawing a circle");
	}
}