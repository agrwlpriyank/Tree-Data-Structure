
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree t = new BinaryTree(); 
        t.root = new BinaryTreeNode(10); 
        t.root.left = new BinaryTreeNode(5); 
        t.root.right = new BinaryTreeNode(6); 
        t.root.right.left = new BinaryTreeNode(8); 
        t.root.right.right = new BinaryTreeNode(7);
        t.root.right.right.right = new BinaryTreeNode(4);
		
        // Tree generation code taken from https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
		BinaryTree tree = new BinaryTree(); 
        tree.root = new BinaryTreeNode(1); 
        tree.root.left = new BinaryTreeNode(2); 
        tree.root.right = new BinaryTreeNode(3); 
        tree.root.right.left = new BinaryTreeNode(4); 
        tree.root.right.right = new BinaryTreeNode(5); 
        
        
        Traversal obj = new Traversal();
        System.out.println("inorder " + obj.inOrder(t.root));
        System.out.println("preorder " + obj.preOrder(t.root));
        System.out.println("postorder " + obj.postOrder(t.root));
        
        
        TreeProperties objH = new TreeProperties();
        //Q1 find the depth of a binary tree
        System.out.println("height " + objH.height(t.root));
        
        //Q2 tell me if a binary tree is balanced or not
        System.out.println("balanced " + objH.balanced(t.root));
        System.out.println("balanced " + objH.balanced(tree.root));
	}

}
