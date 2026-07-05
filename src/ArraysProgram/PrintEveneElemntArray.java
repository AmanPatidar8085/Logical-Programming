package ArraysProgram;

public class PrintEveneElemntArray {
public static void main(String [] args) {
	int arr[]= {10,33,440,90,10,200,300,300,40,456,990};
   int big1=arr[0];
   int big2=arr[1];
   
   for(int i=1;i<=arr.length-1;i++) {
	   if(big1<arr[i]) {
		   big2=big1;
		   big1=arr[i];
		   
	   }
	   else if(arr[i] > big2) {
           big2 = arr[i];
       }
   }
   System.out.println(big2);
}
}
