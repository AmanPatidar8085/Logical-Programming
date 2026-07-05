package StringProblems;

public class Count_occuunceEach {

public static void main(String[] args) {
String str="aabdbsfa";
boolean b[]=new boolean[str.length()];
for(int i=0;i<=str.length()-1;i++) {
	if(b[i]==false) {
		int count=1;
		for(int j=i+1;j<=str.length()-1;j++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
				b[j]=true;
			}
		}
		System.out.println(str.charAt(i)+"------->"+count);
	}
}
	
	
	
	
	
}	
}
