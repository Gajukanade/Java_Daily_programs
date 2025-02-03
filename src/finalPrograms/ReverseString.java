package finalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER A STRING  :" );
			
			String input = sc.nextLine();
			
//			System.out.println(rev());	
			String finalRev = rev(input);
			
			System.out.println("final Reversed string "+ finalRev);
			
		}
	
	public static String rev(String str) {
		String reversed = " ";
		
		for(int i =str.length()-1;i>=0;i--) {
			reversed += str.charAt(i);
			
		}
		return reversed;
		
	}
	

	}
