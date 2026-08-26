package Recursion;

public class CountDigit {
public static void main(String[] args) {
	int n=123456;
	int count=0;
	System.out.println(countDigit(n,count));
}

public static int countDigit(int n,int count) {
	// TODO Auto-generated method stub
	if(n==0)return count;
	count++;
	return countDigit(n/10,count);
}
}
