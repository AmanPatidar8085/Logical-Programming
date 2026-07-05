package NumberSystem;

public class FactorialNumber {
public static void main(String [] args) {
	int n=5;
	int fa=factorial(n);
	System.out.println(fa);
}
static int factorial(int n) {
	int fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
		
	}
	return fact;
}
}
