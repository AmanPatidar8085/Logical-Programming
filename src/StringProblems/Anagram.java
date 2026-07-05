package StringProblems;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1="sliEnt";
	String str2="listen";
	if(isAnagram(str1,str2)) {
		System.out.println("anagram");
	}
	else {
		System.out.println("Not");
	}
}
static boolean isAnagram(String str1,String str2) {
	if(str1.length()!=str2.length()) return false;
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	char ch1[]=str1.toCharArray();
	Arrays.sort(ch1);
	char ch2[]=str2.toCharArray();
	Arrays.sort(ch2);
	
	

return Arrays.equals(ch1,ch2);
}
}
