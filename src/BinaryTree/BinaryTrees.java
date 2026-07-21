package BinaryTree;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	
}
public class BinaryTrees {
public static void main(String[] args) {
	Node a=new Node(3);
	Node b=new Node(4);
	Node c=new Node(2);
	Node d=new Node(-1);
	Node e=new Node(1);
	Node f=new Node(6);
	Node g=new Node(9);
	
	a.left=b; a.right=c;
	b.left=d; b.right=e;
	c.left=f; c.right=g;
	System.out.println("display tree ");
	display(a);
	System.out.println("");
	System.out.println("-------size of the tree----");
	System.out.println(size(a));
	
	System.out.println("----sum of value of tree---");
	System.out.println(sumTree(a));
	
	System.out.println("----product of value of tree---");
	System.out.println(productTree(a));
	
	
	System.out.println("----maximum value of tree---");
	System.out.println(maxValue(a));
	
	
	System.out.println("----minimum value of tree---");
	System.out.println(minValue(a));
	
	System.out.println("----level  of tree---");
	System.out.println(levels(a));
	
}

private static int levels(Node root) {
	if(root==null)
	return 0;
	return 1+Math.max(levels(root.left), levels(root.right));
}

private static int minValue(Node root) {
	if(root==null)
	return Integer.MAX_VALUE;
	return Math.min(root.data, Math.min(minValue(root.left), minValue(root.right)));

}

private static int maxValue(Node root) {
	if(root==null)
	return Integer.MIN_VALUE;
	return Math.max(root.data, Math.max(maxValue(root.left), maxValue(root.right)));
}

private static int productTree(Node root) {
	if(root==null)
	return 1;
	return root.data*productTree(root.left)*productTree(root.right);
}

private static int sumTree(Node root) {
	if(root==null)
	return 0 ;
	return root.data+sumTree(root.left)+sumTree(root.right);
}

private static int size(Node root) {
	if(root==null)
	return 0;
	
	return 1+size(root.left)+size(root.right);
}

private static void display(Node root) {
	if(root==null)return;
	System.out.print(root.data+"  ");
	display(root.left);
	display(root.right);
	
}
}
