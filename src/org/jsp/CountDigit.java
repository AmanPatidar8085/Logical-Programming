package org.jsp;

public class CountDigit {
  
	 public static void main(String[] args) {
		 int n=1234;
		 System.out.println(Digit(n));
	 }
	 
	 static int Digit(int n) {
		 
		 int count=0;
		 while(n>0) {
			 int digit =n%10;
			 count++;
			 n=n/10;
		 }
		 return count;
	 }
	
	
}
