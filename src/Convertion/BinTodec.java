package Convertion;

public class BinTodec {
public static void main(String[] args) {
	int n=1110;
	System.out.println(BinToDec(n));
}
static int BinToDec(int n) {

	int sum=0;
	int power=0;
	while(n>0) {
		int digit=n%10;
		int pow=(int)Math.pow(2, power);
		sum=sum+pow*digit;
		n=n/10;
		power++;
	}
	return sum;
}
}
