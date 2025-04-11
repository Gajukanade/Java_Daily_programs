package finalPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num = 8;
		int first =0;
		int second = 1;
//		System.out.print(first + " " + second+" ");

		
		for(int i=0;i<=num;i++) {
			int next = first + second;
			System.out.print(first+ " ");
			first = second;
			second = next;
		
			
		}

	}

}
