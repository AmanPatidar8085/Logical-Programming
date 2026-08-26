package NumberSystem;

public class CheckPlindromne {
public static void main(String[] args) {
	int n=121;
	int rev=0;
	rev=revnumber(n,rev);
	System.out.println(rev);
	if(rev==n)System.out.println("yes");
	else System.out.println("No");
}

private static int revnumber(int n, int rev) {
	// TODO Auto-generated method stub
	if(n==0)return rev;
	rev=rev*10+n%10;
	return revnumber(n/10, rev);
}
}
