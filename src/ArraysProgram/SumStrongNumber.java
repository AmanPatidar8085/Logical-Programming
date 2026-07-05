package ArraysProgram;

public class SumStrongNumber {
public static void main(String [] args) {
	int arr[]= {145,40585,2,3,123,432};
	int sum=0;
	for(int i=0;i<=arr.length-1;i++) {
		if( isStrongnumber(arr[i])) {
			sum+=arr[i];
		}
	}
	System.out.println(sum);
}


static  boolean isStrongnumber(int n) {
	int sum=0;
	int temp=n;
	while(n>0) {
		 int digit=n%10;
		 sum+=factorial(digit);
		 n=n/10;
		
		
	}
	return sum==temp;
}

static int factorial(int digit) {
	int fact=1;
	for(int i=1;i<=digit;i++) {
		fact=fact*i;
	}
	return fact;
}
}
