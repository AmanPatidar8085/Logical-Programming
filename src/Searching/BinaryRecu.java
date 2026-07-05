package Searching;

public class BinaryRecu {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60,70};
	int target=30;
	int low=0;
	int high=arr.length-1;
	System.out.println(Binarysearch(arr,target,low,high));
	
}
static int Binarysearch(int arr[],int target,int low,int high) {
	int mid=(low+high)/2;
	if(low>high)return mid;
	if(target==arr[mid])return mid;
	else if(target>mid)return Binarysearch(arr,target,mid+1,high);
	else return Binarysearch(arr,target,low,mid-1);
	
}
}
