package NumberSystem;

public class DiffenNextPrevNumber {
public static void main(String[] args) {
	int n=9;
	int res=nextPrime(n)-prevPrime(n);
   System.out.println(res);
	
}
static boolean isPrime(int n) {
	if(n<=1) return false;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
static int nextPrime(int n) {
	n++;
	while(true) {
		if(isPrime(n)) {
			System.out.println(n);
			break;
		}
		n++;
	}
	return n;
}
static int prevPrime(int n) {
	n--;
	while(true) {
		if(isPrime(n)) {
			System.out.println(n);
			break;
		}
		n--;
	}
	return n;
}
}
