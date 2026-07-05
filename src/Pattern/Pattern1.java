package Pattern;

public class Pattern1 {
  public static void main(String [] args) {
	  int n=5;
	  char val='A';
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=n;j++) {
			  System.out.print(val+" ");
		  }
		  System.out.println();
		  val++;
	  }
//	  System.out.println();
  }
}
