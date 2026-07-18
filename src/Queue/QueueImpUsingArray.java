package Queue;

import java.util.Scanner;

public class QueueImpUsingArray {
	static int queue[];
	static int front;
	static int rear;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your size of the queue");
	int size=sc.nextInt();
	queue=new int[size];
	front=rear=-1;
	
	while(true) {
		System.out.println("check below the option");
		System.out.println("1.enQueue\n2.deQueue\n3.peak\n4.isEmpty\n5.isFull\n6.display\n7.size\n.8.exit");
		System.out.println("enter your option here");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("enter data to store");
			int data=sc.nextInt();
			enQueue(data);
			break;
		case 2:
			deQueue();
			break;
		case 3:
			peak();
			break;
		case 4:
			isEmpty();
			break;
			
		case 5:
			isFull();
			break;
		case 6:
			display();
			break;
		case 7:
			size();
			break;
		case 8:
			System.out.println("thank you....");
			System.exit(0);
			deafult:
				System.out.println("invalid option....");
		}
	}
	
}
private static void size() {
	System.out.println("size of queue is : "+(rear-front+1));
	
}
private static void display() {
	if(rear==-1&&front==-1) {
		System.out.println("queue is empty..");
		return;
	}
	for(int i=front;i<=rear;i++) {
		System.out.println(queue[i]+" ");
	}
}
private static void isFull() {
	if(rear==queue.length-1)System.out.println("queue is full");
	else {
		System.out.println("queue is not full");
	}
	
}
private static void isEmpty() {
	if(rear==-1&&front==-1) {
		System.out.println("queue is empty..");
	}
	else {
		System.out.println("queue is  not empty");
	}
	
}
private static void peak() {
	if(rear==-1&&front==-1) {
		System.out.println("queue is empty..");
	}
	else {
		System.out.println(queue[front]+" is front element");
	}
	
}
private static void deQueue() {
	if(rear==-1&&front==-1) {
		System.out.println("queue is empty");
		return;
	}
	if(front==rear) {
		front=rear=-1;
		return;
	}
	front++;
	System.out.println("data is delete..");
	
}
private static void enQueue(int data) {
	if(rear==queue.length-1) {
		System.out.println("stack is full......");
		return;
	}
	if(rear==-1&&front==-1) {
		front=rear=0;
		queue[rear]=data;
		return;
	}
	rear++;
	queue[rear]=data;
	
}
}
