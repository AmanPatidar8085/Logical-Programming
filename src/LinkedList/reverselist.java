package LinkedList;

import java.util.Scanner;

public class reverselist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the size of list: ");
	    int n = sc.nextInt();

	    Node head = null;
	    System.out.print("Enter element: ");
	    for (int i = 0; i < n; i++) {

	        
	        int data = sc.nextInt();

	        Node newNode = new Node(data);
	        

	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;

	            while (temp.next != null) {
	                temp = temp.next;
	            }

	            temp.next = newNode;
	        }
	    }
	    System.out.println("------------");
	    System.out.println("Linked List:");
	    printList(head);
	    
	    
	    System.out.println("------------");
	    System.out.println(" reverse Linked List:");
	    head=reveselist(head);
	    printList(head);
	}

	private static Node reveselist(Node head) {
		Node temp=head;
		Node prev=null;
		Node frow=temp.next;
		while(temp!=null) {
			 frow=temp.next;
			 temp.next=prev;
			 prev=temp;
			 temp=frow;
			 
		}
		return prev;
		
	}

	private static void printList(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
}
