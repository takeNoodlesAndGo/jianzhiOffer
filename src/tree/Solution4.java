package tree;
import java.util.*;

import bean.TreeNode;
public class Solution4 {
	ArrayList<ArrayList<Integer>> lilist = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        //考虑为一个前序遍历，或者考虑为一个回溯法，每次将节点的值存在list中，直到节点为叶节点时，判断sum和target的关系，相等则加入值
        if(root==null)
            return lilist;
        list.add(root.val);
        target -= root.val;
        if(target==0&&root.left==null&&root.right==null)
            lilist.add(new ArrayList<Integer>(list));
        FindPath(root.left,target);
        FindPath(root.right,target);
       // target +=root.val;//这里加不加无所谓，不会影响上一层的target
        list.remove(list.size()-1);
        return lilist;
    }
}
