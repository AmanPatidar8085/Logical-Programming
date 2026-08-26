package ArraysProgram;

public class Fibonacci {
public static void main(String[] args) {
	int n=15;
	int f1=0;
	int f2=1;
	
	System.out.print(f1+" "+f2+" ");
	for(int i=0;i<n-2;i++) {
		int sum=f1+f2;
		System.out.print(sum+" ");
		f1=f2;
		f2=sum;
	}
	
}
}
