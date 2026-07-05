package StringProblems;

public class FirstCharcterUpperonly {
public static void main(String[] args) {
	String str="rAm iS goOd";
	str=str.toLowerCase();
	System.out.println(str);
	char ch[]=str.toCharArray();
	for(int i=0;i<=ch.length-1;i++) {
		if(i==0||ch[i-1]==' ') {
			ch[i]=Character.toUpperCase(ch[i]);
		}
	}
	String s=new String(ch);
	System.out.println(s);
}
}
