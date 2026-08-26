package Recursion;

public class GCD {
public static void main(String[] args) {
	int n=8;
	int m=4;
	int i=1;
	int gcd=0;
	System.out.println(gcdfunction(n,m,i,gcd));
}

private static int gcdfunction(int n, int m, int i, int gcd) {
	// TODO Auto-generated method stub
	if(i>n||i>m)return gcd;
	if(n%i==0&&m%i==0)gcd=i;
	return gcdfunction(n, m, i+1, gcd);
}
}
