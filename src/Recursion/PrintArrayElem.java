package Recursion;

public class PrintArrayElem {
public static void main(String[]args) {
	int a[]= {1,2,3,4,5,6};
	int i=0;
	ArrEle(a,i);
}
static void ArrEle(int a[],int i) {
	if(i==a.length)return;
	System.out.print(a[i]+" ");
	 ArrEle(a,i+1);
}
}
