package learnJava;

public class accessModifiers {
	public static void main(String[] args) {
		defaultcheck c1 = new defaultcheck();
		c1.display();
	}
		
	}


class defaultcheck{
	void display() {
		System.out.println("Default modifier");
	}
	
}
//ACCESS modifiers :
//	private default protected public 