package NumberSystem;

public class FindLargetDigit {
public static void main(String[] args) {
	int n=5897651;
	int largest=Integer.MIN_VALUE;
	while(n>0) {
		int digit=n%10;
		if(largest<digit) {
			largest=digit;
		}
		n=n/10;
	}
	System.out.println(largest);
}
}
