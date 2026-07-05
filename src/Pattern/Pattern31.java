package Pattern;

public class Pattern31 {
public static void main(String[] args) {
	int n=13;
	int sp=n-1;
	int st=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print("  ");
		}
		for(int k=1;k<=st;k++) {
			if(i%2==0) {
				System.out.print((char)(k+96)+" ");
			}
			else {
				System.out.print((char)(k+64)+" ");
			}
			
		}
		System.out.println();
		sp--;
		st+=2;
	}
}
}
