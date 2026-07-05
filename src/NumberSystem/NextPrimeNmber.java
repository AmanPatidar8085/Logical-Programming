package NumberSystem;

public class NextPrimeNmber {
public static void main(String[] args) {
	int n=11;
	
	while(true) {
		n++;
		if(isPrime(n)) {
			System.out.println(n);
			break;
		}
		
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
