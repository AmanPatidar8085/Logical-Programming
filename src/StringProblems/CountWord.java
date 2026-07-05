package StringProblems;

public class CountWord {
public static void main(String[] args) {
	String str="ram   is   good";
	str=str.trim().replaceAll("\s+", " ");
	System.out.println(str);
	
//	String[]a=str.split(" ");
//	System.out.println(a.length);
	
	char ch[]=str.toCharArray();
	System.out.println(ch.length);
}
}
