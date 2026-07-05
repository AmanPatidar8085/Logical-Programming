package org.jsp;

public class EvenSumDigit {
  public static void main(String [] args)
  {
	  int n=1234567;
	  System.out.println(isEvenSumDigi(n));
  }
  
  static int isEvenSumDigi(int n)
  {
	  int EvenSum=0;
	  while(n>0)
	  {
		  int digit=n%10;
		  if(digit%2==0)
		  {
			  EvenSum=EvenSum+digit;
			  
		  }
		  n=n/10;
	  }
	  
	  return EvenSum;
	  
  }
}
