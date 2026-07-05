package Convertion;

public class DecimaltoBinary {
public static void main(String[] args) {
	int n=14;
	System.out.println(DecToBin(n));
}
static String DecToBin(int n) {
	String bin="";
	while(n>0) {
		int rem=n%2;
		 bin=rem+bin;
		 n=n/2;
	}
	return bin;
}
}
