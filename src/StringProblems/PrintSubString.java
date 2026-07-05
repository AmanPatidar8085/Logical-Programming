package StringProblems;

public class PrintSubString {
public static void main(String[] args) {
	String str="abcba";
	String longest="";
	for(int i=0;i<=str.length()-1;i++) {
		for(int j=i+1;j<=str.length();j++) {
			String sub=str.substring(i,j);
			if(Palindrome(sub)) {
				if(sub.length()>longest.length())
					longest=sub;
				
			}
			
		}
	}
	System.out.println(longest);
}
static boolean Palindrome(String s) {
	int i=0;
	int j=s.length()-1;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
			
		}
		i++;
		j--;
	}
		return true;
}
}
