package org.jsp;

public class automorphic {
public static void main(String [] args) {
	int n=76;
	if(isAutomorphic(n)) {
		System.out.println("yes");
	}
	else System.out.println("No");
}
static boolean isAutomorphic(int n) {
	int sq=n*n;
	while(n>0) {
		if(n%10!=sq%10) {
			return false;
			
		}
		n=n/10;
		sq =sq/10;
	}
	return true;
}
}
