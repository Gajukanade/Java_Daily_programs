package FirstPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();

		if (number %2==0) {
			System.out.println("Even");
		}else {
			System.out.println("ODD");
		}

		sc.close();
	}

}
