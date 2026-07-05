package NumberSystem;

public class PrimeNumberOrNot {
public static void main(String [] args) {
	int n=23;
	if(isPrime(n)) {
		System.out.println("Prime No");
	}
	else {
		System.out.println("Not");
	}
}
static boolean isPrime(int n) {
	if(n<=1) return false;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0)
		return false;
	}
	return true;
}
}
