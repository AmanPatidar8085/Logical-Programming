package Sorting;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int arr[]= {5,3,8,6,2,9,1,6,4,8};
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
