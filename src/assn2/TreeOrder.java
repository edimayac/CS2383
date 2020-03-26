package assn2;

public class TreeOrder {
	public static void main(String[] args) {
		TreeOrder tree = new TreeOrder();
		
		tree.root = new Node(12); 
        tree.root.left = new Node(10); 
        tree.root.right = new Node(19); 
        tree.root.left.right = new Node(13); 
        tree.root.right.left = new Node(15); 
        tree.root.right.left.left = new Node(14); 
        tree.root.right.left.right = new Node(18); 
		
		System.out.print("Pre-Order: ");
		tree.PreOrder(tree.root);
		System.out.print("\nIn-Order: ");
		tree.InOrder(tree.root);
		System.out.print("\nPost-Order: ");
		tree.PostOrder(tree.root);
		
	}
	private Node root;

	
	public TreeOrder() {
		root = null;
	}

	public void PreOrder(Node T) {
		if (T != null) {
			visit(T);
			PreOrder(T.left);
			PreOrder(T.right);
		}
	}
	
	public void InOrder(Node T) {
		if (T != null) {
			InOrder(T.left);
			visit(T);
			InOrder(T.right);
		}
	}
	
	public void PostOrder(Node T) {
		if (T != null) {
			PostOrder(T.left);
			PostOrder(T.right);
			visit(T);
		}
	}
	
	public void visit(Node T) {
		System.out.print(T.data + ", ");
	}
}

class Node {
	private static int n = 0;
	int id;
	int data;
	Node parent;
	Node left;
	Node right;
	
	Node(int data) {
		this.data = data;
		this.parent = null;
		this.left = null;
		this.right = null;
		this.id = n++;
	}
}


