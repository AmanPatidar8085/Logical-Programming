package Pattern;

public class Patter34 {
public static void main(String [] args) {
	int n=4;
	int sp=n+1;
	int st=n/2;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=st;j++) {
			System.out.print("* ");
		}
		for(int k=1;k<=st;k++) {
			System.out.print(" ");
		}
		System.out.println();
		st=st+2;
		sp=st-2;
	}
}
}
