package oops;

public class Iheritance {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.bark();
		d1.eat();

	}

}

class Animal{
	void eat() {
		System.out.println("this animal eats food");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("this dog barks");
	}
}