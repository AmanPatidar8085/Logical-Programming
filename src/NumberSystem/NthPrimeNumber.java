package NumberSystem;

public class NthPrimeNumber {
public static void main(String[] args) {
	int n=15;
	int count=0;
	int i=2;
	while(true) {
		if(isPrime(i)) {
			System.out.println(i);
			count++;
			
		}
		i++;
		if(count==n) break;
	}
	
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
}