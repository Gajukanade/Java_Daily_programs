package finalPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String original = "madam";
		String reversed = "";
		
		for(int i = original.length()-1;i>=0;i--) {
			reversed += original.charAt(i);
			
		}
		if(original.equals(reversed)) {
			System.out.println("palindromeString");
			
		}else {
			System.out.println("not palindrome");
		}

	}

}
