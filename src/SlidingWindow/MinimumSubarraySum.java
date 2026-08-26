package SlidingWindow;

public class MinimumSubarraySum {
	public static void main(String[] args) {
		int arr[]= {2,3,8,6,1,7,6};
		int k=3;//window size
		int sum=0;
		int minsum=Integer.MAX_VALUE;
		for(int i=0;i<=k-1;i++) {
			sum=sum+arr[i];
			minsum=sum;
		}
		for(int i=1;i<=arr.length-k;i++) {
			sum=sum-arr[i-1]+arr[i+k-1];
			minsum=Math.min(minsum, sum);
		}
		System.out.println(minsum);
		
}
}
