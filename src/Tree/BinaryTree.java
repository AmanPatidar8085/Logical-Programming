package Tree;

public class BinaryTree {
	public static class Node{
		int val;
		Node left;
		Node right;
		
		Node(int val){
			this.val=val;
		}
	}
	static void display(Node root) {
		if(root==null) {
		
			return;
		}
		System.out.print(root.val+" -> ");
	if(root.left!=null)	System.out.print(root.left.val+" ,");
	if(root.right!=null) System.out.print(root.right.val+" ");
	System.out.println();
	display(root.left);
	display(root.right);
	
		
	}
		
	
	public static void main(String[] args) {
		Node root=new Node(10);
		System.out.println(root.val);
		Node a=new Node(20);
		Node b=new Node(30);
		root.left=a;
		root.right=b;
		System.out.println(root.left.val);
		System.out.println(root.right.val);
		
		Node c=new Node(40);
		Node d=new Node(50);
		a.left=c;
		a.right=d;
		
		System.out.println(a.right.val);
		display(root);
	}
}
