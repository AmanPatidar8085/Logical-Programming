package Pattern;

public class Pattern6 {
public static void main(String [] args) {
	int n=5;
	char val='a';
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(val+" ");
			val++;
		}
		System.out.println();
		val='a';
	}
}
}
