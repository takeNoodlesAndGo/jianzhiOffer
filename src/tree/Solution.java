package tree;

import bean.TreeNode;

public class Solution {
	//根据前序和中序序列来重建二叉树
	//采用递归的方式，根据前序的第一个节点找到在中序序列的位置，然后中序序列的前面长度为左子树节点的个数，
	//右边长度为右子树的节点的个数，然后进行递归，每次拿到head节点的值
	  public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        TreeNode head = null;
	        if(pre==null||in==null) {
	        	return null;
	        }
	        head = rebuildTree(pre,in,0,pre.length-1,0,in.length-1);
	        return head;
	  }

	private TreeNode rebuildTree(int[] pre, int[] in, int begin1, int end1, int begin2, int end2) {
		// TODO Auto-generated method stub
		if(begin1>end1||begin2>end2) {
			return null;
		}
		TreeNode head = new TreeNode(pre[begin1]);
		int mid = begin2;
		for(int i=begin2;i<=end2;i++) {
			if(head.val==in[i]) {
				mid = i;
				break;
			}
		}
		head.left = rebuildTree(pre, in, begin1+1, begin1+mid-begin2, begin2, mid-1);
		head.right = rebuildTree(pre, in, begin1+mid-begin2+1, end1, mid+1, end2);
		return head;
	}
}
