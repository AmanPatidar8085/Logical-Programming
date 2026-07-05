package ArraysProgram;

public class Subarrays {
public static void main(String[] args) {
	int arr[]= {2,-1,3,-2,1};
	int maxcount=0;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i;j<=arr.length-1;j++) {
			int count=0;
			for(int k=i;k<=j;k++) {
//				System.out.print(arr[k]+" ");
				count++;
				
			}
//			System.out.println("--->"+count);
			if(count>maxcount) {
				maxcount=count;
			}
		}
	}
	System.out.println(maxcount);
}
}
