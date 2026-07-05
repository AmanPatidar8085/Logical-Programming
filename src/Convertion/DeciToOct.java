package Convertion;

public class DeciToOct {
public static void main(String[] args) {
	int n=14;
	System.out.println(decToOct(n));
}
static String decToOct(int n) {
	String bin="";
	while(n>0) {
		int rem=n%8;
		bin=rem+bin;
		n=n/8;
	}
	return bin;
}
}
