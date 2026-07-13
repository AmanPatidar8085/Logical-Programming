package LinkedList;

//class Node{
//	int data;
//	Node next;
//	Node(int data){
//		this.data=data;
//		this.next=null;
//	}
//}
public class InsertData {
	//                      find target 
	static void search(Node head,int target) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==target) {
				System.out.println(target+" is present in the linked list");
				return;
			}
			temp=temp.next;
		}
		System.out.println(" is not present");
	}
	
	private static Node insertBeforNode(Node head, int data) {
		if(head==null) {
			return new Node(data);
		}
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
		return head;
	}
	private static void print(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
		
		
	}
	
	private static Node insertLateNode(Node head, int data) {
		if(head==null) {
			return new Node(data);
		}
		Node temp=head;
		while(temp.next!=null) {
		temp=temp.next;
		}
		Node newNode=new Node(data);
		temp.next=newNode;
		return head;
		
	}
	
	
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60};
	Node head=new Node(a[0]);
	Node temp=head;
	
	for(int i=1;i<=a.length-1;i++) {
		Node newNode=new Node(a[i]);
		temp.next=newNode;
		temp=newNode;
	}
	  temp=head;
	  int count=0;
	while(temp!=null) {
		System.out.print(temp.data+"--> ");
		count++;
		temp=temp.next;
	}
	System.out.println();
	System.out.println(count);
	
	System.out.println("find target elemnt");
	int target=40;
	search(head,target);
	
	//         insert data before head
	System.out.println("      -------");
	head=insertBeforNode(head,100);
	print(head);
	
//	           insert data last 
	System.out.println("      -------");
	head=insertLateNode(head,80);
	print(head);
	
}

}

