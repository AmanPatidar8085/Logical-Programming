package ArraysProgram;

import java.util.Arrays;

public class sumofdigit {
public static void main(String[] args) {
	int arr[]= {12,34,1342,20};
	//          3,  7  10   2
	
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sumofdigit(arr[i]);
	}
	System.out.println(Arrays.toString(arr));
}
static int sumofdigit(int n) {
	int sum=0;
	while(n>0) {
		int digit=n%10;
		sum+=digit;
		n=n/10;
	}
	return sum;
}
}
