package Tree;

public class sizemaxheightsum {
	public static class Node {
		int val;
		Node left;
		Node right;

		Node(int val) {
			this.val = val;
		}
		
	}
	//print all elemnt 
	static void preorder(Node root) {
		if(root==null)return;
		System.out.println(root.val);
		
		preorder(root.left);
		preorder(root.right);
		
	}
	// size of tree
	static int size(Node root) {
		if(root==null)return 0;
		return 1+size(root.left)+size(root.right);
	}
	// tree sum of all element 
	static int sum(Node root) {
		if(root==null)return 0;
		return  root.val+sum(root.left)+sum(root.right);
	}
	//max element
	static int max(Node root) {
		if(root==null) return Integer.MIN_VALUE;
		int a=root.val;
		int b=max(root.left);
		int c=max(root.right);
		return Math.max(a, Math.max(b, c));
	}
	//     find height
	static int height(Node root) {
		if(root==null)return 0;
		if(root.left==null||root.right==null)return 0;
		return 1+Math.max(height(root.left),height(root.right));
	}
	//product
	static int prod(Node root) {
		if(root==null)return 1;
		return root.val*prod(root.left)*prod(root.right);
	}
	//minimum
	
	static int min(Node root) {
		if(root==null) return Integer.MAX_VALUE;
		int a=root.val;
		int b=min(root.left);
		int c=min(root.right);
		return Math.min(a, Math.min(b, c));
	}
	public static void main(String[] args) {
		Node root = new Node(10);
//		System.out.println(root.val);
		Node a = new Node(20);
		Node b = new Node(30);
		root.left = a;
		root.right = b;
//		System.out.println(root.left.val);
//		System.out.println(root.right.val);

		Node c = new Node(40);
		Node d = new Node(50);
//		System.out.println(c.val);
//		System.out.println(d.val);
		a.left = c;
		a.right = d;
		Node e=new Node(60);
		b.right=e;
		
		preorder(root);
		System.out.println("size of tree --> "+size(root));
		System.out.println("sum of all element present in tree-->  "+sum(root));
		System.out.println("maximum ele of tree --> "+max(root));
		System.out.println("height of tree-->"+height(root));
		System.out.println("product of tree -->"+prod(root));
		System.out.println("min ele of tree-->"+ min(root));
}
}
