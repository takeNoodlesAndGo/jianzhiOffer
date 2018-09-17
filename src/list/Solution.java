package list;

import java.util.ArrayList;

import bean.ListNode;

public class Solution {
	//逆序保存链表中的值到ArrayList中
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(listNode!=null){
            list.add(0,listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
}
