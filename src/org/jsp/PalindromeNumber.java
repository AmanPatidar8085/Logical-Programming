package org.jsp;

public class PalindromeNumber {
  public static void main(String [] args) {
	  
	  int n=121;
	  
	 if(isPalindrome(n)) {
		 System.out.println("Palindrome");
	 }
	 else {
		 System.out.println(" Not Palindrome");
	 }
	 
  }
  
  static boolean isPalindrome(int n) {
	  int x=n;
	  int rev=0;
	  while(n>0) {
		  int digit=n%10;
		  rev=rev*10+digit;
		  n=n/10;
	  }
	  if(rev==x) return true;
	  else return false;
	  
  }
}
