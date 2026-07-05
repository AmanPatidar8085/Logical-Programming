package NumberSystem;

public class reverse {
public static void main(String[] args) {
	int n=1234;
	System.out.println(revsere(n));
	
}
static int revsere(int n) {
	int rev=0;
	while(n>0) {
		int digit=n%10;
		rev=rev*10+digit;
		n=n/10;
	}
	return rev;
}
}
