package ArraysProgram;

public class Practice {
public static void main(String[] args) {
	int arr[]= {10,20,30,50,10,10,20,20,20,30,30,30 ,30,40};
	int firstmostrep=0;
	int secmostrep=0;
	int thimos=0;
	int maxfre=0;
	boolean b[]=new boolean[arr.length];
	
	for(int i=0;i<=arr.length-1;i++) {
		if(b[i]==false) {
		int count=1;
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[i]==arr[j]) {
				count++;
				b[j]=true;
			}
		}
//		System.out.println(arr[i]+" --> "+count);
		if(count>maxfre) {
			maxfre=count;
			thimos=secmostrep;
			secmostrep=firstmostrep;
			firstmostrep=arr[i];
			
		}
		
		}
	}
	System.out.println(thimos);
	
}
}
