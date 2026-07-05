package Recursion;
public class Print1toN {
public static void main(String [] args) {
	int n=5;
	int count=1;
	display(count,n);
}
  static void display(int count,int n) {
	 if(count>n)
		 return;
	 System.out.println(count);
	 display(count+1,n);
 }
}
