
package StringProblems;
import java.util.*;

public class SecondMostRepated  {

    public static void main(String[] args) {

        String str = "aabbccccbsa";
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        System.out.println(hm);

        int maxFreq = 0;
        int secondMaxFreq = 0;
        char maxChar = ' ';
        char secondMaxChar = ' ';

        for(Map.Entry<Character,Integer> entry : hm.entrySet()) {

            int freq = entry.getValue();
            char ch = entry.getKey();

            if(freq > maxFreq) {
                secondMaxFreq = maxFreq;
                secondMaxChar = maxChar;

                maxFreq = freq;
                maxChar = ch;
            }
            else if(freq > secondMaxFreq && freq != maxFreq) {
                secondMaxFreq = freq;
                secondMaxChar = ch;
            }
        }

        System.out.println("Max Character: " + maxChar + " Frequency: " + maxFreq);
        System.out.println("Second Max Character: " + secondMaxChar + " Frequency: " + secondMaxFreq);
    }
}