package Recursion;

public class ReveseNumber {
public static void main(String[] args) {
	int n=1234;
	int rev=0;
	System.out.println(reverse(n,rev));
}
static int reverse(int n,int rev) {
	if(n==0)return rev;
	rev=rev*10+n%10;
	return reverse(n/10,rev);
}
}
