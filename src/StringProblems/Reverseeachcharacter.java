package StringProblems;

public class Reverseeachcharacter {
public static void main(String[] args) {
	String str="ram is good";
	System.out.println(str);
	String a[]=str.split(" ");
	for(int i=0;i<=a.length-1;i++) {
   String s=revese(a[i]);
   a[i]=s;
}
	for(String word : a) {
		System.out.print(word + " ");
		
	}
	
}
static String revese(String s) {
	char ch[]=s.toCharArray();
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
