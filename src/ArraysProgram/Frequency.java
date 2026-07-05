package ArraysProgram;

public class Frequency {
public static void main(String[] args) {
	int arr[]= {10,20,10,20,30,10};
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
		
	System.out.println(arr[i]+"---"+count);
	}
}
}
}
