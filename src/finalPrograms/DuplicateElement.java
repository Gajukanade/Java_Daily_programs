package finalPrograms;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,6,4,3,2,8,9};
		System.out.println("Duplicates in an array : ");
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
//					System.out.println(arr[i] +" "+arr[j]);
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
