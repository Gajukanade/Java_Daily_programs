package FirstPrograms;

import java.util.Scanner;

public class Loops {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int number = sc.nextInt();
	System.out.println("loops end what you mentioned : ");
	for(int i=1;i<=number;i++) {
		System.out.println(i);
	}
}


}

