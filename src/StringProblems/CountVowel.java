package StringProblems;

public class CountVowel {
public static void main(String[] args) {
String str="abcIiOU123#";
for(int i=0;i<=str.length()-1;i++) {
	char ch=str.charAt(i);
	if(Character.isAlphabetic(ch)) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println(ch);
		}
	}
}
}
}
