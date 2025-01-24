package FirstPrograms;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str1 = sc.nextLine();
		
		String rev = "";
		
		for(int i=str1.length()-1;i>=0;i--) {
		rev += str1.charAt(i);
		
	}
		System.out.println(rev);
	}
}
