package StringProblems;

public class UniqueStringOr {
public static void main(String[] args) {
	String str="abcd";
	if(isUnique(str)) {
		System.out.println("yes unique");
	}
	else {
		System.out.println("Not unique");
	}
}
static boolean isUnique(String str) {
	char ch[]=str.toCharArray();
	for(int i=0;i<=ch.length-1;i++) {
		for(int j=i+1;j<=ch.length-1;j++) {
			if(ch[i]==ch[j]) return false;
		}
	}

return true;
}
}
