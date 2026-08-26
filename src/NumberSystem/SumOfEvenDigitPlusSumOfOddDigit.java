package NumberSystem;

public class SumOfEvenDigitPlusSumOfOddDigit {
public static void main(String[] args) {
	int n=587634;
	int evendigit=0;
	int odddigit=0;
//	while(n>0) {
//		int digit=n%10;
//		if(digit%2==0) evendigit+=digit;
//		else odddigit+=digit;
//	n=n/10;
//	}
//	System.out.println(evendigit+" "+odddigit);
	
	
	// using recursion
	
	sumofdigit(n,evendigit,odddigit);
	
}

private static void sumofdigit(int n, int evendigit, int odddigit) {
	// TODO Auto-generated method stub
	if(n==0) {
		System.out.println("Even digit sum = " + evendigit);
    System.out.println("Odd digit sum = " + odddigit);
    return;
	}
	int digit=n%10;
	if(digit%2==0) evendigit+=digit;
	else odddigit+=digit;
	
 sumofdigit(n/10, evendigit, odddigit);
}
}
