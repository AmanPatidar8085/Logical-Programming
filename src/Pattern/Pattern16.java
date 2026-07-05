package Pattern;

public class Pattern16 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			if(i%2==0) {
				System.out.print((char)(k+96));
				
			}
			else {
				System.out.print((char)(k+64));
			}
		}
		System.out.println();
	}
}
}
