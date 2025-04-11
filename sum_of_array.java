package array;

public class sum_of_array {

	public static void main(String[] args) {
		int[] arr = {1,2,3,45,67};
		int sum =0;
		for(int num : arr) {
			sum = sum+num;
			
		}
		System.out.println("Sum : " + sum);
	}

}
