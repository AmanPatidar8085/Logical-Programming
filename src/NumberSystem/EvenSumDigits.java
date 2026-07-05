package NumberSystem;

public class EvenSumDigits {
public static void main(String[] args) {
	int n=123455;
	System.out.println(Digit(n));
}
static int Digit(int n) {
	int evensum=0;
	while(n>0) {
		int digit=n%10;
		if(digit%2==0) {
			evensum+=digit;
		}
		n=n/10;
	}
	return evensum;
}
}
