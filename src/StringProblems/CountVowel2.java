package StringProblems;

public class CountVowel2 {
public static void main(String[] args) {
	String str="ab EiO12";
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(("aeiouAEIOU").indexOf(ch)!=-1) {
			System.out.println(ch);
		}
	}
}
}
