package unit6;

import java.util.LinkedList;
import java.util.Queue;

import bean.TreeNode;

public class Solution1 {
	public int TreeDepth(TreeNode root) {
        if(root==null)
        	return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int len = 0;
        while(!queue.isEmpty()) {
        	len++;
        	int size = queue.size();
        	for(int i =0;i<size;i++) {
        		TreeNode node = queue.poll();
        		if(node.left!=null)
        			queue.add(node.left);
        		if(node.right!=null)
        			queue.add(node.right);
        	}
        }
        return len;
    }
}
