package NumberSystem;

public class Palindrome {

	
	public static void main(String[] args) {
		int n=121;
		if(ispalindrome(n)) System.out.println("palindrome");
		else System.out.println("notPlindrome");
	}
	static boolean ispalindrome(int n) {
		int rev=0;
		int n1=n;
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		return rev==n1;
	}
}
