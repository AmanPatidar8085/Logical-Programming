package StringProblems;

public class SortString {
public static void main(String[] args) {
	String str="abrkice";//abceikr
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length-1;i++) {
		for(int j=0;j<ch.length-1;j++) {
			if(ch[j]>ch[j+1]) {
				char temp=ch[j];
				ch[j]=ch[j+1];
				ch[j+1]=temp;
			}
		}
	}
	String st="";
	for(int i=0;i<ch.length;i++) {
		st=st+ch[i];
	}
	System.out.println(st);
}
}
