package ArraysProgram;

public class BestBuySell {
public static void main(String[] args) {
	int arr[]= {7,1,5,3,6,4};
	int maxProf=0;
	int bestbuy=arr[0];
	for(int i=1;i<=arr.length-1;i++) {
		if(arr[i]>bestbuy) {
			maxProf=Math.max(maxProf,arr[i]-bestbuy);
		}
		bestbuy=Math.min(bestbuy,arr[i]);
	}
	System.out.println(maxProf);
}
}
