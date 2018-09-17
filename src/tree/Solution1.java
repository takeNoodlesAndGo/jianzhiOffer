package tree;

import bean.TreeNode;

public class Solution1 {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean flag = false;
		if(root1==null||root2==null) {
			if(root1.val == root2.val) {
				flag = match(root1,root2);
			}
			if(!flag) {
				flag = HasSubtree(root1.left, root2);
			}
			if(!flag) {
				flag = HasSubtree(root1.right, root2);
			}
		}
		return flag;
	}

	private boolean match(TreeNode root1, TreeNode root2) {
		// TODO Auto-generated method stub
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.val!=root2.val)
			return false;
		return match(root1.left, root2.left)&&match(root1.right, root2.right);
	}
}
