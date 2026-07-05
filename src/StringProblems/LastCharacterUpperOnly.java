package StringProblems;

public class LastCharacterUpperOnly {
public static void main(String [] args) {
	String  str="ram is good";
	str=str.toLowerCase();
	System.out.println(str);
	
	char ch[]=str.toCharArray();
	for(int i=0;i<=ch.length-1;i++) {
		if(i==ch.length-1||ch[i+1]==' ') {
			ch[i]=Character.toUpperCase(ch[i]);
		}
	}
	String s=new String(ch);
	System.out.println(s);
}
}
