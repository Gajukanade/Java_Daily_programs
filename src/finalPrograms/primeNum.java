package finalPrograms;

public class primeNum {

	public static void main(String[] args) {
	
//		number is divided by one or itself that is prime
		int n = 17;
		boolean isprime = true;
		
//     for (int i = 2; i * i <= n; i++)	 optimize for loop for less iterations
		for(int i=2;i<=n-1;i++) {
			if(n%i ==0) {
				isprime = false; //if divisible its not prime
				break;
		
			}
			
		}
		if(isprime) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}
