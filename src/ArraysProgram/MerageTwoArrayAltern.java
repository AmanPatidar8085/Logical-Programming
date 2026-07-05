package ArraysProgram;

public class MerageTwoArrayAltern {
public static void main(String[]args) {
	int arr1[]= {1,2,3,4};
	int arr2[]= {5,6,7,8,9,10};
	int arr3[]=new int[arr1.length+arr2.length];
	int k=0;
	for(int i=0;i<=arr1.length-1;i++) {
		arr3[k++]=arr1[i];
		arr3[k++]=arr2[i];
		
	}
	for(int i=0;i<=arr3.length-1;i++) {
		System.out.print(arr3[i]+" ");
	}
	
}
}
