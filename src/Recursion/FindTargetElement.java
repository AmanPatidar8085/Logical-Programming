package Recursion;

public class FindTargetElement {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	int i=0;
	int ele=10;
	System.out.println(extist(arr,i,ele));
}

private static boolean extist(int[] arr, int i, int ele) {
	// TODO Auto-generated method stub
	if(i==arr.length)
	return false;
	if(arr[i]==ele) return true;
	return extist(arr, i+1, ele);	
	
}
}
