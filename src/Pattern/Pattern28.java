package Pattern;

public class Pattern28 {
public static void main(String [] args) {
	int n=5;
	int val=n;
	for(int i=1;i<=val;i++) {
		for(int j=1;j<=n;j++) {
			System.out.print("* ");
		}
		System.out.println();
		n--;
	}
}
}
