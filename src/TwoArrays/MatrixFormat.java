package TwoArrays;

public class MatrixFormat {
public static void main(String[] args) {
	int arr[][]= {{10,20,30},{40,50,60},{70,80,90}};
	int big=arr[0][0];
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			if(big<arr[i][j])
			{
				big=arr[i][j];
			}
//			System.out.print(arr[i][j]+"  ");
		}
		
	}
	System.out.println(big);
}
}
