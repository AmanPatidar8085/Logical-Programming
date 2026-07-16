package DoublyLinkedlist;



public class DeleteDataDLL {
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
		printlist(head);
	}
	private static void printlist(Node head) {
//		System.out.println();
//		System.out.println("print the doubly linkelist");
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
}
