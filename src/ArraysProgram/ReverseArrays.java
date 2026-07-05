package ArraysProgram;

import java.util.Arrays;

public class ReverseArrays {
public static void main(String [] args) {
	int arr[]= {12,34,24,14,53};
	arr=reverse(arr);
	System.out.println(Arrays.toString(arr));
}
static int[] reverse(int arr[]) {
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	return arr;
}
}
