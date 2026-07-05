package Recursion;

public class NthPowerP {
public static void main(String[] args) {
	int n=2;
	int p=4;
	System.out.println(pow(n,p));
	
}
public static int pow(int n,int p)
{
	if(p==0)return 1;
	return n*pow(n,p-1);
}
}
