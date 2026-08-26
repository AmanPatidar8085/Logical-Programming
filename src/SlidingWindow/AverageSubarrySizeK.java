package SlidingWindow;

public class AverageSubarrySizeK {
public static void main(String[] args) {
	int arr[]= {2,3,8,6,1,7,6};
	int k=3;
	double sum=0;
	double avg=0;
	double maxavg=Integer.MIN_VALUE;
	for(int i=0;i<=k-1;i++) {
		sum=sum+arr[i];
		avg=sum/k;
		maxavg=avg;
	}
	for(int i=1;i<=arr.length-k;i++) {
		sum=sum-arr[i-1]+arr[i+k-1];
		avg=sum/k;
		maxavg=Math.max(maxavg, avg);
	}
	System.out.println(maxavg);
	
	
}
}
