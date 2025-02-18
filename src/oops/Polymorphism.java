package oops;

public class Polymorphism {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(10,20));
		System.out.print(cal.add(10,20,30));

	}

}

class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}
