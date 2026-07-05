package org.jsp;

public class Factorial {
   public static void main(String [] args) {
	   int n=7;
	  System.out.println( isFactorial(n));
   }
   static int isFactorial(int n) {
	   int fact=1;
	   for(int i=1;i<=n;i++) {
	   fact=fact*i;
	   }
	   return fact;
   }
}
