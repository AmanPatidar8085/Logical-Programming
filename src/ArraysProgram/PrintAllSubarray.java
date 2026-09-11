package ArraysProgram;

public class PrintAllSubarray {
public static void main(String[] args) {
	int arr[]= {10,5,2,7,6};
	int s=100;
	int length=0;
	int maxlength=Integer.MIN_VALUE;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i;j<=arr.length-1;j++) {
			int product=1;
			for(int k=i;k<=j;k++) {
				System.out.print(arr[k]+" ");
				product=product*arr[i];
				if(product<s) {
					length++;
					maxlength=Math.max(maxlength, length);
				}
			}
			System.out.println();
		}
	}
	System.out.println(length);
}
}
