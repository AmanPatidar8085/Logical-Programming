package StringProblems;

public class ReverseEachWord {


    public static void main(String[] args) {

        String str = "ram is good";
        char ch[] = str.toCharArray();

        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        System.out.println(new String(ch));
    }
}