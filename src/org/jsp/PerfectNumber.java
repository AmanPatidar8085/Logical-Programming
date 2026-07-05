package org.jsp;

public class PerfectNumber {
  public static void main(String []args) {
	  int n=6;
	  isperfect(n);
	  }
  static void isperfect(int n) {
	  
	  int sum=0;
	  for(int i=1;i<=n/2;i++) {
		  if(n%i==0) {
			  sum=sum+i;
		  }
	  
  }
	  if(sum==n) {
		  System.out.println("perfect number");
	  }
	  else {
		  System.out.println(" not perfect number");
	  }
  }
}
