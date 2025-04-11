package oops;

public class ClassAndObjects {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "gaja";
		s1.rollno = 23;
		s1.display();
	}
	}
	class Student{
		String name;
		int rollno;
		
		
		void display() {
			System.out.println(name);
			System.out.println(rollno);
		}
	
}
