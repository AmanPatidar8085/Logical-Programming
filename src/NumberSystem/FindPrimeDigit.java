package NumberSystem;

public class FindPrimeDigit {
public static void main(String [] args) {
	int n=1234579;
	System.out.println(count(n));
}
static boolean isPrime(int n) {
	if(n<=1) return false;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) return false;
	}
	return true;
}
static int count(int n) {
	int count=0;
	while(n>0) {
		int digit=n%10;
		if(isPrime(digit)) {
			count++;
		}
		n=n/10;
	}
	return count;
}
}
