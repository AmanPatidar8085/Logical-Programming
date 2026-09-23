package CollectionPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class practice2 {
public static void main(String[] args) {
	
	ArrayList< Integer>al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	ListIterator i=al.listIterator();
//	while(i.hasNext()) {
//		System.out.print(i.next()+"-> ");
//	}
//	System.out.print("null");
//	System.out.println();
//	System.out.println(al );
	System.out.println(i.next());
	i.add(50);
	System.out.println(i.next());
	System.out.println(i.hasPrevious());
	System.out.println(al);
}
}
