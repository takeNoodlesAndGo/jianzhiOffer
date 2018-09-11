package tree;

import bean.TreeNode;

public class Solution {
	//����ǰ��������������ؽ�������
	//���õݹ�ķ�ʽ������ǰ��ĵ�һ���ڵ��ҵ����������е�λ�ã�Ȼ���������е�ǰ�泤��Ϊ�������ڵ�ĸ�����
	//�ұ߳���Ϊ�������Ľڵ�ĸ�����Ȼ����еݹ飬ÿ���õ�head�ڵ��ֵ
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
