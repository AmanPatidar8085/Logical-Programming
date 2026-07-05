package StringProblems;

public class CountSpeALDi {
public static void main(String [] args) {
	String str="accdD@#  001234";
	int ac=0;
	int sc=0;
	int dc=0;
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
			ac++;
		}
		else if(ch>='0'&&ch<='9') {
			dc++;
		}
		else if(ch==' ') {
			continue;
		}
		else {
			sc++;
		}
	}
	System.out.println(ac);
	System.out.println(sc);
	System.out.println(dc);
}

}
