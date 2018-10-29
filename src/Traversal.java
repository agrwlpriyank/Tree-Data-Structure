/*
 * Traversal code for my reference
 * Will add BFS and Best First
 */
public class Traversal {
	String inOrder(BinaryTreeNode root) {
		String s = "";
       if(root != null && root.left != null){
    	   s += inOrder(root.left);
       }
       if(root != null){
           s += Integer.toString(root.val) + " ";
       }
       if(root != null && root.right != null){
    	   s += inOrder(root.right);
       }
       return s;
	}
	
	String preOrder(BinaryTreeNode root)
    {
		String s = "";
       if(root != null){
           s += Integer.toString(root.val) + " ";
       }
       if(root != null && root.left != null){
    	   s += preOrder(root.left);
       }
       if(root != null && root.right != null){
    	   s += preOrder(root.right);
       }
       return s;
    }
	
	String postOrder(BinaryTreeNode root)
    {
		String s = "";
       if(root != null && root.left != null){
    	   s += postOrder(root.left);
       }
       if(root != null && root.right != null){
    	   s += postOrder(root.right);
       }
       if(root != null){
           s += Integer.toString(root.val) + " ";
       }
       return s;
    }

}
