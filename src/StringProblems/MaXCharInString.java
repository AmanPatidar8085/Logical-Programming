package StringProblems;

public class MaXCharInString {
    public static void main(String[] args) {

        String str = "aaabbbcccccd";
        StringBuilder sb = new StringBuilder();
        int maxfre=0;
        char maxchar=' ';
        int count = 1;

        for(int i = 0; i <=str.length()-1; i++) {

            if(i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } 
            else {
                if(count>maxfre) {
                	 maxfre= count;
                     maxchar = str.charAt(i);
                }
                count = 1;
            }
        }

       System.out.println(maxchar+"-------->"+maxfre);
    }
}