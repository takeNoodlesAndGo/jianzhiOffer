package unit6;

import bean.TreeNode;

public class Solution2 {
	public boolean IsBalanced_Solution(TreeNode root) {
		if(isBalancedAndGetTreeDepth(root)==-1)//如果等于-1表明不是平衡树
			return false;
		return true;
	}

	private int isBalancedAndGetTreeDepth(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 0;
		int left =  isBalancedAndGetTreeDepth(root.left);
		int right = isBalancedAndGetTreeDepth(root.right);
		if(left==-1||right==-1)
			return -1;
		if(Math.abs(left-right)>1)
			return -1;
		return left>right?(left+1):(right)+1;
	}
}
