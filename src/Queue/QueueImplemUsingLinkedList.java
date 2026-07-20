package Queue;

import java.util.Scanner;

class Queue{
	Node front;
	Node rear;
	static int count;
	
	Queue(){
		front=rear=null;
	}

	public void enQueue(int data) {
		if(front==null&&rear==null) {
			Node newNode =new Node(data);
			front=rear=newNode;count++;
			return;
		}
		count++;
		Node newNode =new Node(data);
		rear.next=newNode;
		rear=newNode;
		
	}

	public void deQueue() {
		if(front==null&&rear==null) {
			System.out.println("queue is empty");
			return;
		}
		else if(front==rear) {
			count--;
			front=rear=null;
		}
		front=front.next;
		count--;
		System.out.println("node got deleted");
		
	}

	public void peak() {
		if(front==null&&rear==null) {
			System.out.println("queue is empty");
			return;
		}
		else {
			System.out.println(front.data);
		}
		
	}

	public void isEmpty() {
	  if(front==null) {
		  System.out.println("queue is empty");
		  return;
	  }
	  else {
		  System.out.println("queue is not empty");
	  }
		
	}

	public void display() {
	Node temp=front;
	while(temp!=null) {
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
		
	}

	public void size() {
		System.out.println(count+" is the size of queue");
		
	}
}
public class QueueImplemUsingLinkedList {
	public static void main(String[] args) {
		
	
 Scanner sc=new Scanner(System.in);
 Queue q=new Queue();
 
 while(true) {
	 System.out.println("check below the option");
		System.out.println("1.enQueue\n2.deQueue\n3.peak\n4.isEmpty\n5.display\n6.size\n7.exit");
		System.out.println("enter your option here");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("enter data to store");
			int data=sc.nextInt();
			q.enQueue(data);
			break;
		case 2:
			q.deQueue();
			break;
		case 3:
			q.peak();
			break;
		case 4:
			q.isEmpty();
			break;
		
		case 5:
			q.display();
			break;
		case 6:
			q.size();
			break;
		case 7:
			System.out.println("thank you....");
			System.exit(0);
			default:
				System.out.println("invalid option....");
		}
 }
	}

	
		
	
}

 

