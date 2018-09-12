package tree;

import bean.TreeNode;

public class Solution2 {
	  public void Mirror(TreeNode root) {
	        if(root==null){
	            return;
	        }
	        TreeNode node = root.left;
	        root.left = root.right;
	        root.right = node;
	        Mirror(root.left);
	        Mirror(root.right);
	 }
}
