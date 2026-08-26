package Recursion;

public class checkprime {
public static void main(String[] args) {
	int n=11;
	int i=2;
	if(isprime(n,i)) {
		System.out.println("yes");
		
	}
	else {
		System.out.println("No");
	}
}

private static boolean isprime(int n, int i) {
	// TODO Auto-generated method stub
	if(n<=1)return false;
	if(i>n/2)return true;
	if(n%i==0)return false;
	return isprime(n, i+1);
}
}
