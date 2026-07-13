package LinkedList;

import java.util.Scanner;


public class DeleteData {
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
    System.out.println("----------------------");
      System.out.println("------------");
    System.out.println("Linked List:");
    printList(head);
    
    System.out.println("----*------*-------*-----");
    
    System.out.println("delete head node-----");
   head= deleteheadNode(head);
   printList(head);
   
   System.out.println("-----*------*-------*----");
   
   System.out.println("delete last node-------");
   head=deleteLastNode(head);
   printList(head);
   
   System.out.println("-----*-----*-------*-----");
   
    System.out.println("delete Nth Node------");
   int n1=4;
    head=deleteNthNode(head,n1);
    printList(head);
    
    System.out.println("-----*-----*-------*-----");
    
    System.out.println("delete given Node------");
    int given=70;
    head=deleteGivenNode(head,given);
    printList(head);
    
    System.out.println("-----*-----*-------*-----");
    
}



private static Node deleteGivenNode(Node head, int given) {
	if(head==null)
	return null;
	 if (head.data == given)
	        return head.next;
	
	Node temp=head;
	while(temp.next!=null) {
		if(temp.next.data==given) {
			temp.next=temp.next.next;
			break;
		}
		temp=temp.next;
	}
	return head;
}



private static Node deleteNthNode(Node head ,int n1) {
	if(head==null)
	return null;
	else if(head.next==null)return deleteheadNode(head);
	Node temp=head; int count=0;
	while(temp.next!=null) {
		count++;
		if(count==n1-1) {
			temp.next=temp.next.next;
			return head;
		}
		temp=temp.next;
		
	}
	return head;
}



private static Node deleteLastNode(Node head) {
	if(head==null)return null;
	Node temp=head;
	while(temp.next.next!=null) {
		temp=temp.next;
	}
	temp.next=null;
	return head;
	
}



private static Node deleteheadNode(Node head) {
	if(head==null)return null;
	Node temp=head;
	head=head.next;
	temp.next=null;
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
