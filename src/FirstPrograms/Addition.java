package FirstPrograms;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number :");
		int num2 = sc.nextInt();
		
		
//		int num1 = 10;
//		int num2 = 20;
		int sum = num1 + num2;
		System.out.println("The Sum is "+ sum);
	}

}
