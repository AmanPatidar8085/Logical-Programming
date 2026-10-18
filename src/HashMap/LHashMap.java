package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer>ll=new LinkedHashMap();
		ll.put("Aman", 24);
		ll.put("Pritam",22 );
		ll.put("Ajay", 21);
		ll.put("Hariom", 27);
		
		System.out.println(ll);
		
		for(Map.Entry<String,Integer>e:ll.entrySet()) {
			System.out.print(e.getKey()+" ->"+" ");
			System.out.println(e.getValue());
			
		}
		Set<String>keys=ll.keySet();
		for(String key:keys) {
			System.out.print(key +" ->"+ ll.get(key)+" ");
		}
	}
}
