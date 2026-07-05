package ArraysProgram;

import java.util.Arrays;

public class ReplaceElementBySum {
public static void main(String [] args) {
	int [] arr= {10,23,33,24};
	        for(int i=0;i<=arr.length-1;i++) {
	        arr[i]	=isSum(arr[i]);
	        }
	        System.out.println(Arrays.toString(arr));
}
static int isSum(int n) {
	int sum=0;
	while(n>0) {
		int digit=n%10;
		sum=sum+digit;
		n=n/10;
	}
	return sum;
}
}
