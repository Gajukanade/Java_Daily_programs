package FirstPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class largest_in_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the array: ");
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		System.out.println("Enter"+ size +" numbers to add in the array :");
		
		for(int i=0;i<size;i++) {
			numbers[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(numbers));
		
		
		
	}
}
