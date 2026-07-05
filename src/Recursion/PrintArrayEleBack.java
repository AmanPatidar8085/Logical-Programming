package Recursion;

public class PrintArrayEleBack {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6};
	int i=a.length-1;
	ArrBack(a,i);
}
static void ArrBack(int a[],int i) {
	if(i<0)return;
	System.out.println(a[i]+" ");
	ArrBack(a,i-1);
}
}
