package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CrudOperation {


	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		//insertion
		hm.put("Aman", 24);
		hm.put("Hariom", 25);
		hm.put("Akshat", 23);
		hm.put("Ajay", 21);
		hm.put("Hariom", 29);
		hm.put(null, 27);
		hm.put(null, 29);
		System.out.println(hm);
		//search
		
		if(hm.containsKey("Aman")) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		//getvalue
		
		System.out.println(hm.get("Akshat1"));
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		//insertion
		hm1.put("A", 24);
		hm1.put("B", 25);
		hm1.put("C", 23);
		hm1.put("E", 21);
		hm1.put("F", 29);
		
		hm.putAll(hm1);
		System.out.println(hm1);
		System.out.println(hm);
		
		
		//iterate
		for (Map.Entry<String, Integer> e : hm.entrySet()) {
		    System.out.print(e.getKey()+" ->");
		    System.out.println(e.getValue());
		}
		Set<String>keys=hm.keySet();
		for(String key:keys) {
			System.out.print(key +" ->"+ hm.get(key)+" , ");
		}
	}  
}
