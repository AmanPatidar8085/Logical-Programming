package StringProblems;

public class ReverseString {
public static void main(String[] args) {
	String str="abdef";
	System.out.println(revese(str));
	
}
static String revese(String str) {
	char ch[]= str.toCharArray();
	int i=0;
	int j=ch.length-1;
	while(i<j) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		i++;
		j--;
	}
	return new String(ch);
}
}
