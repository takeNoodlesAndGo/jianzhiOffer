package list;

import java.util.ArrayList;

import bean.ListNode;

public class Solution {
	//���򱣴������е�ֵ��ArrayList��
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(listNode!=null){
            list.add(0,listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
}
