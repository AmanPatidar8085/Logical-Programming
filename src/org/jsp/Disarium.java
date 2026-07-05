package org.jsp;

public class Disarium {
public static void main(String[] args) {
	int n=175;
	if(isDisarium(n)) {
		System.out.println("Disarium");
	}
	else {
		System.out.println(" Not Disarium");
	}

}
static boolean isDisarium(int n) {
	int sum=0;
	int temp=n;
	int count=isCount(n);
	while(n>0) {
		int digit=n%10;
		int pow=(int)Math.pow(digit, count);
		sum=sum+pow;
		count--;
		n=n/10;
	}
	return sum==temp;
	
}
static int isCount(int n){
	int count=0;
	while(n>0) {
		count++;
		n=n/10;
	}
	return count;
}
}
