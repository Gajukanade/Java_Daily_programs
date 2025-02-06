package FirstPrograms;

public class largestAmongThree {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 8;
		
		if(a>=b && a>=c) {
			System.out.println(a);
		}else if(b >= a && b>=c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}

	}

}
