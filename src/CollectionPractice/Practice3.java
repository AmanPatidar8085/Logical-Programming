package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice3 {
public static void main(String[] args) {
	Student s1=new Student(1, "Pritam", 87.5);
	Student s2=new Student(2, "Aman", 77.5);
	Student s3=new Student(3, "Hariom", 87.5);
	
	ArrayList<Student> al=new ArrayList();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	Iterator<Student>i=al.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}

}
