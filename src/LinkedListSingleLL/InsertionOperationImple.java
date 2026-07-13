package LinkedListSingleLL;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionOperationImple {

    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    
    
    
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
        
        
        System.out.println("length of linked list--");
        LengthOfList(head);
        System.out.println("reverse list------");
        Node temp=head;
        reveselist(temp);
        
        System.out.println("check the target node present or not");
        int target=300;
        CheckNode(head,target);
        
        
        System.out.println("insert new node before head");

       addBeforeHead(head);
       
       
       System.out.println("insert new node at last");
           int data=200;
       addNodeLast(head,data);
       printList(head);
       
       
       
       System.out.println("insert node after head node");
       int data1=15;
       addAfterHead(head,data1);
       printList(head);
       
       System.out.println("insert the new Node at given node------");
       int given=50;
       addNodeGivenPosition(head,given);
       printList(head);
    }




	private static Node addNodeGivenPosition(Node head, int given) {
	Node temp=head;
	while(temp!=null) {
		if(temp.data==given) {
			Node newNode=new Node(55);
			newNode.next=temp.next;
			temp.next=newNode;
			return head;
		}
		temp=temp.next;
		
	}
	
		return head;
	}




	private static Node addAfterHead(Node head, int data1) {
		if(head==null)return  null;
	Node newNode=new Node(data1);
	newNode.next=head.next;
	head.next=newNode;
		return head;
	}




	private static Node addNodeLast(Node head,int data) {
		if(head==null)return new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node newNode=new Node(data);
		temp.next=newNode;
		return head;
		
	}




	private static void addBeforeHead(Node head) {
	Node newNode =new Node(100);
	newNode.next=head;
	head=newNode;
	 printList(head);
		
	}




	private static void CheckNode(Node head, int target) {
		Node temp=head;
		while(temp!=null) {
			if(target==temp.data) {
				System.out.println("Node is preset");
				return;
			}
			temp=temp.next;
		}
		System.out.println("node not present");
		
	}




	private static void reveselist(Node temp) {
		if(temp==null) {
			return;
		}
		reveselist(temp.next);
		System.out.print(temp.data+" ");
		
	}




	private static void LengthOfList(Node head) {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		System.out.println(count);
	}
}