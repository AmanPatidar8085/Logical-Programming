package Queue;

import java.util.Scanner;

public class CircularQueue {
static int queue[];
static int front;
static int rear;
static int count;
static int length;

public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	System.out.println("enter the size of the queue");
	int size=sc.nextInt();
	queue=new int[size];
	front=rear=-1;
	length=size;
	
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
			default:
				System.out.println("invalid option....");
		}
	}
}

private static void size() {
	System.out.println("queue size is "+ count);
	
}

private static void display() {
	int i=front;
	while(i!=rear) {
		System.out.println(queue[i]+" ");
		i=(i+1)%length;
	}
	System.out.println(queue[i]);
	
}

private static void isFull() {
	if((rear+1)%length==front)
		System.out.println("queue is full");
	else
		System.out.println("not");
	
	
}

private static void isEmpty() {
	if(front==-1)System.out.println("queue is empty");
	else System.out.println("queue is not empty");
	
}

private static void peak() {
	if(front==-1)System.out.println("queue is empty");
	else
		System.out.println(queue[front]+"  is front elemnt");
	
	
}

private static void deQueue() {
	if(front==-1&& rear==-1)
		{
		System.out.println("queue is empty");
	
	return;
		}
	
	else if(front==rear) {
		front=rear=-1;
		count--;
		return;
	}
	count--;
	front=(front+1)%length;
	System.out.println("from ele deleted");
	
}

private static void enQueue(int data) {
	if((rear+1)%length==front) {
		System.out.println("queue is full..");
		return;
	}
	else if(front==-1 &&rear==-1) {
		front=rear=0;
		queue[rear]=data;
		count++;
		return;
	}
	count++;
	rear=(rear+1)%length;
	queue[rear]=data;
	
}

}
