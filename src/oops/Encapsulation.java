package oops;

public class Encapsulation {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		//set value using setters
		emp.setName("Gajanan");
		System.out.println(emp.getNmae());

	}

}

class Employee{
	private String name;
	private double salary;
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getNmae() {
		return name;
	}
	
}