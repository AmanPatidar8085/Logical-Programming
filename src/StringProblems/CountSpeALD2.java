package StringProblems;

public class CountSpeALD2 {
public static void main(String[] args) {
	String str="accdD@#  001234";
	int ac=0;
	int sc=0;
	int dc=0;
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(Character.isAlphabetic(ch)) {
			ac++;
		}
		else if(ch==' ') continue;
		else if(Character.isDigit(ch)) dc++;
		else sc++;
	}
	System.out.println(ac);
	System.out.println(sc);
	System.out.println(dc);
}
}
