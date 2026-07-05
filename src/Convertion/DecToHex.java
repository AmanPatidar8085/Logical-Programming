package Convertion;

public class DecToHex {
public static void main(String[] args) {
	int n=31;//-->1F
	System.out.println(DecHex(n));
}
static String DecHex(int n) {
	String hex="";
	while(n>0) {
		int rem=n%16;
		if(rem>9) {
			hex=(char)(rem+55)+hex;
		}
		else{
			hex=rem+hex;
		}
		n=n/16;
	}
	return hex;
}
}
