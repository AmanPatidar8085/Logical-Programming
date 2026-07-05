package Recursion;

public class PrintNto1 {
public static void main(String[] args) {
	int n=15;
	m1(n);
}
static void m1(int n) {
	if(n==0)return;
	System.out.println(n);
	m1(--n);
}
}
