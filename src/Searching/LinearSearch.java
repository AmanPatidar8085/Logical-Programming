package Searching;

public class LinearSearch {
public static void main(String[] args) {
	int arr[]= {4,2,3,1,7,6};
	int target=9;
	
   int index=found(arr,target);
   if(index==-1)System.out.println("not found");
   else
   System.out.println(index);
	
	}
  static int found(int arr[],int target) {
	for(int i=0;i<=arr.length-1;i++) {
		if(target==arr[i])return i;
		
	}
	return -1;
}
}
