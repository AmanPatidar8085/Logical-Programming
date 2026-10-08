package Stack;

public class RemoveOterParaenthis {
	public static void main(String[] args) {
		String s = "(()())(())";
		String ans = "";
		int count = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				if (count > 0) {
					ans += ch;
				}
				count++;
			} else {
				
					count--;
					if (count > 0) {
						ans += ch;
					
				}
			}
		}
		System.out.print(ans);
	}
}
