package StringProblems;

public class longestvalidparentheses {
	public static void main(String[] args) {
		String str = "(()()))(()";

		int count = 0;
		int open = 0;
		int close = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch == '(')
				open++;
			else
				close++;
			if (close < open) {
				continue;
			} else if (close > open) {
				open = 0;
				close = 0;
				continue;
			}
			if (open == close)
				count = Math.max(count, open + close);

		}
		open = 0;
		 close = 0;
		for (int i = str.length()-1; i >0; i--) {
			char ch = str.charAt(i);
			if (ch == '(')
				open++;
			else
				close++;
			if (close > open) {
				continue;
			} else if (close < open) {
				open = 0;
				close = 0;
				continue;
			}
			if (open == close)
				count = Math.max(count, open + close);
		}
		System.out.println(count);
	}
}
