package org.jsp;

public class NthPrimeNumber {
  public static void main(String [] args) {
	  int count=0;
	  int i=2;
	  int n=7;
	  while(true) {
	  if(isPrimeNumber(i)) {
		  count++;
	  if(count==n) {
		  
		  System.out.println(i);
		  break;
	  } 
	  }
	  i++;
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
