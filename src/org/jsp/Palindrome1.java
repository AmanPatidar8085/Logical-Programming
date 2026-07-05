package org.jsp;

public class Palindrome1 {
   public static void main(String[] args) {
	   
	   int count=0;
	   for(int n=1;n<=500;n++) {
		   if(isPallindrome(n)) {
			   count++;
		   }
	   }
		   System.out.println(count);
	   
	   
   }
   static boolean isPallindrome(int n)
   {
	   int rev=0;
	   int temp=n;
	   while(n>0) {
		   int digit =n%10;
		   rev=rev*10+digit;
		   n=n/10;
	   }
	   return rev==temp;
   }
}
