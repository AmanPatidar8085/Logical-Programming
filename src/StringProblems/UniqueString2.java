package StringProblems;
import java.util.*;
public class UniqueString2 {

public static void main(String[] args) {
	String str="abccd";
	if(isUnique(str)) {
		System.out.println("yes unique");
	}
	else {
		System.out.println("Not unique");
	}
}
static boolean isUnique(String str) {
	HashSet hs=new HashSet();
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		hs.add(ch);
	}
	return str.length()==hs.size();
	
}
}