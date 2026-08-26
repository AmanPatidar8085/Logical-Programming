package SlidingWindow;

public class Maximumsubbraysum {
public static void main(String[] args) {
	int arr[]= {2,3,8,6,1,7,6};
	int k=3;//window size
	int sum=0;
	int maxsum=Integer.MIN_VALUE;
	for(int i=0;i<=k-1;i++) {
		sum=sum+arr[i];
		maxsum=sum;
	}
	for(int i=1;i<=arr.length-k;i++) {
		sum=sum-arr[i-1]+arr[i+k-1];
		maxsum=Math.max(maxsum, sum);
	}
	System.out.println(maxsum);
	
}
}
