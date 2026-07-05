package StringProblems;
import java.util.*;
public class HashMaxCountfreq {

	public static void main(String[] args) {
		String str="aabbccccbsa";
HashMap<Character,Integer>hm=new HashMap<>();
for(int i=0;i<=str.length()-1;i++) {
	char ch=str.charAt(i);
	hm.put(ch,hm.getOrDefault(ch, 0)+1);
}
System.out.println(hm);
int maxfreq=0;
char maxChar=' ';
for(Map.Entry<Character, Integer>entry:hm.entrySet()) {
	if(entry.getValue()>maxfreq) {
		maxfreq=entry.getValue();
		maxChar=entry.getKey();
	}
}
  
System.out.println(maxfreq);
System.out.println(maxChar);
	}

}
