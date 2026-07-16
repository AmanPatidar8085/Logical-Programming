package DoublyLinkedlist;
class Node{
	int data;
	Node prev;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	
}
 class DoubLL {
public static void main(String[] args) {
	Node head=new Node(10);
	Node prev=head;
	for(int i=20;i<=60;i=i+10) {
		Node newNode =new Node(i);
		prev.next=newNode;
		newNode.prev=prev;
		prev=newNode;
	}
	System.out.println("print the doubly linkelist");
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
	System.out.println("length of list---");
	length(head);
	
	
//	System.out.println();
	System.out.println("revese of list---");
	head=revese(head);
	printlist(head);
	
	System.out.println("---");
	System.out.println("add elemnt beforehead");
	int data=500;
	head=AddBeforeHead(head,data);
	printlist(head);
	
	System.out.println("---");
	System.out.println("add elemnt Afterhead");
	int data1=100;
	head=AddAfterHead(head,data1);
	printlist(head);
	
	
	System.out.println("--------");
	System.out.println("add given node");
	int data2=200;
	int given=30;
	head=AddGivenData(head,data2,given);
	printlist(head);
}

private static Node AddGivenData(Node head, int data2,int given) {
	if(head==null)
	return new Node(data2);
	
	else if(head.next==null) {
		Node newNode=new Node(data2);
		head.next=newNode;
		newNode.prev=head;
		return head;
	}
	
	Node temp=head;
	while(temp.next!=null) {
		if(temp.data==given) {
			Node newNode=new Node(data2);
			newNode.next=temp.next;
			temp.next=newNode;
			temp.next.prev=newNode;
			newNode.prev=temp;
			return head;
		}
		temp=temp.next;
		
	}
	return head;
	
}

private static Node AddAfterHead(Node head, int data1) {
if(head==null)
	return null;
Node newNode=new Node(data1);
newNode.next=head.next;
head.next=newNode;
newNode.prev=head;
head.next.prev=newNode;
return head;

}

private static Node AddBeforeHead(Node head,int data) {
	if(head==null)return new Node(data);
	Node newNode=new Node(data);
	newNode.next=head;
	head.prev=newNode;
	head=newNode;
	return head;
}

private static Node revese(Node head) {
	Node temp=head;
 if(temp==null)return null;
 revese(temp.next);
 System.out.print(temp.data+" ");
 return temp;
}

private static void printlist(Node head) {
//	System.out.println();
//	System.out.println("print the doubly linkelist");
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}

private static void length(Node head) {
	Node temp=head;
	int count=0;
	while(temp!=null) {
		count++;
		temp=temp.next;
	}
	System.out.println(count);
}

}
