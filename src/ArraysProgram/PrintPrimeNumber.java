package ArraysProgram;

public class PrintPrimeNumber {
public static void main(String [] args) {
	int n=351679;
	String str=n+"";
	for(int i = 0; i <= str.length()-1; i++) {
        for(int j = i + 1; j <= str.length(); j++) {

            String sub = str.substring(i, j);
            int num = Integer.parseInt(sub);
            if(isPrime(num)) {
                System.out.println(num);
            }
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
