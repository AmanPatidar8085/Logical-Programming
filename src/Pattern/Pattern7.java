package Pattern;

public class Pattern7 {
	public static void main(String[] args) {
		int n=5;
		char val='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print(val+" ");
					val++;
				}
				else {
				System.out.print(j+" ");
				
				}
			}
			System.out.println();
			val='A';
		}
	}

}
