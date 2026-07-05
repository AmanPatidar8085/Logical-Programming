package StringProblems;

public class RemoveExtraSpace {
public static void main(String[] args) {
	int count=0;
	String str="   ram is   good12323123 "; 
	str=str.trim().replaceAll("\s+", "");
	System.out.println(str);
	for(int i=0;i<=str.length()-1;i++) {
		
		char ch=str.charAt(i);
		if(Character.isAlphabetic(ch))
		count++;
	}
	System.out.println(count);
}
}
