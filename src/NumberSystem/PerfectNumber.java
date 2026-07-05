package NumberSystem;

public class PerfectNumber {
public static void main(String[] args) {
	int n=28;
	if(isperfect(n)) {
		System.out.println("perfectnumber");
	}
	else {
		System.out.println("Not");
	}
}
static boolean isperfect(int n) {
	int sum=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {//1+2+4+7+14=28
			sum+=i;
		}
	}

return sum==n;
}
}
