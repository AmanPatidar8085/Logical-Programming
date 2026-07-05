package org.jsp;

public class NeonNumber {
 public static void main(String [] args)
 {
	 int s=3;
	 int n=s*s;
	 boolean res=isNeon(n,s);
	 if(res==true)
		 System.out.println("Neon Number");
	 else
		 System.out.println("Not Neon Number"); 
	 
 }
 static boolean isNeon(int n,int s) {
	 int sum=0;
	 while(n>0) {
		 int digit=n%10;
		 sum=sum+digit;
		 n=n/10;
	 }
	 if(sum==s) return true;
	 else return false;
	 
 }
}
