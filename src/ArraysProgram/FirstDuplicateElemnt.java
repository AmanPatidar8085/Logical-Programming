package ArraysProgram;

public class FirstDuplicateElemnt {
public static void main(String []args) {
	int arr[]= {10,10,20,20,10,23,20,30,40,23};
	int dul=0;
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
//			System.out.println(arr[i]+"-->"+count);
			if(count>1) {
				System.out.println(arr[i]);
				dul++;
				
			if(dul==3) 
				break;
			
			}
		}
	}
}
}
