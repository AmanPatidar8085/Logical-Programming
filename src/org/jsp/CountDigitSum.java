package org.jsp;

public class CountDigitSum {
    public static void main(String[] args) {
    	int n=12345;
    	System.out.println(DigitSum(n));
    }
    
    static int DigitSum(int n) {
    	int sum=0;
    	while(n>0) {
    		int digit=n%10;
    		sum=sum+digit;
    		n=n/10;
    	}
    	return sum;
    }
}
