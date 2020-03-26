package assn2;
public class CheckBST {
    
    
    
    public static boolean isBST(Node root)  {
        return isBSTUtil(root, Integer.MIN_VALUE, 
                               Integer.MAX_VALUE); 
    } 
  
    public static boolean isBSTUtil(Node node, int min, int max) 
    { 
        if (node == null) 
            return true; 
  
        if (node.data < min || node.data > max) 
            return false; 
   
        return (isBSTUtil(node.left, min, node.data-1) && 
                isBSTUtil(node.right, node.data+1, max)); 
    } 
  
    public static void main(String args[]) { 
    	Node root = new Node(13);
        root.left = new Node(10); 
        root.right = new Node(19); 
        root.left.right = new Node(12); 
        root.right.left = new Node(15); 
        root.right.left.left = new Node(14); 
        root.right.left.right = new Node(18);
        
        if (isBST(root)) 
            System.out.println("first tree IS BST"); 
        else
            System.out.println("first tree Not a BST"); 
    	
        root = new Node(12); 
        root.left = new Node(10); 
        root.right = new Node(19); 
        root.left.right = new Node(13); 
        root.right.left = new Node(15); 
        root.right.left.left = new Node(14); 
        root.right.left.right = new Node(18);
        
        if (isBST(root)) 
            System.out.println("second tree IS BST"); 
        else
            System.out.println("second tree Not a BST"); 
    } 
}