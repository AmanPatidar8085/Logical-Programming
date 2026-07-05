package NumberSystem;

public class Power {
public static void main(String[] args) {
	int n=2;
	int p=4;
	int s=Power(n,p);
	System.out.println(s);
}
static int Power(int n,int p) {
	int pow=1;
	for(int i=1;i<=p;i++) {
		pow=pow*n;
	}
	return pow;
}
}
