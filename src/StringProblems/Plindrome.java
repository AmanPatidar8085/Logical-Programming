package StringProblems;

public class Plindrome{
public static void main(String[] args) {
	String str="ab55ba";
	if(revese(str)==true) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("Not");
	}
	
}
static boolean revese(String str) {
	char ch[]= str.toCharArray();
	int i=0;
	int j=ch.length-1;
	while(i<j) {
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		i++;
		j--;
	}
	return new String(ch).equals(str);
}
}
