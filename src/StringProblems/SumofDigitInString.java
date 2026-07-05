package StringProblems;

public class SumofDigitInString {
public static void main(String[] args) {
	String str="Aab123@42";
	int sum=0;
	for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(Character.isDigit(ch)) {
			sum+=ch-'0';
		}
	}
	System.out.println(sum);
}
}
