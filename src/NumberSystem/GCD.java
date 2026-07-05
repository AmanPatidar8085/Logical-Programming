package NumberSystem;

public class GCD {
public static void main(String [] args) {
	int n1=12;   //1,2,3,4,6,12
	int n2=36;   //1,2,3,4,6,9,12,18,36
	int gcd=0;
	for(int i=1;i<=n1&&i<=n2;i++){
		if(n1%i==0&&n2%i==0) gcd=i;
	}
	System.out.println(gcd);
}
}
