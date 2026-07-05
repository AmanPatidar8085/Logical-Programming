package StringProblems;

public class LowertoUppertoLower {
public static void main(String [] args) {
	String str="a12bSDa";
	System.out.println(Convert(str));
	
}
static String Convert(String str) {
	char ch[]=str.toCharArray();
	for(int i=0;i<str.length()-1;i++) {
		
		if(Character.isAlphabetic(ch[i])) {
		if(Character.isLowerCase(ch[i])) {
			ch[i]=Character.toUpperCase(ch[i]);
		}
		else if(Character.isUpperCase(ch[i])) {
			ch[i]=Character.toLowerCase(ch[i]);
		}
			
		}
	}
	return new String(ch);
}
}
