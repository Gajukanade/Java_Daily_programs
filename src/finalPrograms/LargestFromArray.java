package finalPrograms;

public class LargestFromArray {

	public static void main(String[] args) {
		
		int[] arr = {10,20,70,33,55,77,88};
		int max = 0;
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		System.out.println("Largest from array is : " + max);

	}

}
