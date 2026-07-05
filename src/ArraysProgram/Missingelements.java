package ArraysProgram;

public class Missingelements {
public static void main(String[] args) {
	int arr[]= {4,1,7,6,10};//2,3,5,8,9
	int small=arr[0];
	int bigg=arr[0];
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]<small) 
			small=arr[i];
		if(arr[i]>bigg) bigg=arr[i];
		
		
	}
	for(int i=small;i<=bigg;i++) {
		if(isMissing(i,arr)) {
			System.out.println(i);
		}
	}
}
static boolean isMissing(int n,int arr[]) {
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]==n) return false;
	}

return true;
}
}
