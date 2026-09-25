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
	
}
}
