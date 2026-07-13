package Stack;

import java.util.Scanner;

public class StackImpleUsingArray {
static int stack[];
static int top;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the stack");
	int size=sc.nextInt();
	stack=new int[size];
	top=-1;
	while(true) {
		System.out.println("check below options");
		System.out.println("1.push\n2.pop\n3.peak\n4.size\n"
				+ "5.isEmpty\n6.isFull\n7.Display\n8.Search\n9.Clear");
		System.out.println("enter your option here");
		int option=sc.nextInt();
//		System.out.println("user entered option is"+option);
		switch(option) {
		case 1:
			System.out.println("enter the data to push into the stack");
			int data=sc.nextInt();
			push(data);
			break;
		case 2:
			pop();
			break;
		case 3:
			peak();
			break;
		case 4:
			size();
			break;
		case 5:
			isEmpty();
			break;
		case 6:
			isFull();
			break;
		case 7:
			display();
			break;
		case 8:
			System.out.println("enter the ele to search in the stack");
			int ele=sc.nextInt();
			serach(ele);
			break;
		case 9:
			clear();
			break;
		case 10:
			System.out.println("thank you.....");
			System.exit(0);
			default:
				System.out.println("inavalid option");
		}
	}
}
private static void clear() {
	top=-1;
	System.out.println("stack got cleared");
	
}
private static void serach(int ele) {
	boolean found=false;
	for(int i=top;i>=0;i--) {
		if(stack[i]==ele) {
			found=true;
			break;
		}
	}
		if(found==true) {
			System.out.println("ele is present");
		}
		else {
			System.out.println("ele not present");
		}
	}
	

private static void display() {
	if(top==-1) {
		System.out.println("stack is empty");
		return;
	}
	for(int i=top;i>=0;i--) {
		System.out.println(stack[i]+" ");
	}
	
}
private static void isFull() {
	if(top==stack.length-1) {
		System.out.println("stack is full");
	}
	else {
		System.out.println("stack is not full");
	}
	
}
private static void isEmpty() {
	if(top==-1) {
		System.out.println("stack is empty");
	}
	else {
		System.out.println("stack is not empty");
	}
	
}
private static void size() {
	System.out.println("stack size is "+(top+1));
	
}
private static void peak() {
	if(top==-1) {
		System.out.println("stack is empty");
		return;
	}
	System.out.println(stack[top]+" is a peak element");
	
}
private static void pop() {
	if(top==-1) {
		System.out.println("stack is empty");
		return;
	}
	top--;
	System.out.println("data deleted");
	
}
private static void push(int data) {
	
	if(top==stack.length-1) {
		System.out.println("stack is full");
		return;
	}
	top++;
	stack[top]=data;
	System.out.println("data is inserted into stack");
}
}
