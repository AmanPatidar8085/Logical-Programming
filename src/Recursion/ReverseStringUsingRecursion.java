package Recursion;

public class ReverseStringUsingRecursion {
public static void main(String[] args) {
	String str="abc34d";
	char ch[]=str.toCharArray();
	int i=0;
	int j=ch.length-1;
	System.out.println(reveseString(ch,i,j));
}

private static String reveseString(char[] ch, int i, int j) {
	// TODO Auto-generated method stub
	if(i>j)return new String(ch);
	char temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
return	reveseString(ch, i+1, j-1);
}
}
