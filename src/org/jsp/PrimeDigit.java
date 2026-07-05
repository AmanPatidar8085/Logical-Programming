package org.jsp;

public class PrimeDigit {
  public static void main(String[] args) {
	   int n=1234567;
	   System.out.println(isCountPrimeDigit(n));
  }
  static int  isCountPrimeDigit(int n) {
	  int count=0;
	  while(n>0) {
		  int digit=n%10;
		  if(digit==2 || digit==5 || digit==7 ) {
			  count++;
		  }
		  n=n/10;
	  }
	  return count;
  }
}
