package FirstPrograms;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of terms : ");
		int n = sc.nextInt();
		
		int first = 0;
		int second = 1;
		System.out.println("fibonacci series : ");
		
		for(int i=0;i<=n;i++) {
			System.out.println(first+" ");
			int next = first + second;
			first = second;
			second = next;
			
		}
	
	}
	
	
	
	

}
