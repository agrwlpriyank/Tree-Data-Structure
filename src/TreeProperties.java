
public class TreeProperties {
	/*
	 Interesting point here
	 Height can be considered w.r.t edges or nodes [as mentioned here - https://www.geeksforgeeks.org/binary-tree-set-2-properties/]
	 some sites consider height of a tree with single node as 0 [because it has 0 edges]
	 here have taken height of a tree with single node as 1 [w.r.t nodes]
	 */
	int height(BinaryTreeNode root) {
		//reference - https://www.youtube.com/watch?v=_SiwrPXG9-g
		if(root == null) {
			return 0;
		}
		int left_height = 0;
		int right_height = 0;
		if(root.left != null) {
			left_height = height(root.left);
		}
		if(root.right != null) {
			right_height = height(root.right);
		}
		return 1 + Math.max(left_height, right_height);
	}
	
	/*
	 * A binary tree is balanced if difference of left height and right height for any node is not more than 1
	 */
	boolean balanced(BinaryTreeNode root) {
		if(root == null) {
			return true;
		}
		int left_height = 0;
		int right_height = 0;
		if(root.left != null) {
			left_height = height(root.left);
		}
		if(root.right != null) {
			right_height = height(root.right);
		}
		int balance = left_height - right_height;
		if(balance <= 1 && balance >= -1) {
			return true;
		}
		return false;
	}
}
