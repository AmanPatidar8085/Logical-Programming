package SlidingWindow;

public class LongestSubstringWithoutRepatingCharacter {
public static void main(String[] args) {
	String str="cadbzacd";
	char[]arr=str.toCharArray();
	for(int i=0;i<=arr.length-1;i++) {
		System.out.print (arr[i]+" ");
	}
	System.out.println(" ");
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i;j<=arr.length-1;j++) {
			for(int k=i;k<=j;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println(" ");
		}
	}
}
}
