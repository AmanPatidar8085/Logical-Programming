package LinkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class SingleLinkedList {
public static void main(String[] args) {
	Node first=new Node(10);
	Node sec=new Node(20);
	Node thir=new Node(30);
	Node fourth=new Node(40);
	Node five=new Node(50);
	
	first.next=sec;
	first.next.next=thir;
	first.next.next.next=fourth;
	first.next.next.next.next=five;
	
	
	System.out.println(thir.next.next.data);//50
	System.out.println(first.next.next.data);//30
	System.out.println(sec.next.next.next.data);//50
	System.out.println(sec.data);//20
	// traverse linkedlist
	Node temp=first;
	while(temp!=null) {
		System.out.print(temp.data+"  ");
		temp=temp.next;
	}
	
}
}
