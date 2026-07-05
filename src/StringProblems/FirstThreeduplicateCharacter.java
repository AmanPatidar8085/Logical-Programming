package StringProblems;
import java.util.*;
public class FirstThreeduplicateCharacter {
	public static void main(String[] args) {
		String str="aabbccccbsa";
HashMap<Character,Integer>hm=new HashMap<>();
for(int i=0;i<=str.length()-1;i++) {
	char ch=str.charAt(i);
	hm.put(ch,hm.getOrDefault(ch, 0)+1);
}
System.out.println(hm);
int duplicateCount=0;
for(Map.Entry<Character, Integer>entry:hm.entrySet()) {
	if(entry.getValue()>1) {
		System.out.println(entry.getKey());
		 duplicateCount++;
		 if(duplicateCount==3) break;
	}
}
  

	}

}
