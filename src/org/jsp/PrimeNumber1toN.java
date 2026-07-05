package org.jsp;

public class PrimeNumber1toN {
   public static void main(String [] args) {
	   for(int n=1;n<=500;n++) {
	  if(isPrimeNumber(n)){
		  System.out.println(n);
	  }
	  
	   }
	   
   }
   static boolean isPrimeNumber(int n) {
	   if(n<=1) return false;
	   for(int i=2;i<=n/2;i++) {
		   if(n%i==0) return false;
	   }
	   return true;
   }
}
