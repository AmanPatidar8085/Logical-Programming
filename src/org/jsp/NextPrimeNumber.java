package org.jsp;

public class NextPrimeNumber {
  public static void main(String [] args) {
	  int n=17;
	  while(true) {
		  n++;
	  if(isPrimeNumber(n)) {
		  System.out.println(n);
		  break;
	  }
	  
	  }
  }
  

  static boolean isPrimeNumber(int n) {
	  
	  if(n<=1) return false;
	  for(int i=2;i<=n/2;i++) {
		  if(n%i==0) {
			  return false;
		  }
	  }
	  return true;
  }
}
