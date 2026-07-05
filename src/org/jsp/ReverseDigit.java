package org.jsp;

public class ReverseDigit {
   public static void main(String [] args) {
	   int n=12345678;
	  System.out.println( isRevDigit(n));
   }
   static int isRevDigit(int n) {
	   int rev=0;
	   while(n>0) {
		   int digit=n%10;
		   rev=rev*10+digit;
		   n=n/10;
	   }
	   return rev;
   }
}
