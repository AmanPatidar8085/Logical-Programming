package org.jsp;

public class Power {
 public static void main(String [] args) {
	 int n=2;
	 int p=3;
	 System.out.println(isPower(n,p));
 }
 static int isPower(int n,int p) {
	 int pow=1;
	 for(int i=1;i<=p;i++) {
		 pow=pow*n;
	 }
	 return pow;
 }
}
