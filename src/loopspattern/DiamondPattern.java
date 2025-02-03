package loopspattern;

public class DiamondPattern {

	public static void main(String[] args) {
		int rows = 5;
		
		for(int i=1;i<=rows;i++) { // rows
			for(int j=i;j<rows;j++) { //column
				System.out.print(" * ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print(" # ");
			}
			System.out.println();
			
		}
		for(int i=5;i>=1;i--) {
			for(int j=i;j>1;j--) {
				System.out.print(" * ");
			}
			for(int j=5; j>=(2*1-1);j--) {
				System.out.print("  ");
			}
		System.out.println();
		}
		

	}

}
