package Objectclass1;
class Student{
	int id;
	String name;
	
	public  Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		if(this.id==s.id)return true;
		if(this.name==s.name)return true;
		else return false;
		
	}
	@Override
	public int hashCode() {
		return id + name.hashCode();
	}
	
}
public class MainClass {
public static void main(String[] args) {
	Student s1=new Student(101, "Aman");
	Student s2=new Student(101, "Aman");
	System.out.println(s1.name.equals(s2.name));
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1);
	System.out.println(s2);
	
}
}
