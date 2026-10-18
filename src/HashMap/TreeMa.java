package HashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMa {

	int id;
	String name;
	double price;

	public TreeMa(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "TreeMa [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		TreeMap<Integer,TreeMa>tm=new TreeMap<Integer, TreeMa>();
		TreeMa t1 = new TreeMa(2, "laptop", 1234);
		TreeMa t2 = new TreeMa(1, "mobile", 34342);
		TreeMa t3 = new TreeMa(4, "laptop", 1234);
		TreeMa t4 = new TreeMa(4, "shirt", 3442);
		
		tm.put(t1.id,t1);
		tm.put(t3.id, t3);
		tm.put(t4.id,t4);
		tm.put(t2.id, t2);
		
//		System.out.println(tm);
		for(Map.Entry<Integer, TreeMa>en:tm.entrySet()) {
			System.out.println(en);
		}
	}
}
