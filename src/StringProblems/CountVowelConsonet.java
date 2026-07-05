package StringProblems;

public class CountVowelConsonet {
public static void main(String [] args) {
	String str="abaeiuefdasr 46";
	int vc=0;
	int cc=0;
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(Character.isAlphabetic(ch)) {
		if(("aeiouAEIOU").indexOf(ch)!=-1) vc++;
		else cc++;
	}
	}
	System.out.println(vc+"-----"+cc);
}
}
