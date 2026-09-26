package Tree;

public class postorderTraversal{
	public static class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}

	static void postorder(Node root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.val);
		
	}

	public static void main(String[] args) {
		Node root = new Node(2);
		Node a = new Node(4);
		root.left = a;
		Node b = new Node(6);
		a.left = b;
		Node c = new Node(5);
		a.right = c;

		Node d = new Node(10);
		root.right = d;
		Node e = new Node(8);
		d.left = e;
		Node f = new Node(11);
		d.right = f;
		postorder(root);

	}

}
