package LinkedList;

import java.util.Scanner;

public class FindMiddleNode {
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
	    
	    
	    System.out.println("find middle node");
	    head=FindMiddleNode(head);
//	    printList(head);
	}

	private static Node FindMiddleNode(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast.next!=null && fast.next.next!=null  ) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
		return head;
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
