package tree;
import java.util.*;

import bean.TreeNode;
public class Solution4 {
	ArrayList<ArrayList<Integer>> lilist = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        //����Ϊһ��ǰ����������߿���Ϊһ�����ݷ���ÿ�ν��ڵ��ֵ����list�У�ֱ���ڵ�ΪҶ�ڵ�ʱ���ж�sum��target�Ĺ�ϵ����������ֵ
        if(root==null)
            return lilist;
        list.add(root.val);
        target -= root.val;
        if(target==0&&root.left==null&&root.right==null)
            lilist.add(new ArrayList<Integer>(list));
        FindPath(root.left,target);
        FindPath(root.right,target);
       // target +=root.val;//����Ӳ�������ν������Ӱ����һ���target
        list.remove(list.size()-1);
        return lilist;
    }
}
