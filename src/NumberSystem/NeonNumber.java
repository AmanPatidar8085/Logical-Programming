package NumberSystem;

public class NeonNumber {
public static void main(String[] args) {
	int n=9;
	if(isNeon(n)) {
		System.out.println("Neon");
	}
	else {
		System.out.println("Not");
	}
	
}
static boolean isNeon(int n) {
	int sq=n*n;
	int sum=0;
	while(sq>0) {
		int digit=sq%10;
		sum+=digit;
		sq=sq/10;
	}
	return sum==n;
}
}
