package Recursion;

public class factors {
public static void main(String[] args) {
	int n=12;
	int i=1;
fact(n,i);
System.out.println(n);

}
static void fact(int n,int i) {
	if(i>n/2)return;
	if(n%i==0)
		System.out.println(i);
	fact(n,i=i+1);
	
}
}
