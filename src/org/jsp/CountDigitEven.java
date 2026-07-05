package org.jsp;

public class CountDigitEven {
   public static void main(String [] args) {
	   int n=1234;
	   int evensum=0;
	   while(n>0) {
		   
			   int digit=n%10;
			   if(digit%2==0) {
			   evensum=evensum+digit;
			   }
			   n=n/10;
		   
	   }
	   System.out.println(evensum);
   }
}
