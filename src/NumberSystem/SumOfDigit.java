package NumberSystem;

public class SumOfDigit {
public static void main(String [] args) {
	int n=123456;
	System.out.println(SumDigit(n));
}
static int SumDigit(int n) {
	int count=1;
	while(n>0) {
		int digit=n%10;
		count*=digit;
		n=n/10;
	}
	return count;
}
}
