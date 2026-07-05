package StringProblems;

import java.util.HashSet;

public class Pnagram {
public static void main(String []args) {
	String str="abcdefghijklmnopqrstu   vwxyz123";
	if(isPangram(str)) {
		System.out.println("Yes");
	}
	else {
		System.out.println("Not");
	}
}
static boolean isPangram(String str) {
	str=str.toLowerCase();
	HashSet hs=new HashSet();
	for(int i=0;i<=str.length()-1;i++){
		if(Character.isAlphabetic(str.charAt(i))) {
			hs.add(str.charAt(i));
	}
	}
	return hs.size()==26;
}
}
