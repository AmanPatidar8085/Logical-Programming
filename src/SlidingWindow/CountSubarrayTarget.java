package SlidingWindow;

public class CountSubarrayTarget {
public static void main(String[] args) {
	int arr[]= {2,5,1,8,2};
	int k=2;
	int sum=0;
	int x=9;
	int count=0;
	for(int i=0;i<=k-1;i++) {
		sum=sum+arr[i];
		if(x<sum)count++;
	}
	for(int i=1;i<=arr.length-k;i++) {
		sum=sum-arr[i-1]+arr[i+k-1];
		if(x<sum)count++;
	}
	System.out.println(count);
}
}
