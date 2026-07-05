package ArraysProgram;

public class Kadance {
public static void main(String[] args) {
	int arr[]= {3,-4,5,4,-1,7,-8};
	int currsum=0;
	int maxsum=Integer.MIN_VALUE;
	for(int i=0;i<=arr.length-1;i++) {
		currsum+=arr[i];
		maxsum=Math.max(currsum, maxsum);
		if(currsum<0) {
			currsum=0;
		}
	}
	System.out.println(currsum);
	System.out.println(maxsum);
}

}
