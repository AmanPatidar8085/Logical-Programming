package StringProblems;
import java.util.*;
public class HashMapFreqString {
public static void main(String[] args) {
	String str="aabbcncbsa";
HashMap<Character,Integer>hm=new HashMap<>();
for(int i=0;i<=str.length()-1;i++) {
	char ch=str.charAt(i);
	hm.put(ch,hm.getOrDefault(ch,0)+1);
}
System.out.println(hm);
}
}
