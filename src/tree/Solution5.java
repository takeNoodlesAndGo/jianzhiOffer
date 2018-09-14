package tree;

import bean.TreeNode;

public class Solution5 {
	//change commit to 28
	 public TreeNode lastNode = null;
	 public TreeNode Convert(TreeNode pRootOfTree) {
		 convertNode(pRootOfTree);
		 lastNode = pRootOfTree;
		 while(lastNode!=null&&lastNode.left!=null) {
			 lastNode = lastNode.left;
		 }
		 return lastNode;
	 }

	private void convertNode(TreeNode node) {
		// TODO Auto-generated method stub
		if(node==null) {
			return ;
		}
		if(node.left!=null) {
			convertNode(node.left);
		}
		node.left = lastNode;
		if(lastNode!=null) {
			lastNode.right = node;
		}
		lastNode = node;
		if(node.right!=null) {
			convertNode(node.right);
		}
	}
}
