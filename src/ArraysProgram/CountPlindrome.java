package ArraysProgram;

public class CountPlindrome {
public static void main(String []args) {
	int arr[]={121,141,55,311,345,131,151};
	int count=0;
	for(int i=0;i<=arr.length-1;i++) {
	if(isboolean(arr[i])) {
		count++;
	}
	}
	System.out.println(count);
}

static boolean isboolean(int n) {
	
	int temp=n;
	int rev=0;
	while(n>0) {
		int digit=n%10;
		rev=rev*10+digit;
		n=n/10;
		
	}
	return rev==temp;
}
}
