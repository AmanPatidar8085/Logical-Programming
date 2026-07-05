package org.jsp;

public class SumOddDigitPrimeNum {
  public static void main(String[] args) {
	  int n=3721;//  3+7+1=11 11 is prime Number
	  int sum=(isOddDigitSum(n));
	  if(isPrime(sum))
		  System.out.println("Prime Number");
	  else
		  System.out.println(" Not Prime Number");
  }
   static int isOddDigitSum(int n) {
	   int sum=0;
	   while(n>0) {
	   int digit=n%10;
	   if(digit%2==1) {
		   sum=sum+digit;
		  
	   }
	   n=n/10;
	   
	   }
	   return sum;
	   
   }
   static boolean isPrime(int n) {
	   if(n<=1)
		   return false;
	   for(int i=2;i<=n/2;i++) {
		   if(n%i==0) return false;
	   }
	   return true;
   }
}
