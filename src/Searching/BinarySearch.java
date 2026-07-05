package Searching;

public class BinarySearch {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60,70};
	int target=70;
	int low=0;
	int high=arr.length-1;
	
	System.out.println(BinarySearch(arr,target,low,high));
	
}
static int BinarySearch(int arr[],int target,int low,int high) {
	while(low<=high) {
		int mid=(low+high)/2;
		if(target==arr[mid])return mid;
		else if(target>mid)low=mid+1;
		else if(target<mid)high=mid-1;
	}
	return -1;
}
}
