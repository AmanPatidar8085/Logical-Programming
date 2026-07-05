package org.jsp;

public class BineryToDecimal {
public static void main(String[] args) {
	int bin=1111;
	System.out.println(isBinToDec(bin));
}
static int isBinToDec(int bin) {
	int sum=0,p=0;
	while(bin>0) {
		int digit=bin%10;
		int pow=(int)(Math.pow(2, p));
		sum=sum+digit*pow;
		bin=bin/10;
		p++;
	}
	return sum;
}
}
