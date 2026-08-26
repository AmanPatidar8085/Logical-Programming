package SlidingWindow;

public class MaximumElemetEachWindow {
public static void main(String[] args) {
	int arr[]= {1,3,-1,-3,5,3,6,7};
	int k=3;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<=k-1;i++) {
		if(max<arr[i]) {
		max=arr[i];
		}
	}
	System.out.println("Maximum elem is "+max);
	
	for(int i=1;i<=arr.length-k;i++) {
	int max1=Integer.MIN_VALUE;
		for(int j=i;j<=i+k-1;j++) {
			if(max1<arr[j]) max1=arr[j];
		}
		System.out.println("Maximum elem is "+max1);
	}
}
}
