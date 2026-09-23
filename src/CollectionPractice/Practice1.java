package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice1 {
public static void main(String[] args) {
	
	ArrayList< Integer>al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	//for traverse use iterator
	Iterator i=al.iterator();
//	while(i.hasNext()) {
//		System.out.print(i.next()+" ");
//		
//	}
	System.out.println(i.hasNext());
	System.out.println(i.next());
//	al.add(50);
	System.out.println(i.next());
	i.remove();
	System.out.println(i.next());
	System.out.println(i.next());
	i.remove();
//	System.out.println(i.next());
	System.out.println(al);
}
}
