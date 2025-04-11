package array;

public class Copy_one_Array_toanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5};
		int[] copy = new int[original.length];
		
		for(int i =0;i<original.length;i++) {
			copy[i] = original[i];
			
	}
		System.out.println("Copied Array : ");
		for(int num : copy ) {
			System.out.print(num + "");
		}
		
	}
	}
	
