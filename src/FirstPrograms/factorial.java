package FirstPrograms;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		long factorial =1;
		
		for(int i=1;i<=number; i++) {
			factorial*=i;
		
		}
		System.out.println("factorial of " + number + " 5"
				+ "is " + factorial);
	sc.close();
	}
}
