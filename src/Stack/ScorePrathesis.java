package Stack;

import java.util.Stack;

public class ScorePrathesis {
public static void main(String[] args) {
	int score=0;
	String s="(()(()))";
	Stack<Integer>st=new Stack<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch=='(') {
			st.push(score);
			score=0;
		}
		else {
			if(score==0)score=1;
			else score=score*2;
			
			score=st.pop()+score;
		}
	}
	System.out.println(score);
}
}
