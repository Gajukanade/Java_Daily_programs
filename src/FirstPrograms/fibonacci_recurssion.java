package FirstPrograms;

import java.util.Scanner;

public class fibonacci_recurssion {
	
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fibonacci(n-1) +fibonacci(n-2);
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int terms = sc.nextInt();
		
		for(int i=0;i<terms; i++) {
			System.out.println(fibonacci(i)+ " ");
		}
		
		sc.close();

	}

}
